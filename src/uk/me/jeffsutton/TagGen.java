package uk.me.jeffsutton;

import android.net.Uri;
import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;
import uk.me.jeffsutton.model.Datum;
import uk.me.jeffsutton.model.SeriesDetails;
import uk.me.jeffsutton.model.SeriesSearchResponse;
import uk.me.jeffsutton.model.episode.Episode;
import uk.me.jeffsutton.model.episodes.EpisodeList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by jeff on 14/02/2017.
 */
public class TagGen {
    private JTextField textField1;
    private JButton searchButton;
    private JPanel root;
    private JTable table1;
    private JTextField textField2;
    private JButton button1;
    private JButton goButton;

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");
    static OkHttpClient client = new OkHttpClient();
    public static String token;

    public TagGen() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String response = get("https://api.thetvdb.com/search/series?name=" + URLEncoder.encode(textField1.getText()));
                    SeriesSearchResponse ssr = new Gson().fromJson(response, SeriesSearchResponse.class);
                    for (Datum item : ssr.getData()) {
                        System.out.println("Series:\t" + item.getSeriesName());
                    }
                    table1.setModel(ssr);table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogType(JFileChooser.OPEN_DIALOG);
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.setAcceptAllFileFilterUsed(false);
                try {
                    chooser.setSelectedFile(new File(textField2.getText()));
                } catch (Exception ignored) {}
                int result = chooser.showOpenDialog(button1);

                if (result == JFileChooser.APPROVE_OPTION) {
                    textField2.setText(chooser.getSelectedFile().getAbsolutePath().toString());
                }
            }
        });
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeriesSearchResponse ssr = (SeriesSearchResponse) table1.getModel();
                try {
                    String response = get("https://api.thetvdb.com/series/" + ssr.getData().get(table1.getSelectedRow()).getId());
                    System.out.println(response);
                    SeriesDetails seriesDetails = new Gson().fromJson(response, SeriesDetails.class);

                    response = get("https://api.thetvdb.com/series/" + ssr.getData().get(table1.getSelectedRow()).getId() + "/episodes");
                    System.out.println(response);
                    EpisodeList episodeList = new Gson().fromJson(response, EpisodeList.class);

                    if (episodeList.getLinks().getFirst() != episodeList.getLinks().getLast()) {
                        for (int c = episodeList.getLinks().getNext(); c <= episodeList.getLinks().getLast(); c++) {
                            response = get("https://api.thetvdb.com/series/" + ssr.getData().get(table1.getSelectedRow()).getId() + "/episodes?page=" + c);
                            System.out.println(response);
                            EpisodeList episodeListExtra = new Gson().fromJson(response, EpisodeList.class);
                            episodeList.getData().addAll(episodeListExtra.getData());
                        }
                    }

                    for (uk.me.jeffsutton.model.episodes.Datum episode : episodeList.getData()) {
                        response = get("https://api.thetvdb.com/episodes/" + episode.getId());
                        System.out.println(response);

                        Episode episodeDetails = new Gson().fromJson(response, Episode.class);

                        String tags = (generateMKVEpisodeTags(seriesDetails, episodeDetails));

                        String filename = seriesDetails.getData().getSeriesName().replace(" ", ".")
                                + ".s" + episodeDetails.getData().getAiredSeason()
                                + "e" + episodeDetails.getData().getAiredEpisodeNumber()
                                +  "." + episodeDetails.getData().getEpisodeName().replace(" ", ".") + ".xml";
                        filename.replaceAll("[^a-zA-Z0-9.-]", "_");

                        File outFile = new File(textField2.getText(), filename);

                        FileWriter fw = new FileWriter(outFile);
                        fw.write(tags);
                        fw.flush();
                        fw.close();
                    }

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public String generateMKVEpisodeTags(SeriesDetails series, Episode episode) {
        StringBuilder tags = new StringBuilder();

        tags.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!DOCTYPE Tags SYSTEM \"matroskatags.dtd\">\n" +
                "<Tags>");

        // Series Information
        tags.append(" <Tag> <!-- show -->\n" +
                "        <Targets>\n" +
                "            <TargetTypeValue>70</TargetTypeValue>\n" +
                "        </Targets>\n")

         .append("        <Simple>\n" +
                "            <Name>TITLE</Name>\n" +
                "            <String>")
         .append(series.getData().getSeriesName())
         .append("</String>\n" +
                "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>PRODUCTION_STUDIO</Name>\n" +
                        "            <String>")
                .append(series.getData().getNetwork())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>SUMMARY</Name>\n" +
                        "            <String>")
                .append(series.getData().getOverview())
                .append("</String>\n" +
                        "        </Simple>\n");

        if (series.getData().getGenre() != null){
            if (series.getData().getGenre() != null) {
                for (String genre : series.getData().getGenre()) {
                    tags.append("        <Simple>\n" +
                            "            <Name>GENRE</Name>\n" +
                            "            <String>")
                            .append(genre)
                            .append("</String>\n" +
                                    "        </Simple>\n");
                }
            }
        }

          tags.append(
                "    </Tag>\n");


        // Season Information
        tags.append(" <Tag> <!-- season -->\n" +
                "        <Targets>\n" +
                "            <TargetTypeValue>60</TargetTypeValue>\n" +
                "        </Targets>\n")

                .append("        <Simple>\n" +
                        "            <Name>PART_NUMBER</Name>\n" +
                        "            <String>")
                .append(episode.getData().getAiredSeason())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append(
                        "    </Tag>\n");


        // Episode information
        tags.append(" <Tag> <!-- episode -->\n" +
                "        <Targets>\n" +
                "            <TargetTypeValue>50</TargetTypeValue>\n" +
                "        </Targets>\n")

                .append("        <Simple>\n" +
                        "            <Name>PART_NUMBER</Name>\n" +
                        "            <String>")
                .append(episode.getData().getAiredEpisodeNumber())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>TITLE</Name>\n" +
                        "            <String>")
                .append(episode.getData().getEpisodeName())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>SYNOPSIS</Name>\n" +
                        "            <String>")
                .append(episode.getData().getOverview())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>SUMMARY</Name>\n" +
                        "            <String>")
                .append(episode.getData().getOverview())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>DESCRIPTION</Name>\n" +
                        "            <String>")
                .append(episode.getData().getOverview())
                .append("</String>\n" +
                        "        </Simple>\n")

                .append("        <Simple>\n" +
                        "            <Name>DATE_RELEASED</Name>\n" +
                        "            <String>")
                .append(episode.getData().getFirstAired())
                .append("</String>\n" +
                        "        </Simple>\n");




                if (episode.getData().getDirectors() != null) {
                    for (String director : episode.getData().getDirectors()) {
                        tags.append("        <Simple>\n" +
                                "            <Name>DIRECTOR</Name>\n" +
                                "            <String>")
                                .append(director)
                                .append("</String>\n" +
                                        "        </Simple>\n");
                    }
                }
        if (episode.getData().getWriters() != null) {
            for (String writer : episode.getData().getWriters()) {
                tags.append("        <Simple>\n" +
                        "            <Name>WRITTEN_BY</Name>\n" +
                        "            <String>")
                        .append(writer)
                        .append("</String>\n" +
                                "        </Simple>\n");
            }
        }

        if (episode.getData().getGuestStars() != null) {
            for (String star : episode.getData().getGuestStars()) {
                tags.append("        <Simple>\n" +
                        "            <Name>ACTOR</Name>\n" +
                        "            <String>")
                        .append(star)
                        .append("</String>\n" +
                                "        </Simple>\n");
            }
        }


         tags.append("        <Simple>\n" +
                "            <Name>IMDB</Name>\n" +
                "            <String>")
                .append(episode.getData().getImdbId())
                .append("</String>\n" +
                        "        </Simple>\n");

        tags.append("        <Simple>\n" +
                "            <Name>PRODUCTION_CODE</Name>\n" +
                "            <String>")
                .append(episode.getData().getProductionCode())
                .append("</String>\n" +
                        "        </Simple>\n");

        tags.append(
                "    </Tag>\n");


        tags.append("</Tags>");

        return tags.toString();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TagGen");
        TagGen tg = new TagGen();
        frame.setContentPane(tg.root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        String url = "https://api.thetvdb.com/login";
        String payload = "{\"apikey\":\""+Constants.TVDB_API_KEY+"\"}";

        try {
            String response = (post(url.toString(), payload));
            JSONObject obj = new JSONObject(response);
            token = obj.getString("token");
            System.out.println("Token: " + token);
            tg.searchButton.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
            token = "";
        }

    }

    static String get(String url) throws IOException {
        System.out.println(url);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Accept-Language", "en")
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}

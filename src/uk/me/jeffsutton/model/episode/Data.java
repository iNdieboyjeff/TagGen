
package uk.me.jeffsutton.model.episode;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("airedSeason")
    @Expose
    private int airedSeason;
    @SerializedName("airedSeasonID")
    @Expose
    private int airedSeasonID;
    @SerializedName("airedEpisodeNumber")
    @Expose
    private int airedEpisodeNumber;
    @SerializedName("episodeName")
    @Expose
    private String episodeName;
    @SerializedName("firstAired")
    @Expose
    private String firstAired;
    @SerializedName("guestStars")
    @Expose
    @Valid
    private List<String> guestStars = new ArrayList<String>();
    @SerializedName("director")
    @Expose
    private String director;
    @SerializedName("directors")
    @Expose
    @Valid
    private List<String> directors = new ArrayList<String>();
    @SerializedName("writers")
    @Expose
    @Valid
    private List<String> writers = new ArrayList<String>();
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("language")
    @Expose
    @Valid
    private Language language;
    @SerializedName("productionCode")
    @Expose
    private String productionCode;
    @SerializedName("showUrl")
    @Expose
    private String showUrl;
    @SerializedName("lastUpdated")
    @Expose
    private int lastUpdated;
    @SerializedName("dvdDiscid")
    @Expose
    private String dvdDiscid;
    @SerializedName("dvdSeason")
    @Expose
    private Object dvdSeason;
    @SerializedName("dvdEpisodeNumber")
    @Expose
    private Object dvdEpisodeNumber;
    @SerializedName("dvdChapter")
    @Expose
    private Object dvdChapter;
    @SerializedName("absoluteNumber")
    @Expose
    private Object absoluteNumber;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("seriesId")
    @Expose
    private int seriesId;
    @SerializedName("lastUpdatedBy")
    @Expose
    private int lastUpdatedBy;
    @SerializedName("airsAfterSeason")
    @Expose
    private Object airsAfterSeason;
    @SerializedName("airsBeforeSeason")
    @Expose
    private Object airsBeforeSeason;
    @SerializedName("airsBeforeEpisode")
    @Expose
    private Object airsBeforeEpisode;
    @SerializedName("thumbAuthor")
    @Expose
    private int thumbAuthor;
    @SerializedName("thumbAdded")
    @Expose
    private String thumbAdded;
    @SerializedName("thumbWidth")
    @Expose
    private String thumbWidth;
    @SerializedName("thumbHeight")
    @Expose
    private String thumbHeight;
    @SerializedName("imdbId")
    @Expose
    private String imdbId;
    @SerializedName("siteRating")
    @Expose
    private float siteRating;
    @SerializedName("siteRatingCount")
    @Expose
    private int siteRatingCount;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The airedSeason
     */
    public int getAiredSeason() {
        return airedSeason;
    }

    /**
     * 
     * @param airedSeason
     *     The airedSeason
     */
    public void setAiredSeason(int airedSeason) {
        this.airedSeason = airedSeason;
    }

    /**
     * 
     * @return
     *     The airedSeasonID
     */
    public int getAiredSeasonID() {
        return airedSeasonID;
    }

    /**
     * 
     * @param airedSeasonID
     *     The airedSeasonID
     */
    public void setAiredSeasonID(int airedSeasonID) {
        this.airedSeasonID = airedSeasonID;
    }

    /**
     * 
     * @return
     *     The airedEpisodeNumber
     */
    public int getAiredEpisodeNumber() {
        return airedEpisodeNumber;
    }

    /**
     * 
     * @param airedEpisodeNumber
     *     The airedEpisodeNumber
     */
    public void setAiredEpisodeNumber(int airedEpisodeNumber) {
        this.airedEpisodeNumber = airedEpisodeNumber;
    }

    /**
     * 
     * @return
     *     The episodeName
     */
    public String getEpisodeName() {
        return episodeName;
    }

    /**
     * 
     * @param episodeName
     *     The episodeName
     */
    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    /**
     * 
     * @return
     *     The firstAired
     */
    public String getFirstAired() {
        return firstAired;
    }

    /**
     * 
     * @param firstAired
     *     The firstAired
     */
    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    /**
     * 
     * @return
     *     The guestStars
     */
    public List<String> getGuestStars() {
        return guestStars;
    }

    /**
     * 
     * @param guestStars
     *     The guestStars
     */
    public void setGuestStars(List<String> guestStars) {
        this.guestStars = guestStars;
    }

    /**
     * 
     * @return
     *     The director
     */
    public String getDirector() {
        return director;
    }

    /**
     * 
     * @param director
     *     The director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * 
     * @return
     *     The directors
     */
    public List<String> getDirectors() {
        return directors;
    }

    /**
     * 
     * @param directors
     *     The directors
     */
    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    /**
     * 
     * @return
     *     The writers
     */
    public List<String> getWriters() {
        return writers;
    }

    /**
     * 
     * @param writers
     *     The writers
     */
    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    /**
     * 
     * @return
     *     The overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 
     * @param overview
     *     The overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * 
     * @return
     *     The language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The productionCode
     */
    public String getProductionCode() {
        return productionCode;
    }

    /**
     * 
     * @param productionCode
     *     The productionCode
     */
    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    /**
     * 
     * @return
     *     The showUrl
     */
    public String getShowUrl() {
        return showUrl;
    }

    /**
     * 
     * @param showUrl
     *     The showUrl
     */
    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    /**
     * 
     * @return
     *     The lastUpdated
     */
    public int getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * @param lastUpdated
     *     The lastUpdated
     */
    public void setLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * @return
     *     The dvdDiscid
     */
    public String getDvdDiscid() {
        return dvdDiscid;
    }

    /**
     * 
     * @param dvdDiscid
     *     The dvdDiscid
     */
    public void setDvdDiscid(String dvdDiscid) {
        this.dvdDiscid = dvdDiscid;
    }

    /**
     * 
     * @return
     *     The dvdSeason
     */
    public Object getDvdSeason() {
        return dvdSeason;
    }

    /**
     * 
     * @param dvdSeason
     *     The dvdSeason
     */
    public void setDvdSeason(Object dvdSeason) {
        this.dvdSeason = dvdSeason;
    }

    /**
     * 
     * @return
     *     The dvdEpisodeNumber
     */
    public Object getDvdEpisodeNumber() {
        return dvdEpisodeNumber;
    }

    /**
     * 
     * @param dvdEpisodeNumber
     *     The dvdEpisodeNumber
     */
    public void setDvdEpisodeNumber(Object dvdEpisodeNumber) {
        this.dvdEpisodeNumber = dvdEpisodeNumber;
    }

    /**
     * 
     * @return
     *     The dvdChapter
     */
    public Object getDvdChapter() {
        return dvdChapter;
    }

    /**
     * 
     * @param dvdChapter
     *     The dvdChapter
     */
    public void setDvdChapter(Object dvdChapter) {
        this.dvdChapter = dvdChapter;
    }

    /**
     * 
     * @return
     *     The absoluteNumber
     */
    public Object getAbsoluteNumber() {
        return absoluteNumber;
    }

    /**
     * 
     * @param absoluteNumber
     *     The absoluteNumber
     */
    public void setAbsoluteNumber(Object absoluteNumber) {
        this.absoluteNumber = absoluteNumber;
    }

    /**
     * 
     * @return
     *     The filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 
     * @param filename
     *     The filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return
     *     The seriesId
     */
    public int getSeriesId() {
        return seriesId;
    }

    /**
     * 
     * @param seriesId
     *     The seriesId
     */
    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * 
     * @return
     *     The lastUpdatedBy
     */
    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * 
     * @param lastUpdatedBy
     *     The lastUpdatedBy
     */
    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * 
     * @return
     *     The airsAfterSeason
     */
    public Object getAirsAfterSeason() {
        return airsAfterSeason;
    }

    /**
     * 
     * @param airsAfterSeason
     *     The airsAfterSeason
     */
    public void setAirsAfterSeason(Object airsAfterSeason) {
        this.airsAfterSeason = airsAfterSeason;
    }

    /**
     * 
     * @return
     *     The airsBeforeSeason
     */
    public Object getAirsBeforeSeason() {
        return airsBeforeSeason;
    }

    /**
     * 
     * @param airsBeforeSeason
     *     The airsBeforeSeason
     */
    public void setAirsBeforeSeason(Object airsBeforeSeason) {
        this.airsBeforeSeason = airsBeforeSeason;
    }

    /**
     * 
     * @return
     *     The airsBeforeEpisode
     */
    public Object getAirsBeforeEpisode() {
        return airsBeforeEpisode;
    }

    /**
     * 
     * @param airsBeforeEpisode
     *     The airsBeforeEpisode
     */
    public void setAirsBeforeEpisode(Object airsBeforeEpisode) {
        this.airsBeforeEpisode = airsBeforeEpisode;
    }

    /**
     * 
     * @return
     *     The thumbAuthor
     */
    public int getThumbAuthor() {
        return thumbAuthor;
    }

    /**
     * 
     * @param thumbAuthor
     *     The thumbAuthor
     */
    public void setThumbAuthor(int thumbAuthor) {
        this.thumbAuthor = thumbAuthor;
    }

    /**
     * 
     * @return
     *     The thumbAdded
     */
    public String getThumbAdded() {
        return thumbAdded;
    }

    /**
     * 
     * @param thumbAdded
     *     The thumbAdded
     */
    public void setThumbAdded(String thumbAdded) {
        this.thumbAdded = thumbAdded;
    }

    /**
     * 
     * @return
     *     The thumbWidth
     */
    public String getThumbWidth() {
        return thumbWidth;
    }

    /**
     * 
     * @param thumbWidth
     *     The thumbWidth
     */
    public void setThumbWidth(String thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    /**
     * 
     * @return
     *     The thumbHeight
     */
    public String getThumbHeight() {
        return thumbHeight;
    }

    /**
     * 
     * @param thumbHeight
     *     The thumbHeight
     */
    public void setThumbHeight(String thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    /**
     * 
     * @return
     *     The imdbId
     */
    public String getImdbId() {
        return imdbId;
    }

    /**
     * 
     * @param imdbId
     *     The imdbId
     */
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    /**
     * 
     * @return
     *     The siteRating
     */
    public float getSiteRating() {
        return siteRating;
    }

    /**
     * 
     * @param siteRating
     *     The siteRating
     */
    public void setSiteRating(int siteRating) {
        this.siteRating = siteRating;
    }

    /**
     * 
     * @return
     *     The siteRatingCount
     */
    public int getSiteRatingCount() {
        return siteRatingCount;
    }

    /**
     * 
     * @param siteRatingCount
     *     The siteRatingCount
     */
    public void setSiteRatingCount(int siteRatingCount) {
        this.siteRatingCount = siteRatingCount;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("id".equals(name)) {
            if (value instanceof Integer) {
                setId(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"id\" is of type \"int\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("airedSeason".equals(name)) {
                if (value instanceof Integer) {
                    setAiredSeason(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"airedSeason\" is of type \"int\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("airedSeasonID".equals(name)) {
                    if (value instanceof Integer) {
                        setAiredSeasonID(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"airedSeasonID\" is of type \"int\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("airedEpisodeNumber".equals(name)) {
                        if (value instanceof Integer) {
                            setAiredEpisodeNumber(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"airedEpisodeNumber\" is of type \"int\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("episodeName".equals(name)) {
                            if (value instanceof String) {
                                setEpisodeName(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"episodeName\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("firstAired".equals(name)) {
                                if (value instanceof String) {
                                    setFirstAired(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"firstAired\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("guestStars".equals(name)) {
                                    if (value instanceof List) {
                                        setGuestStars(((List<String> ) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"guestStars\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("director".equals(name)) {
                                        if (value instanceof String) {
                                            setDirector(((String) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"director\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("directors".equals(name)) {
                                            if (value instanceof List) {
                                                setDirectors(((List<String> ) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"directors\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("writers".equals(name)) {
                                                if (value instanceof List) {
                                                    setWriters(((List<String> ) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"writers\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("overview".equals(name)) {
                                                    if (value instanceof String) {
                                                        setOverview(((String) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"overview\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("language".equals(name)) {
                                                        if (value instanceof Language) {
                                                            setLanguage(((Language) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"language\" is of type \"uk.me.jeffsutton.model.episode.Language\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("productionCode".equals(name)) {
                                                            if (value instanceof String) {
                                                                setProductionCode(((String) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"productionCode\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("showUrl".equals(name)) {
                                                                if (value instanceof String) {
                                                                    setShowUrl(((String) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"showUrl\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("lastUpdated".equals(name)) {
                                                                    if (value instanceof Integer) {
                                                                        setLastUpdated(((Integer) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"lastUpdated\" is of type \"int\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("dvdDiscid".equals(name)) {
                                                                        if (value instanceof String) {
                                                                            setDvdDiscid(((String) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"dvdDiscid\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("dvdSeason".equals(name)) {
                                                                            if (value instanceof Object) {
                                                                                setDvdSeason(((Object) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"dvdSeason\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("dvdEpisodeNumber".equals(name)) {
                                                                                if (value instanceof Object) {
                                                                                    setDvdEpisodeNumber(((Object) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"dvdEpisodeNumber\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("dvdChapter".equals(name)) {
                                                                                    if (value instanceof Object) {
                                                                                        setDvdChapter(((Object) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"dvdChapter\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                    }
                                                                                    return true;
                                                                                } else {
                                                                                    if ("absoluteNumber".equals(name)) {
                                                                                        if (value instanceof Object) {
                                                                                            setAbsoluteNumber(((Object) value));
                                                                                        } else {
                                                                                            throw new IllegalArgumentException(("property \"absoluteNumber\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                        }
                                                                                        return true;
                                                                                    } else {
                                                                                        if ("filename".equals(name)) {
                                                                                            if (value instanceof String) {
                                                                                                setFilename(((String) value));
                                                                                            } else {
                                                                                                throw new IllegalArgumentException(("property \"filename\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                            }
                                                                                            return true;
                                                                                        } else {
                                                                                            if ("seriesId".equals(name)) {
                                                                                                if (value instanceof Integer) {
                                                                                                    setSeriesId(((Integer) value));
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException(("property \"seriesId\" is of type \"int\", but got "+ value.getClass().toString()));
                                                                                                }
                                                                                                return true;
                                                                                            } else {
                                                                                                if ("lastUpdatedBy".equals(name)) {
                                                                                                    if (value instanceof Integer) {
                                                                                                        setLastUpdatedBy(((Integer) value));
                                                                                                    } else {
                                                                                                        throw new IllegalArgumentException(("property \"lastUpdatedBy\" is of type \"int\", but got "+ value.getClass().toString()));
                                                                                                    }
                                                                                                    return true;
                                                                                                } else {
                                                                                                    if ("airsAfterSeason".equals(name)) {
                                                                                                        if (value instanceof Object) {
                                                                                                            setAirsAfterSeason(((Object) value));
                                                                                                        } else {
                                                                                                            throw new IllegalArgumentException(("property \"airsAfterSeason\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                                        }
                                                                                                        return true;
                                                                                                    } else {
                                                                                                        if ("airsBeforeSeason".equals(name)) {
                                                                                                            if (value instanceof Object) {
                                                                                                                setAirsBeforeSeason(((Object) value));
                                                                                                            } else {
                                                                                                                throw new IllegalArgumentException(("property \"airsBeforeSeason\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                                            }
                                                                                                            return true;
                                                                                                        } else {
                                                                                                            if ("airsBeforeEpisode".equals(name)) {
                                                                                                                if (value instanceof Object) {
                                                                                                                    setAirsBeforeEpisode(((Object) value));
                                                                                                                } else {
                                                                                                                    throw new IllegalArgumentException(("property \"airsBeforeEpisode\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                                                }
                                                                                                                return true;
                                                                                                            } else {
                                                                                                                if ("thumbAuthor".equals(name)) {
                                                                                                                    if (value instanceof Integer) {
                                                                                                                        setThumbAuthor(((Integer) value));
                                                                                                                    } else {
                                                                                                                        throw new IllegalArgumentException(("property \"thumbAuthor\" is of type \"int\", but got "+ value.getClass().toString()));
                                                                                                                    }
                                                                                                                    return true;
                                                                                                                } else {
                                                                                                                    if ("thumbAdded".equals(name)) {
                                                                                                                        if (value instanceof String) {
                                                                                                                            setThumbAdded(((String) value));
                                                                                                                        } else {
                                                                                                                            throw new IllegalArgumentException(("property \"thumbAdded\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                                                        }
                                                                                                                        return true;
                                                                                                                    } else {
                                                                                                                        if ("thumbWidth".equals(name)) {
                                                                                                                            if (value instanceof String) {
                                                                                                                                setThumbWidth(((String) value));
                                                                                                                            } else {
                                                                                                                                throw new IllegalArgumentException(("property \"thumbWidth\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                                                            }
                                                                                                                            return true;
                                                                                                                        } else {
                                                                                                                            if ("thumbHeight".equals(name)) {
                                                                                                                                if (value instanceof String) {
                                                                                                                                    setThumbHeight(((String) value));
                                                                                                                                } else {
                                                                                                                                    throw new IllegalArgumentException(("property \"thumbHeight\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                                                                }
                                                                                                                                return true;
                                                                                                                            } else {
                                                                                                                                if ("imdbId".equals(name)) {
                                                                                                                                    if (value instanceof String) {
                                                                                                                                        setImdbId(((String) value));
                                                                                                                                    } else {
                                                                                                                                        throw new IllegalArgumentException(("property \"imdbId\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                                                                    }
                                                                                                                                    return true;
                                                                                                                                } else {
                                                                                                                                    if ("siteRating".equals(name)) {
                                                                                                                                        if (value instanceof Integer) {
                                                                                                                                            setSiteRating(((Integer) value));
                                                                                                                                        } else {
                                                                                                                                            throw new IllegalArgumentException(("property \"siteRating\" is of type \"int\", but got "+ value.getClass().toString()));
                                                                                                                                        }
                                                                                                                                        return true;
                                                                                                                                    } else {
                                                                                                                                        if ("siteRatingCount".equals(name)) {
                                                                                                                                            if (value instanceof Integer) {
                                                                                                                                                setSiteRatingCount(((Integer) value));
                                                                                                                                            } else {
                                                                                                                                                throw new IllegalArgumentException(("property \"siteRatingCount\" is of type \"int\", but got "+ value.getClass().toString()));
                                                                                                                                            }
                                                                                                                                            return true;
                                                                                                                                        } else {
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("id".equals(name)) {
            return getId();
        } else {
            if ("airedSeason".equals(name)) {
                return getAiredSeason();
            } else {
                if ("airedSeasonID".equals(name)) {
                    return getAiredSeasonID();
                } else {
                    if ("airedEpisodeNumber".equals(name)) {
                        return getAiredEpisodeNumber();
                    } else {
                        if ("episodeName".equals(name)) {
                            return getEpisodeName();
                        } else {
                            if ("firstAired".equals(name)) {
                                return getFirstAired();
                            } else {
                                if ("guestStars".equals(name)) {
                                    return getGuestStars();
                                } else {
                                    if ("director".equals(name)) {
                                        return getDirector();
                                    } else {
                                        if ("directors".equals(name)) {
                                            return getDirectors();
                                        } else {
                                            if ("writers".equals(name)) {
                                                return getWriters();
                                            } else {
                                                if ("overview".equals(name)) {
                                                    return getOverview();
                                                } else {
                                                    if ("language".equals(name)) {
                                                        return getLanguage();
                                                    } else {
                                                        if ("productionCode".equals(name)) {
                                                            return getProductionCode();
                                                        } else {
                                                            if ("showUrl".equals(name)) {
                                                                return getShowUrl();
                                                            } else {
                                                                if ("lastUpdated".equals(name)) {
                                                                    return getLastUpdated();
                                                                } else {
                                                                    if ("dvdDiscid".equals(name)) {
                                                                        return getDvdDiscid();
                                                                    } else {
                                                                        if ("dvdSeason".equals(name)) {
                                                                            return getDvdSeason();
                                                                        } else {
                                                                            if ("dvdEpisodeNumber".equals(name)) {
                                                                                return getDvdEpisodeNumber();
                                                                            } else {
                                                                                if ("dvdChapter".equals(name)) {
                                                                                    return getDvdChapter();
                                                                                } else {
                                                                                    if ("absoluteNumber".equals(name)) {
                                                                                        return getAbsoluteNumber();
                                                                                    } else {
                                                                                        if ("filename".equals(name)) {
                                                                                            return getFilename();
                                                                                        } else {
                                                                                            if ("seriesId".equals(name)) {
                                                                                                return getSeriesId();
                                                                                            } else {
                                                                                                if ("lastUpdatedBy".equals(name)) {
                                                                                                    return getLastUpdatedBy();
                                                                                                } else {
                                                                                                    if ("airsAfterSeason".equals(name)) {
                                                                                                        return getAirsAfterSeason();
                                                                                                    } else {
                                                                                                        if ("airsBeforeSeason".equals(name)) {
                                                                                                            return getAirsBeforeSeason();
                                                                                                        } else {
                                                                                                            if ("airsBeforeEpisode".equals(name)) {
                                                                                                                return getAirsBeforeEpisode();
                                                                                                            } else {
                                                                                                                if ("thumbAuthor".equals(name)) {
                                                                                                                    return getThumbAuthor();
                                                                                                                } else {
                                                                                                                    if ("thumbAdded".equals(name)) {
                                                                                                                        return getThumbAdded();
                                                                                                                    } else {
                                                                                                                        if ("thumbWidth".equals(name)) {
                                                                                                                            return getThumbWidth();
                                                                                                                        } else {
                                                                                                                            if ("thumbHeight".equals(name)) {
                                                                                                                                return getThumbHeight();
                                                                                                                            } else {
                                                                                                                                if ("imdbId".equals(name)) {
                                                                                                                                    return getImdbId();
                                                                                                                                } else {
                                                                                                                                    if ("siteRating".equals(name)) {
                                                                                                                                        return getSiteRating();
                                                                                                                                    } else {
                                                                                                                                        if ("siteRatingCount".equals(name)) {
                                                                                                                                            return getSiteRatingCount();
                                                                                                                                        } else {
                                                                                                                                            return notFoundValue;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Data.NOT_FOUND_VALUE);
        if (Data.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

}

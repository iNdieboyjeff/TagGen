
package uk.me.jeffsutton.model.episodes;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EpisodeList {

    @SerializedName("links")
    @Expose
    @Valid
    private Links links;
    @SerializedName("data")
    @Expose
    @Valid
    private List<Datum> data = new ArrayList<Datum>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("links".equals(name)) {
            if (value instanceof Links) {
                setLinks(((Links) value));
            } else {
                throw new IllegalArgumentException(("property \"links\" is of type \"uk.me.jeffsutton.model.episodes.Links\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("data".equals(name)) {
                if (value instanceof List) {
                    setData(((List<Datum> ) value));
                } else {
                    throw new IllegalArgumentException(("property \"data\" is of type \"java.util.List<uk.me.jeffsutton.model.episodes.Datum>\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("links".equals(name)) {
            return getLinks();
        } else {
            if ("data".equals(name)) {
                return getData();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, EpisodeList.NOT_FOUND_VALUE);
        if (EpisodeList.NOT_FOUND_VALUE!= value) {
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


package uk.me.jeffsutton.model.episode;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Language {

    @SerializedName("episodeName")
    @Expose
    private String episodeName;
    @SerializedName("overview")
    @Expose
    private String overview;
    protected final static Object NOT_FOUND_VALUE = new Object();

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

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("episodeName".equals(name)) {
            if (value instanceof String) {
                setEpisodeName(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"episodeName\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
                return false;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("episodeName".equals(name)) {
            return getEpisodeName();
        } else {
            if ("overview".equals(name)) {
                return getOverview();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Language.NOT_FOUND_VALUE);
        if (Language.NOT_FOUND_VALUE!= value) {
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

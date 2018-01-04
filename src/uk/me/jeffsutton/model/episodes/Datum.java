
package uk.me.jeffsutton.model.episodes;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Datum {

    @SerializedName("absoluteNumber")
    @Expose
    private Object absoluteNumber;
    @SerializedName("airedEpisodeNumber")
    @Expose
    private int airedEpisodeNumber;
    @SerializedName("airedSeason")
    @Expose
    private int airedSeason;
    @SerializedName("airedSeasonID")
    @Expose
    private int airedSeasonID;
    @SerializedName("dvdEpisodeNumber")
    @Expose
    private Object dvdEpisodeNumber;
    @SerializedName("dvdSeason")
    @Expose
    private Object dvdSeason;
    @SerializedName("episodeName")
    @Expose
    private String episodeName;
    @SerializedName("firstAired")
    @Expose
    private String firstAired;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("language")
    @Expose
    @Valid
    private Language language;
    @SerializedName("lastUpdated")
    @Expose
    private int lastUpdated;
    @SerializedName("overview")
    @Expose
    private String overview;
    protected final static Object NOT_FOUND_VALUE = new Object();

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
        if ("absoluteNumber".equals(name)) {
            if (value instanceof Object) {
                setAbsoluteNumber(((Object) value));
            } else {
                throw new IllegalArgumentException(("property \"absoluteNumber\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
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
                        if ("dvdEpisodeNumber".equals(name)) {
                            if (value instanceof Object) {
                                setDvdEpisodeNumber(((Object) value));
                            } else {
                                throw new IllegalArgumentException(("property \"dvdEpisodeNumber\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
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
                                        if ("id".equals(name)) {
                                            if (value instanceof Integer) {
                                                setId(((Integer) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"id\" is of type \"int\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("language".equals(name)) {
                                                if (value instanceof Language) {
                                                    setLanguage(((Language) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"language\" is of type \"uk.me.jeffsutton.model.episodes.Language\", but got "+ value.getClass().toString()));
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
        if ("absoluteNumber".equals(name)) {
            return getAbsoluteNumber();
        } else {
            if ("airedEpisodeNumber".equals(name)) {
                return getAiredEpisodeNumber();
            } else {
                if ("airedSeason".equals(name)) {
                    return getAiredSeason();
                } else {
                    if ("airedSeasonID".equals(name)) {
                        return getAiredSeasonID();
                    } else {
                        if ("dvdEpisodeNumber".equals(name)) {
                            return getDvdEpisodeNumber();
                        } else {
                            if ("dvdSeason".equals(name)) {
                                return getDvdSeason();
                            } else {
                                if ("episodeName".equals(name)) {
                                    return getEpisodeName();
                                } else {
                                    if ("firstAired".equals(name)) {
                                        return getFirstAired();
                                    } else {
                                        if ("id".equals(name)) {
                                            return getId();
                                        } else {
                                            if ("language".equals(name)) {
                                                return getLanguage();
                                            } else {
                                                if ("lastUpdated".equals(name)) {
                                                    return getLastUpdated();
                                                } else {
                                                    if ("overview".equals(name)) {
                                                        return getOverview();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Datum.NOT_FOUND_VALUE);
        if (Datum.NOT_FOUND_VALUE!= value) {
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

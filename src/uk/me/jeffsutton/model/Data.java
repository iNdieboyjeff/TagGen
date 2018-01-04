
package uk.me.jeffsutton.model;

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
    @SerializedName("seriesName")
    @Expose
    private String seriesName;
    @SerializedName("aliases")
    @Expose
    @Valid
    private List<String> aliases = new ArrayList<String>();
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("seriesId")
    @Expose
    private String seriesId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("firstAired")
    @Expose
    private String firstAired;
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("networkId")
    @Expose
    private String networkId;
    @SerializedName("runtime")
    @Expose
    private String runtime;
    @SerializedName("genre")
    @Expose
    @Valid
    private List<String> genre = new ArrayList<String>();
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("lastUpdated")
    @Expose
    private int lastUpdated;
    @SerializedName("airsDayOfWeek")
    @Expose
    private String airsDayOfWeek;
    @SerializedName("airsTime")
    @Expose
    private String airsTime;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("imdbId")
    @Expose
    private String imdbId;
    @SerializedName("zap2itId")
    @Expose
    private String zap2itId;
    @SerializedName("added")
    @Expose
    private String added;
    @SerializedName("addedBy")
    @Expose
    private Object addedBy;
    @SerializedName("siteRating")
    @Expose
    private double siteRating;
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
     *     The seriesName
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * 
     * @param seriesName
     *     The seriesName
     */
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * 
     * @return
     *     The aliases
     */
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * 
     * @param aliases
     *     The aliases
     */
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * 
     * @return
     *     The banner
     */
    public String getBanner() {
        return banner;
    }

    /**
     * 
     * @param banner
     *     The banner
     */
    public void setBanner(String banner) {
        this.banner = banner;
    }

    /**
     * 
     * @return
     *     The seriesId
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * 
     * @param seriesId
     *     The seriesId
     */
    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
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
     *     The network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * 
     * @param network
     *     The network
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * 
     * @return
     *     The networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * 
     * @param networkId
     *     The networkId
     */
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * 
     * @return
     *     The runtime
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * 
     * @param runtime
     *     The runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * 
     * @return
     *     The genre
     */
    public List<String> getGenre() {
        return genre;
    }

    /**
     * 
     * @param genre
     *     The genre
     */
    public void setGenre(List<String> genre) {
        this.genre = genre;
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
     *     The airsDayOfWeek
     */
    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    /**
     * 
     * @param airsDayOfWeek
     *     The airsDayOfWeek
     */
    public void setAirsDayOfWeek(String airsDayOfWeek) {
        this.airsDayOfWeek = airsDayOfWeek;
    }

    /**
     * 
     * @return
     *     The airsTime
     */
    public String getAirsTime() {
        return airsTime;
    }

    /**
     * 
     * @param airsTime
     *     The airsTime
     */
    public void setAirsTime(String airsTime) {
        this.airsTime = airsTime;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
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
     *     The zap2itId
     */
    public String getZap2itId() {
        return zap2itId;
    }

    /**
     * 
     * @param zap2itId
     *     The zap2itId
     */
    public void setZap2itId(String zap2itId) {
        this.zap2itId = zap2itId;
    }

    /**
     * 
     * @return
     *     The added
     */
    public String getAdded() {
        return added;
    }

    /**
     * 
     * @param added
     *     The added
     */
    public void setAdded(String added) {
        this.added = added;
    }

    /**
     * 
     * @return
     *     The addedBy
     */
    public Object getAddedBy() {
        return addedBy;
    }

    /**
     * 
     * @param addedBy
     *     The addedBy
     */
    public void setAddedBy(Object addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * 
     * @return
     *     The siteRating
     */
    public double getSiteRating() {
        return siteRating;
    }

    /**
     * 
     * @param siteRating
     *     The siteRating
     */
    public void setSiteRating(double siteRating) {
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
            if ("seriesName".equals(name)) {
                if (value instanceof String) {
                    setSeriesName(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"seriesName\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("aliases".equals(name)) {
                    if (value instanceof List) {
                        setAliases(((List<String> ) value));
                    } else {
                        throw new IllegalArgumentException(("property \"aliases\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("banner".equals(name)) {
                        if (value instanceof String) {
                            setBanner(((String) value));
                        } else {
                            throw new IllegalArgumentException(("property \"banner\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("seriesId".equals(name)) {
                            if (value instanceof String) {
                                setSeriesId(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"seriesId\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("status".equals(name)) {
                                if (value instanceof String) {
                                    setStatus(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"status\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
                                    if ("network".equals(name)) {
                                        if (value instanceof String) {
                                            setNetwork(((String) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"network\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("networkId".equals(name)) {
                                            if (value instanceof String) {
                                                setNetworkId(((String) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"networkId\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("runtime".equals(name)) {
                                                if (value instanceof String) {
                                                    setRuntime(((String) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"runtime\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("genre".equals(name)) {
                                                    if (value instanceof List) {
                                                        setGenre(((List<String> ) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"genre\" is of type \"java.util.List<java.lang.String>\", but got "+ value.getClass().toString()));
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
                                                        if ("lastUpdated".equals(name)) {
                                                            if (value instanceof Integer) {
                                                                setLastUpdated(((Integer) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"lastUpdated\" is of type \"int\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("airsDayOfWeek".equals(name)) {
                                                                if (value instanceof String) {
                                                                    setAirsDayOfWeek(((String) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"airsDayOfWeek\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("airsTime".equals(name)) {
                                                                    if (value instanceof String) {
                                                                        setAirsTime(((String) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"airsTime\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("rating".equals(name)) {
                                                                        if (value instanceof String) {
                                                                            setRating(((String) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"rating\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
                                                                            if ("zap2itId".equals(name)) {
                                                                                if (value instanceof String) {
                                                                                    setZap2itId(((String) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"zap2itId\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("added".equals(name)) {
                                                                                    if (value instanceof String) {
                                                                                        setAdded(((String) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"added\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                                    }
                                                                                    return true;
                                                                                } else {
                                                                                    if ("addedBy".equals(name)) {
                                                                                        if (value instanceof Object) {
                                                                                            setAddedBy(((Object) value));
                                                                                        } else {
                                                                                            throw new IllegalArgumentException(("property \"addedBy\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                                                        }
                                                                                        return true;
                                                                                    } else {
                                                                                        if ("siteRating".equals(name)) {
                                                                                            if (value instanceof Double) {
                                                                                                setSiteRating(((Double) value));
                                                                                            } else {
                                                                                                throw new IllegalArgumentException(("property \"siteRating\" is of type \"double\", but got "+ value.getClass().toString()));
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

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("id".equals(name)) {
            return getId();
        } else {
            if ("seriesName".equals(name)) {
                return getSeriesName();
            } else {
                if ("aliases".equals(name)) {
                    return getAliases();
                } else {
                    if ("banner".equals(name)) {
                        return getBanner();
                    } else {
                        if ("seriesId".equals(name)) {
                            return getSeriesId();
                        } else {
                            if ("status".equals(name)) {
                                return getStatus();
                            } else {
                                if ("firstAired".equals(name)) {
                                    return getFirstAired();
                                } else {
                                    if ("network".equals(name)) {
                                        return getNetwork();
                                    } else {
                                        if ("networkId".equals(name)) {
                                            return getNetworkId();
                                        } else {
                                            if ("runtime".equals(name)) {
                                                return getRuntime();
                                            } else {
                                                if ("genre".equals(name)) {
                                                    return getGenre();
                                                } else {
                                                    if ("overview".equals(name)) {
                                                        return getOverview();
                                                    } else {
                                                        if ("lastUpdated".equals(name)) {
                                                            return getLastUpdated();
                                                        } else {
                                                            if ("airsDayOfWeek".equals(name)) {
                                                                return getAirsDayOfWeek();
                                                            } else {
                                                                if ("airsTime".equals(name)) {
                                                                    return getAirsTime();
                                                                } else {
                                                                    if ("rating".equals(name)) {
                                                                        return getRating();
                                                                    } else {
                                                                        if ("imdbId".equals(name)) {
                                                                            return getImdbId();
                                                                        } else {
                                                                            if ("zap2itId".equals(name)) {
                                                                                return getZap2itId();
                                                                            } else {
                                                                                if ("added".equals(name)) {
                                                                                    return getAdded();
                                                                                } else {
                                                                                    if ("addedBy".equals(name)) {
                                                                                        return getAddedBy();
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

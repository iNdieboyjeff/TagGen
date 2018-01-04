
package uk.me.jeffsutton.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Datum {

    @SerializedName("aliases")
    @Expose
    @Valid
    private List<Object> aliases = new ArrayList<Object>();
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("firstAired")
    @Expose
    private String firstAired;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("seriesName")
    @Expose
    private String seriesName;
    @SerializedName("status")
    @Expose
    private String status;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The aliases
     */
    public List<Object> getAliases() {
        return aliases;
    }

    /**
     * 
     * @param aliases
     *     The aliases
     */
    public void setAliases(List<Object> aliases) {
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

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("aliases".equals(name)) {
            if (value instanceof List) {
                setAliases(((List<Object> ) value));
            } else {
                throw new IllegalArgumentException(("property \"aliases\" is of type \"java.util.List<java.lang.Object>\", but got "+ value.getClass().toString()));
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
                        if ("network".equals(name)) {
                            if (value instanceof String) {
                                setNetwork(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"network\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
                                if ("seriesName".equals(name)) {
                                    if (value instanceof String) {
                                        setSeriesName(((String) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"seriesName\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("aliases".equals(name)) {
            return getAliases();
        } else {
            if ("banner".equals(name)) {
                return getBanner();
            } else {
                if ("firstAired".equals(name)) {
                    return getFirstAired();
                } else {
                    if ("id".equals(name)) {
                        return getId();
                    } else {
                        if ("network".equals(name)) {
                            return getNetwork();
                        } else {
                            if ("overview".equals(name)) {
                                return getOverview();
                            } else {
                                if ("seriesName".equals(name)) {
                                    return getSeriesName();
                                } else {
                                    if ("status".equals(name)) {
                                        return getStatus();
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

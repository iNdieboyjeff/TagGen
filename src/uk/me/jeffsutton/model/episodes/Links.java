
package uk.me.jeffsutton.model.episodes;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Links {

    @SerializedName("first")
    @Expose
    private int first;
    @SerializedName("last")
    @Expose
    private int last;
    @SerializedName("next")
    @Expose
    private int next;
    @SerializedName("prev")
    @Expose
    private Object prev;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The first
     */
    public int getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     The last
     */
    public int getLast() {
        return last;
    }

    /**
     * 
     * @param last
     *     The last
     */
    public void setLast(int last) {
        this.last = last;
    }

    /**
     * 
     * @return
     *     The next
     */
    public int getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    public void setNext(int next) {
        this.next = next;
    }

    /**
     * 
     * @return
     *     The prev
     */
    public Object getPrev() {
        return prev;
    }

    /**
     * 
     * @param prev
     *     The prev
     */
    public void setPrev(Object prev) {
        this.prev = prev;
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected boolean declaredProperty(String name, Object value) {
        if ("first".equals(name)) {
            if (value instanceof Integer) {
                setFirst(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"first\" is of type \"int\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("last".equals(name)) {
                if (value instanceof Integer) {
                    setLast(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"last\" is of type \"int\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("next".equals(name)) {
                    if (value instanceof Integer) {
                        setNext(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"next\" is of type \"int\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("prev".equals(name)) {
                        if (value instanceof Object) {
                            setPrev(((Object) value));
                        } else {
                            throw new IllegalArgumentException(("property \"prev\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("first".equals(name)) {
            return getFirst();
        } else {
            if ("last".equals(name)) {
                return getLast();
            } else {
                if ("next".equals(name)) {
                    return getNext();
                } else {
                    if ("prev".equals(name)) {
                        return getPrev();
                    } else {
                        return notFoundValue;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Links.NOT_FOUND_VALUE);
        if (Links.NOT_FOUND_VALUE!= value) {
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

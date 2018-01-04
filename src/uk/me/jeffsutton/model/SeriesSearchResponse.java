
package uk.me.jeffsutton.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.swing.table.AbstractTableModel;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SeriesSearchResponse extends AbstractTableModel {

    @SerializedName("data")
    @Expose
    @Valid
    private List<Datum> data = new ArrayList<Datum>();
    protected final static Object NOT_FOUND_VALUE = new Object();

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
        if ("data".equals(name)) {
            if (value instanceof List) {
                setData(((List<Datum> ) value));
            } else {
                throw new IllegalArgumentException(("property \"data\" is of type \"java.util.List<uk.me.jeffsutton.model.Datum>\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("data".equals(name)) {
            return getData();
        } else {
            return notFoundValue;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, SeriesSearchResponse.NOT_FOUND_VALUE);
        if (SeriesSearchResponse.NOT_FOUND_VALUE!= value) {
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

    @Override
    public int getRowCount() {
        if (getData() != null) {
            return getData().size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Datum item = getData().get(rowIndex);
        switch ((columnIndex)) {
            case 0:
                return item.getSeriesName();
            case 1:
                return item.getFirstAired();
            case 2:
                return item.getNetwork();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch ((column)) {
            case 0:
                return "Name";
            case 1:
                return "First Aired";
            case 2:
                return "Network";
        }
        return super.getColumnName(column);
    }


}

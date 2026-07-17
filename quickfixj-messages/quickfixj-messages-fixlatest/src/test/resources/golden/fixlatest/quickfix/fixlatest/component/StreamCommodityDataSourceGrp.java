/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCommodityDataSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41280, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCommodityDataSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCommodityDataSources value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommodityDataSources get(quickfix.field.NoStreamCommodityDataSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommodityDataSources getNoStreamCommodityDataSources() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommodityDataSources());
  }

  public boolean isSet(quickfix.field.NoStreamCommodityDataSources field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommodityDataSources() {
    return isSetField(41280);
  }

public static class NoStreamCommodityDataSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41281, 41282, 0};

  public NoStreamCommodityDataSources() {
    super(41280, 41281, ORDER);
  }

  public void set(quickfix.field.StreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDataSourceID get(quickfix.field.StreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDataSourceID getStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.StreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDataSourceID() {
    return isSetField(41281);
  }

  public void set(quickfix.field.StreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDataSourceIDType get(quickfix.field.StreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDataSourceIDType getStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.StreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDataSourceIDType() {
    return isSetField(41282);
  }
}

  public void set(quickfix.field.StreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDataSourceID get(quickfix.field.StreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDataSourceID getStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.StreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDataSourceID() {
    return isSetField(41281);
  }

  public void set(quickfix.field.StreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityDataSourceIDType get(quickfix.field.StreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityDataSourceIDType getStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.StreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityDataSourceIDType() {
    return isSetField(41282);
  }
}

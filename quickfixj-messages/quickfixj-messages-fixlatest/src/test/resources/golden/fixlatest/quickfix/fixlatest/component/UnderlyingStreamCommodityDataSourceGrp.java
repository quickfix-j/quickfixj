/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommodityDataSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41993, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommodityDataSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCommodityDataSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommodityDataSources get(quickfix.field.NoUnderlyingStreamCommodityDataSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommodityDataSources getNoUnderlyingStreamCommodityDataSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommodityDataSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommodityDataSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommodityDataSources() {
    return isSetField(41993);
  }

public static class NoUnderlyingStreamCommodityDataSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41994, 41995, 0};

  public NoUnderlyingStreamCommodityDataSources() {
    super(41993, 41994, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceID get(quickfix.field.UnderlyingStreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceID getUnderlyingStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDataSourceID() {
    return isSetField(41994);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceIDType get(quickfix.field.UnderlyingStreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceIDType getUnderlyingStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDataSourceIDType() {
    return isSetField(41995);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommodityDataSourceID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceID get(quickfix.field.UnderlyingStreamCommodityDataSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceID getUnderlyingStreamCommodityDataSourceID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDataSourceID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDataSourceID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDataSourceID() {
    return isSetField(41994);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityDataSourceIDType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceIDType get(quickfix.field.UnderlyingStreamCommodityDataSourceIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityDataSourceIDType getUnderlyingStreamCommodityDataSourceIDType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityDataSourceIDType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityDataSourceIDType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityDataSourceIDType() {
    return isSetField(41995);
  }
}

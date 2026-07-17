/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommoditySettlTimeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41999, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommoditySettlTimeGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes get(quickfix.field.NoUnderlyingStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlTimes getNoUnderlyingStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlTimes() {
    return isSetField(41999);
  }

public static class NoUnderlyingStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42000, 42001, 41936, 0};

  public NoUnderlyingStreamCommoditySettlTimes() {
    super(41999, 42000, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart get(quickfix.field.UnderlyingStreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlStart getUnderlyingStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlStart() {
    return isSetField(42000);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd get(quickfix.field.UnderlyingStreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlEnd getUnderlyingStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlEnd() {
    return isSetField(42001);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType get(quickfix.field.UnderlyingStreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlTimeType getUnderlyingStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlTimeType() {
    return isSetField(41936);
  }
}

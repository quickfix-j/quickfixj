/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCommoditySettlTimeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41286, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCommoditySettlTimeGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCommoditySettlTimes value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlTimes get(quickfix.field.NoStreamCommoditySettlTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlTimes getNoStreamCommoditySettlTimes() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlTimes());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlTimes() {
    return isSetField(41286);
  }

public static class NoStreamCommoditySettlTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41287, 41288, 41588, 0};

  public NoStreamCommoditySettlTimes() {
    super(41286, 41287, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlStart get(quickfix.field.StreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlStart getStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlStart() {
    return isSetField(41287);
  }

  public void set(quickfix.field.StreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlEnd get(quickfix.field.StreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlEnd getStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlEnd() {
    return isSetField(41288);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeType get(quickfix.field.StreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeType getStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeType() {
    return isSetField(41588);
  }
}

  public void set(quickfix.field.StreamCommoditySettlStart value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlStart get(quickfix.field.StreamCommoditySettlStart value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlStart getStreamCommoditySettlStart() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlStart());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlStart field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlStart() {
    return isSetField(41287);
  }

  public void set(quickfix.field.StreamCommoditySettlEnd value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlEnd get(quickfix.field.StreamCommoditySettlEnd value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlEnd getStreamCommoditySettlEnd() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlEnd());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlEnd field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlEnd() {
    return isSetField(41288);
  }

  public void set(quickfix.field.StreamCommoditySettlTimeType value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlTimeType get(quickfix.field.StreamCommoditySettlTimeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlTimeType getStreamCommoditySettlTimeType() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlTimeType());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlTimeType field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlTimeType() {
    return isSetField(41588);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCommoditySettlBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41249, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCommoditySettlBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCommoditySettlBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommoditySettlBusinessCenters get(quickfix.field.NoStreamCommoditySettlBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommoditySettlBusinessCenters getNoStreamCommoditySettlBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommoditySettlBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamCommoditySettlBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommoditySettlBusinessCenters() {
    return isSetField(41249);
  }

public static class NoStreamCommoditySettlBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41250, 0};

  public NoStreamCommoditySettlBusinessCenters() {
    super(41249, 41250, ORDER);
  }

  public void set(quickfix.field.StreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlBusinessCenter get(quickfix.field.StreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlBusinessCenter getStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlBusinessCenter() {
    return isSetField(41250);
  }
}

  public void set(quickfix.field.StreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamCommoditySettlBusinessCenter get(quickfix.field.StreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommoditySettlBusinessCenter getStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommoditySettlBusinessCenter() {
    return isSetField(41250);
  }
}

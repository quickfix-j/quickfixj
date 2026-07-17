/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommoditySettlBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41962, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommoditySettlBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters get(quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters getNoUnderlyingStreamCommoditySettlBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommoditySettlBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommoditySettlBusinessCenters() {
    return isSetField(41962);
  }

public static class NoUnderlyingStreamCommoditySettlBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41963, 0};

  public NoUnderlyingStreamCommoditySettlBusinessCenters() {
    super(41962, 41963, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter get(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter getUnderlyingStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlBusinessCenter() {
    return isSetField(41963);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter get(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter getUnderlyingStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommoditySettlBusinessCenter() {
    return isSetField(41963);
  }
}

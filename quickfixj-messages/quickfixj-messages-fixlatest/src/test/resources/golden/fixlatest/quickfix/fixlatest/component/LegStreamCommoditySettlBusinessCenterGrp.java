/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCommoditySettlBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41646, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCommoditySettlBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCommoditySettlBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCommoditySettlBusinessCenters get(quickfix.field.NoLegStreamCommoditySettlBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCommoditySettlBusinessCenters getNoLegStreamCommoditySettlBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCommoditySettlBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegStreamCommoditySettlBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCommoditySettlBusinessCenters() {
    return isSetField(41646);
  }

public static class NoLegStreamCommoditySettlBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41647, 0};

  public NoLegStreamCommoditySettlBusinessCenters() {
    super(41646, 41647, ORDER);
  }

  public void set(quickfix.field.LegStreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlBusinessCenter get(quickfix.field.LegStreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlBusinessCenter getLegStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlBusinessCenter() {
    return isSetField(41647);
  }
}

  public void set(quickfix.field.LegStreamCommoditySettlBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegStreamCommoditySettlBusinessCenter get(quickfix.field.LegStreamCommoditySettlBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCommoditySettlBusinessCenter getLegStreamCommoditySettlBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCommoditySettlBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegStreamCommoditySettlBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCommoditySettlBusinessCenter() {
    return isSetField(41647);
  }
}

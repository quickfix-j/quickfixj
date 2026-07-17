/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDeliveryStreamCommoditySourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41460, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDeliveryStreamCommoditySourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDeliveryStreamCommoditySources value) {
    setField(value);
  }

  public quickfix.field.NoLegDeliveryStreamCommoditySources get(quickfix.field.NoLegDeliveryStreamCommoditySources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDeliveryStreamCommoditySources getNoLegDeliveryStreamCommoditySources() throws FieldNotFound {
    return get(new quickfix.field.NoLegDeliveryStreamCommoditySources());
  }

  public boolean isSet(quickfix.field.NoLegDeliveryStreamCommoditySources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDeliveryStreamCommoditySources() {
    return isSetField(41460);
  }

public static class NoLegDeliveryStreamCommoditySources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41461, 0};

  public NoLegDeliveryStreamCommoditySources() {
    super(41460, 41461, ORDER);
  }

  public void set(quickfix.field.LegDeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamCommoditySource get(quickfix.field.LegDeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamCommoditySource getLegDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamCommoditySource() {
    return isSetField(41461);
  }
}

  public void set(quickfix.field.LegDeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryStreamCommoditySource get(quickfix.field.LegDeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryStreamCommoditySource getLegDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.LegDeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryStreamCommoditySource() {
    return isSetField(41461);
  }
}

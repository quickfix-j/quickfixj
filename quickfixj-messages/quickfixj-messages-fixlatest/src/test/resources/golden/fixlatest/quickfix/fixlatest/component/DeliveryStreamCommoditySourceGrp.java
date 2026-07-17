/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DeliveryStreamCommoditySourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41085, };
  protected int[] getGroupFields() { return componentGroups; }

  public DeliveryStreamCommoditySourceGrp() {
    super();
  }

  public void set(quickfix.field.NoDeliveryStreamCommoditySources value) {
    setField(value);
  }

  public quickfix.field.NoDeliveryStreamCommoditySources get(quickfix.field.NoDeliveryStreamCommoditySources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDeliveryStreamCommoditySources getNoDeliveryStreamCommoditySources() throws FieldNotFound {
    return get(new quickfix.field.NoDeliveryStreamCommoditySources());
  }

  public boolean isSet(quickfix.field.NoDeliveryStreamCommoditySources field) {
    return isSetField(field);
  }

  public boolean isSetNoDeliveryStreamCommoditySources() {
    return isSetField(41085);
  }

public static class NoDeliveryStreamCommoditySources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41086, 0};

  public NoDeliveryStreamCommoditySources() {
    super(41085, 41086, ORDER);
  }

  public void set(quickfix.field.DeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamCommoditySource get(quickfix.field.DeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamCommoditySource getDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.DeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamCommoditySource() {
    return isSetField(41086);
  }
}

  public void set(quickfix.field.DeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.DeliveryStreamCommoditySource get(quickfix.field.DeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryStreamCommoditySource getDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.DeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.DeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryStreamCommoditySource() {
    return isSetField(41086);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDeliveryStreamCommoditySourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41808, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDeliveryStreamCommoditySourceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDeliveryStreamCommoditySources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCommoditySources get(quickfix.field.NoUnderlyingDeliveryStreamCommoditySources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDeliveryStreamCommoditySources getNoUnderlyingDeliveryStreamCommoditySources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDeliveryStreamCommoditySources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDeliveryStreamCommoditySources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDeliveryStreamCommoditySources() {
    return isSetField(41808);
  }

public static class NoUnderlyingDeliveryStreamCommoditySources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41809, 0};

  public NoUnderlyingDeliveryStreamCommoditySources() {
    super(41808, 41809, ORDER);
  }

  public void set(quickfix.field.UnderlyingDeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamCommoditySource get(quickfix.field.UnderlyingDeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamCommoditySource getUnderlyingDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamCommoditySource() {
    return isSetField(41809);
  }
}

  public void set(quickfix.field.UnderlyingDeliveryStreamCommoditySource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDeliveryStreamCommoditySource get(quickfix.field.UnderlyingDeliveryStreamCommoditySource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDeliveryStreamCommoditySource getUnderlyingDeliveryStreamCommoditySource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDeliveryStreamCommoditySource());
  }

  public boolean isSet(quickfix.field.UnderlyingDeliveryStreamCommoditySource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDeliveryStreamCommoditySource() {
    return isSetField(41809);
  }
}

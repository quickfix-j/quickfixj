/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40968, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters getNoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    return isSetField(40968);
  }

public static class NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40650, 0};

  public NoUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenters() {
    super(40968, 40650, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter getUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40650);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter get(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter getUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableFixingDatesBusinessCenter() {
    return isSetField(40650);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40971, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamInitialFixingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters get(quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters getNoUnderlyingPaymentStreamInitialFixingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamInitialFixingDateBusinessCenters() {
    return isSetField(40971);
  }

public static class NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40600, 0};

  public NoUnderlyingPaymentStreamInitialFixingDateBusinessCenters() {
    super(40971, 40600, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter getUnderlyingPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40600);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter get(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter getUnderlyingPaymentStreamInitialFixingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamInitialFixingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamInitialFixingDateBusinessCenter() {
    return isSetField(40600);
  }
}

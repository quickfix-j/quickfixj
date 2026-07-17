/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingCashSettlDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42788, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingCashSettlDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingCashSettlDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlDateBusinessCenters get(quickfix.field.NoUnderlyingCashSettlDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlDateBusinessCenters getNoUnderlyingCashSettlDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlDateBusinessCenters() {
    return isSetField(42788);
  }

public static class NoUnderlyingCashSettlDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42789, 0};

  public NoUnderlyingCashSettlDateBusinessCenters() {
    super(42788, 42789, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessCenter get(quickfix.field.UnderlyingCashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessCenter getUnderlyingCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateBusinessCenter() {
    return isSetField(42789);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessCenter get(quickfix.field.UnderlyingCashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDateBusinessCenter getUnderlyingCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDateBusinessCenter() {
    return isSetField(42789);
  }
}

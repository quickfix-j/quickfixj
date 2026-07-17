/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CashSettlDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42214, };
  protected int[] getGroupFields() { return componentGroups; }

  public CashSettlDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoCashSettlDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlDateBusinessCenters get(quickfix.field.NoCashSettlDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlDateBusinessCenters getNoCashSettlDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoCashSettlDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlDateBusinessCenters() {
    return isSetField(42214);
  }

public static class NoCashSettlDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42215, 0};

  public NoCashSettlDateBusinessCenters() {
    super(42214, 42215, ORDER);
  }

  public void set(quickfix.field.CashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateBusinessCenter get(quickfix.field.CashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateBusinessCenter getCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.CashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateBusinessCenter() {
    return isSetField(42215);
  }
}

  public void set(quickfix.field.CashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.CashSettlDateBusinessCenter get(quickfix.field.CashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDateBusinessCenter getCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.CashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDateBusinessCenter() {
    return isSetField(42215);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegCashSettlDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42306, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegCashSettlDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegCashSettlDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlDateBusinessCenters get(quickfix.field.NoLegCashSettlDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlDateBusinessCenters getNoLegCashSettlDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlDateBusinessCenters() {
    return isSetField(42306);
  }

public static class NoLegCashSettlDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42307, 0};

  public NoLegCashSettlDateBusinessCenters() {
    super(42306, 42307, ORDER);
  }

  public void set(quickfix.field.LegCashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateBusinessCenter get(quickfix.field.LegCashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateBusinessCenter getLegCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateBusinessCenter() {
    return isSetField(42307);
  }
}

  public void set(quickfix.field.LegCashSettlDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDateBusinessCenter get(quickfix.field.LegCashSettlDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDateBusinessCenter getLegCashSettlDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegCashSettlDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDateBusinessCenter() {
    return isSetField(42307);
  }
}

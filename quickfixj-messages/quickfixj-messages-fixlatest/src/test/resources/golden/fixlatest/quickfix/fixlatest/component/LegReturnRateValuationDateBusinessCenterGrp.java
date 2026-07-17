/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRateValuationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42569, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRateValuationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters get(quickfix.field.NoLegReturnRateValuationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDateBusinessCenters getNoLegReturnRateValuationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDateBusinessCenters() {
    return isSetField(42569);
  }

public static class NoLegReturnRateValuationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42570, 0};

  public NoLegReturnRateValuationDateBusinessCenters() {
    super(42569, 42570, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter get(quickfix.field.LegReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter getLegReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessCenter() {
    return isSetField(42570);
  }
}

  public void set(quickfix.field.LegReturnRateValuationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter get(quickfix.field.LegReturnRateValuationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateBusinessCenter getLegReturnRateValuationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateBusinessCenter() {
    return isSetField(42570);
  }
}

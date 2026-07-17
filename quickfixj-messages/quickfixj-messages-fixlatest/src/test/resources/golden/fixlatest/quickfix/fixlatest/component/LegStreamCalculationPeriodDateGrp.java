/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegStreamCalculationPeriodDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41638, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegStreamCalculationPeriodDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegStreamCalculationPeriodDates value) {
    setField(value);
  }

  public quickfix.field.NoLegStreamCalculationPeriodDates get(quickfix.field.NoLegStreamCalculationPeriodDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegStreamCalculationPeriodDates getNoLegStreamCalculationPeriodDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegStreamCalculationPeriodDates());
  }

  public boolean isSet(quickfix.field.NoLegStreamCalculationPeriodDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegStreamCalculationPeriodDates() {
    return isSetField(41638);
  }

public static class NoLegStreamCalculationPeriodDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41639, 41640, 0};

  public NoLegStreamCalculationPeriodDates() {
    super(41638, 41639, ORDER);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDate get(quickfix.field.LegStreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDate getLegStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDate() {
    return isSetField(41639);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDateType get(quickfix.field.LegStreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDateType getLegStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDateType() {
    return isSetField(41640);
  }
}

  public void set(quickfix.field.LegStreamCalculationPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDate get(quickfix.field.LegStreamCalculationPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDate getLegStreamCalculationPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDate());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDate() {
    return isSetField(41639);
  }

  public void set(quickfix.field.LegStreamCalculationPeriodDateType value) {
    setField(value);
  }

  public quickfix.field.LegStreamCalculationPeriodDateType get(quickfix.field.LegStreamCalculationPeriodDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStreamCalculationPeriodDateType getLegStreamCalculationPeriodDateType() throws FieldNotFound {
    return get(new quickfix.field.LegStreamCalculationPeriodDateType());
  }

  public boolean isSet(quickfix.field.LegStreamCalculationPeriodDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegStreamCalculationPeriodDateType() {
    return isSetField(41640);
  }
}

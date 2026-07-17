/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRateValuationDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42571, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRateValuationDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRateValuationDates get(quickfix.field.NoLegReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRateValuationDates getNoLegReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoLegReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRateValuationDates() {
    return isSetField(42571);
  }

public static class NoLegReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42572, 42573, 0};

  public NoLegReturnRateValuationDates() {
    super(42571, 42572, ORDER);
  }

  public void set(quickfix.field.LegReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDate get(quickfix.field.LegReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDate getLegReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDate() {
    return isSetField(42572);
  }

  public void set(quickfix.field.LegReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateType get(quickfix.field.LegReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateType getLegReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateType() {
    return isSetField(42573);
  }
}

  public void set(quickfix.field.LegReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDate get(quickfix.field.LegReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDate getLegReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDate() {
    return isSetField(42572);
  }

  public void set(quickfix.field.LegReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRateValuationDateType get(quickfix.field.LegReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRateValuationDateType getLegReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.LegReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRateValuationDateType() {
    return isSetField(42573);
  }
}

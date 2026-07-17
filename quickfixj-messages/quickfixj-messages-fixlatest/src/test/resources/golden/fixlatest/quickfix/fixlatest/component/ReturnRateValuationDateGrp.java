/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRateValuationDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42772, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRateValuationDateGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRateValuationDates value) {
    setField(value);
  }

  public quickfix.field.NoReturnRateValuationDates get(quickfix.field.NoReturnRateValuationDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRateValuationDates getNoReturnRateValuationDates() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRateValuationDates());
  }

  public boolean isSet(quickfix.field.NoReturnRateValuationDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRateValuationDates() {
    return isSetField(42772);
  }

public static class NoReturnRateValuationDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42773, 42774, 0};

  public NoReturnRateValuationDates() {
    super(42772, 42773, ORDER);
  }

  public void set(quickfix.field.ReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDate get(quickfix.field.ReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDate getReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDate() {
    return isSetField(42773);
  }

  public void set(quickfix.field.ReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateType get(quickfix.field.ReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateType getReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateType() {
    return isSetField(42774);
  }
}

  public void set(quickfix.field.ReturnRateValuationDate value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDate get(quickfix.field.ReturnRateValuationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDate getReturnRateValuationDate() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDate());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDate field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDate() {
    return isSetField(42773);
  }

  public void set(quickfix.field.ReturnRateValuationDateType value) {
    setField(value);
  }

  public quickfix.field.ReturnRateValuationDateType get(quickfix.field.ReturnRateValuationDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRateValuationDateType getReturnRateValuationDateType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRateValuationDateType());
  }

  public boolean isSet(quickfix.field.ReturnRateValuationDateType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRateValuationDateType() {
    return isSetField(42774);
  }
}

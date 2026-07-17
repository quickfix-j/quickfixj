/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReferenceDataDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2746, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReferenceDataDateGrp() {
    super();
  }

  public void set(quickfix.field.NoReferenceDataDates value) {
    setField(value);
  }

  public quickfix.field.NoReferenceDataDates get(quickfix.field.NoReferenceDataDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReferenceDataDates getNoReferenceDataDates() throws FieldNotFound {
    return get(new quickfix.field.NoReferenceDataDates());
  }

  public boolean isSet(quickfix.field.NoReferenceDataDates field) {
    return isSetField(field);
  }

  public boolean isSetNoReferenceDataDates() {
    return isSetField(2746);
  }

public static class NoReferenceDataDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2747, 2748, 0};

  public NoReferenceDataDates() {
    super(2746, 2747, ORDER);
  }

  public void set(quickfix.field.ReferenceDataDate value) {
    setField(value);
  }

  public quickfix.field.ReferenceDataDate get(quickfix.field.ReferenceDataDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceDataDate getReferenceDataDate() throws FieldNotFound {
    return get(new quickfix.field.ReferenceDataDate());
  }

  public boolean isSet(quickfix.field.ReferenceDataDate field) {
    return isSetField(field);
  }

  public boolean isSetReferenceDataDate() {
    return isSetField(2747);
  }

  public void set(quickfix.field.ReferenceDataDateType value) {
    setField(value);
  }

  public quickfix.field.ReferenceDataDateType get(quickfix.field.ReferenceDataDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceDataDateType getReferenceDataDateType() throws FieldNotFound {
    return get(new quickfix.field.ReferenceDataDateType());
  }

  public boolean isSet(quickfix.field.ReferenceDataDateType field) {
    return isSetField(field);
  }

  public boolean isSetReferenceDataDateType() {
    return isSetField(2748);
  }
}

  public void set(quickfix.field.ReferenceDataDate value) {
    setField(value);
  }

  public quickfix.field.ReferenceDataDate get(quickfix.field.ReferenceDataDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceDataDate getReferenceDataDate() throws FieldNotFound {
    return get(new quickfix.field.ReferenceDataDate());
  }

  public boolean isSet(quickfix.field.ReferenceDataDate field) {
    return isSetField(field);
  }

  public boolean isSetReferenceDataDate() {
    return isSetField(2747);
  }

  public void set(quickfix.field.ReferenceDataDateType value) {
    setField(value);
  }

  public quickfix.field.ReferenceDataDateType get(quickfix.field.ReferenceDataDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReferenceDataDateType getReferenceDataDateType() throws FieldNotFound {
    return get(new quickfix.field.ReferenceDataDateType());
  }

  public boolean isSet(quickfix.field.ReferenceDataDateType field) {
    return isSetField(field);
  }

  public boolean isSetReferenceDataDateType() {
    return isSetField(2748);
  }
}

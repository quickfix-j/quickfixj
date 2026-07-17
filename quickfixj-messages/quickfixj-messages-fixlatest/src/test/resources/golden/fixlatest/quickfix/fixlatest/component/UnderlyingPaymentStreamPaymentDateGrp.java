/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamPaymentDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41937, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamPaymentDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDates get(quickfix.field.NoUnderlyingPaymentStreamPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamPaymentDates getNoUnderlyingPaymentStreamPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamPaymentDates());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamPaymentDates() {
    return isSetField(41937);
  }

public static class NoUnderlyingPaymentStreamPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41938, 41939, 0};

  public NoUnderlyingPaymentStreamPaymentDates() {
    super(41937, 41938, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDate get(quickfix.field.UnderlyingPaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDate getUnderlyingPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDate() {
    return isSetField(41938);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateType get(quickfix.field.UnderlyingPaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateType getUnderlyingPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateType() {
    return isSetField(41939);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDate get(quickfix.field.UnderlyingPaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDate getUnderlyingPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDate() {
    return isSetField(41938);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateType get(quickfix.field.UnderlyingPaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamPaymentDateType getUnderlyingPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamPaymentDateType() {
    return isSetField(41939);
  }
}

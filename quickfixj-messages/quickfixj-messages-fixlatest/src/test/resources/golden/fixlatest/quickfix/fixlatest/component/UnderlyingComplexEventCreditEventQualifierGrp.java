/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventCreditEventQualifierGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41724, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventCreditEventQualifierGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers get(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers getNoUnderlyingComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventCreditEventQualifiers() {
    return isSetField(41724);
  }

public static class NoUnderlyingComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41725, 0};

  public NoUnderlyingComplexEventCreditEventQualifiers() {
    super(41724, 41725, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier get(quickfix.field.UnderlyingComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventCreditEventQualifier getUnderlyingComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventCreditEventQualifier() {
    return isSetField(41725);
  }
}

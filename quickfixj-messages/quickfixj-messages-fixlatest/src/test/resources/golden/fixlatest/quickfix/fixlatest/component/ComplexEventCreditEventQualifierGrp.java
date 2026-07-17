/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventCreditEventQualifierGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41005, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventCreditEventQualifierGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers get(quickfix.field.NoComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventCreditEventQualifiers getNoComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventCreditEventQualifiers() {
    return isSetField(41005);
  }

public static class NoComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41006, 0};

  public NoComplexEventCreditEventQualifiers() {
    super(41005, 41006, ORDER);
  }

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}

  public void set(quickfix.field.ComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ComplexEventCreditEventQualifier get(quickfix.field.ComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventCreditEventQualifier getComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.ComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventCreditEventQualifier() {
    return isSetField(41006);
  }
}

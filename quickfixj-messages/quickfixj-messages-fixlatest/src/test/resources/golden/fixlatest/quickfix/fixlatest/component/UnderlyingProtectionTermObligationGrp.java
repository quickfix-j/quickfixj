/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProtectionTermObligationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42087, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProtectionTermObligationGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations get(quickfix.field.NoUnderlyingProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations getNoUnderlyingProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermObligations() {
    return isSetField(42087);
  }

public static class NoUnderlyingProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42088, 42089, 0};

  public NoUnderlyingProtectionTermObligations() {
    super(42087, 42088, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationType get(quickfix.field.UnderlyingProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationType getUnderlyingProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationType() {
    return isSetField(42088);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue get(quickfix.field.UnderlyingProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue getUnderlyingProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationValue() {
    return isSetField(42089);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationType get(quickfix.field.UnderlyingProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationType getUnderlyingProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationType() {
    return isSetField(42088);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue get(quickfix.field.UnderlyingProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue getUnderlyingProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationValue() {
    return isSetField(42089);
  }
}

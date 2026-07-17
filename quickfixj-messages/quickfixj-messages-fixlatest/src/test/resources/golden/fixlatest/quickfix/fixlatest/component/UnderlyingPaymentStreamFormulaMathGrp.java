/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFormulaMathGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42981, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFormulaMathGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPaymentStreamFormulas value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPaymentStreamFormulas get(quickfix.field.NoUnderlyingPaymentStreamFormulas value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPaymentStreamFormulas getNoUnderlyingPaymentStreamFormulas() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPaymentStreamFormulas());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPaymentStreamFormulas field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPaymentStreamFormulas() {
    return isSetField(42981);
  }

public static class NoUnderlyingPaymentStreamFormulas extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43111, 42982, 42983, 0};

  public NoUnderlyingPaymentStreamFormulas() {
    super(42981, 43111, ORDER);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaLength get(quickfix.field.UnderlyingPaymentStreamFormulaLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaLength getUnderlyingPaymentStreamFormulaLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaLength() {
    return isSetField(43111);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormula value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormula get(quickfix.field.UnderlyingPaymentStreamFormula value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormula getUnderlyingPaymentStreamFormula() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormula());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormula field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormula() {
    return isSetField(42982);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaDesc get(quickfix.field.UnderlyingPaymentStreamFormulaDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaDesc getUnderlyingPaymentStreamFormulaDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaDesc() {
    return isSetField(42983);
  }
}

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaLength get(quickfix.field.UnderlyingPaymentStreamFormulaLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaLength getUnderlyingPaymentStreamFormulaLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaLength() {
    return isSetField(43111);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormula value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormula get(quickfix.field.UnderlyingPaymentStreamFormula value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormula getUnderlyingPaymentStreamFormula() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormula());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormula field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormula() {
    return isSetField(42982);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaDesc get(quickfix.field.UnderlyingPaymentStreamFormulaDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaDesc getUnderlyingPaymentStreamFormulaDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaDesc() {
    return isSetField(42983);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFormula extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42978, 42979, 42980, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFormula() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaCurrency get(quickfix.field.UnderlyingPaymentStreamFormulaCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaCurrency getUnderlyingPaymentStreamFormulaCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaCurrency() {
    return isSetField(42978);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaCurrencyDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaCurrencyDeterminationMethod get(quickfix.field.UnderlyingPaymentStreamFormulaCurrencyDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaCurrencyDeterminationMethod getUnderlyingPaymentStreamFormulaCurrencyDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaCurrencyDeterminationMethod());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaCurrencyDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaCurrencyDeterminationMethod() {
    return isSetField(42979);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaReferenceAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaReferenceAmount get(quickfix.field.UnderlyingPaymentStreamFormulaReferenceAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaReferenceAmount getUnderlyingPaymentStreamFormulaReferenceAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaReferenceAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaReferenceAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaReferenceAmount() {
    return isSetField(42980);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaMathGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaMathGrp get(quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaMathGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaMathGrp getUnderlyingPaymentStreamFormulaMathGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaMathGrp());
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

  public void set(quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaImage component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaImage get(quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaImage component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaImage getUnderlyingPaymentStreamFormulaImageComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPaymentStreamFormulaImage());
  }
}

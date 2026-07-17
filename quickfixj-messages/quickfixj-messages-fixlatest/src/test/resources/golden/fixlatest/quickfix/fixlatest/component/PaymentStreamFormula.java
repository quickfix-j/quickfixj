/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFormula extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42686, 42687, 42688, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFormula() {
    super();
  }

  public void set(quickfix.field.PaymentStreamFormulaCurrency value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaCurrency get(quickfix.field.PaymentStreamFormulaCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaCurrency getPaymentStreamFormulaCurrency() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaCurrency());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaCurrency() {
    return isSetField(42686);
  }

  public void set(quickfix.field.PaymentStreamFormulaCurrencyDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaCurrencyDeterminationMethod get(quickfix.field.PaymentStreamFormulaCurrencyDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaCurrencyDeterminationMethod getPaymentStreamFormulaCurrencyDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaCurrencyDeterminationMethod());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaCurrencyDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaCurrencyDeterminationMethod() {
    return isSetField(42687);
  }

  public void set(quickfix.field.PaymentStreamFormulaReferenceAmount value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaReferenceAmount get(quickfix.field.PaymentStreamFormulaReferenceAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaReferenceAmount getPaymentStreamFormulaReferenceAmount() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaReferenceAmount());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaReferenceAmount field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaReferenceAmount() {
    return isSetField(42688);
  }

  public void set(quickfix.fixlatest.component.PaymentStreamFormulaMathGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFormulaMathGrp get(quickfix.fixlatest.component.PaymentStreamFormulaMathGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFormulaMathGrp getPaymentStreamFormulaMathGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFormulaMathGrp());
  }

  public void set(quickfix.field.NoPaymentStreamFormulas value) {
    setField(value);
  }

  public quickfix.field.NoPaymentStreamFormulas get(quickfix.field.NoPaymentStreamFormulas value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPaymentStreamFormulas getNoPaymentStreamFormulas() throws FieldNotFound {
    return get(new quickfix.field.NoPaymentStreamFormulas());
  }

  public boolean isSet(quickfix.field.NoPaymentStreamFormulas field) {
    return isSetField(field);
  }

  public boolean isSetNoPaymentStreamFormulas() {
    return isSetField(42683);
  }

public static class NoPaymentStreamFormulas extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43109, 42684, 42685, 0};

  public NoPaymentStreamFormulas() {
    super(42683, 43109, ORDER);
  }

  public void set(quickfix.field.PaymentStreamFormulaLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaLength get(quickfix.field.PaymentStreamFormulaLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaLength getPaymentStreamFormulaLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaLength());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaLength() {
    return isSetField(43109);
  }

  public void set(quickfix.field.PaymentStreamFormula value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormula get(quickfix.field.PaymentStreamFormula value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormula getPaymentStreamFormula() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormula());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormula field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormula() {
    return isSetField(42684);
  }

  public void set(quickfix.field.PaymentStreamFormulaDesc value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaDesc get(quickfix.field.PaymentStreamFormulaDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaDesc getPaymentStreamFormulaDesc() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaDesc());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaDesc field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaDesc() {
    return isSetField(42685);
  }
}

  public void set(quickfix.fixlatest.component.PaymentStreamFormulaImage component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PaymentStreamFormulaImage get(quickfix.fixlatest.component.PaymentStreamFormulaImage component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PaymentStreamFormulaImage getPaymentStreamFormulaImageComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PaymentStreamFormulaImage());
  }
}

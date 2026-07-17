/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFormulaMathGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42683, };
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFormulaMathGrp() {
    super();
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

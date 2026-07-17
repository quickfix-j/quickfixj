/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFormula extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42482, 42483, 42484, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFormula() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamFormulaCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaCurrency get(quickfix.field.LegPaymentStreamFormulaCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaCurrency getLegPaymentStreamFormulaCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaCurrency());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaCurrency() {
    return isSetField(42482);
  }

  public void set(quickfix.field.LegPaymentStreamFormulaCurrencyDeterminationMethod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaCurrencyDeterminationMethod get(quickfix.field.LegPaymentStreamFormulaCurrencyDeterminationMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaCurrencyDeterminationMethod getLegPaymentStreamFormulaCurrencyDeterminationMethod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaCurrencyDeterminationMethod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaCurrencyDeterminationMethod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaCurrencyDeterminationMethod() {
    return isSetField(42483);
  }

  public void set(quickfix.field.LegPaymentStreamFormulaReferenceAmount value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaReferenceAmount get(quickfix.field.LegPaymentStreamFormulaReferenceAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaReferenceAmount getLegPaymentStreamFormulaReferenceAmount() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaReferenceAmount());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaReferenceAmount field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaReferenceAmount() {
    return isSetField(42484);
  }

  public void set(quickfix.fixlatest.component.LegPaymentStreamFormulaMathGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFormulaMathGrp get(quickfix.fixlatest.component.LegPaymentStreamFormulaMathGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFormulaMathGrp getLegPaymentStreamFormulaMathGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFormulaMathGrp());
  }

  public void set(quickfix.field.NoLegPaymentStreamFormulas value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamFormulas get(quickfix.field.NoLegPaymentStreamFormulas value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamFormulas getNoLegPaymentStreamFormulas() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamFormulas());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamFormulas field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamFormulas() {
    return isSetField(42485);
  }

public static class NoLegPaymentStreamFormulas extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43110, 42486, 42487, 0};

  public NoLegPaymentStreamFormulas() {
    super(42485, 43110, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamFormulaLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaLength get(quickfix.field.LegPaymentStreamFormulaLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaLength getLegPaymentStreamFormulaLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaLength() {
    return isSetField(43110);
  }

  public void set(quickfix.field.LegPaymentStreamFormula value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormula get(quickfix.field.LegPaymentStreamFormula value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormula getLegPaymentStreamFormula() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormula());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormula field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormula() {
    return isSetField(42486);
  }

  public void set(quickfix.field.LegPaymentStreamFormulaDesc value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaDesc get(quickfix.field.LegPaymentStreamFormulaDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaDesc getLegPaymentStreamFormulaDesc() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaDesc());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaDesc() {
    return isSetField(42487);
  }
}

  public void set(quickfix.fixlatest.component.LegPaymentStreamFormulaImage component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPaymentStreamFormulaImage get(quickfix.fixlatest.component.LegPaymentStreamFormulaImage component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPaymentStreamFormulaImage getLegPaymentStreamFormulaImageComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPaymentStreamFormulaImage());
  }
}

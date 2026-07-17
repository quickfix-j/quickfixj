/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFormulaMathGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42485, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFormulaMathGrp() {
    super();
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

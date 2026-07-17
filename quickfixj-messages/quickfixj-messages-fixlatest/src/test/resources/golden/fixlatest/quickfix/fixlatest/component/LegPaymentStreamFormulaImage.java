/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFormulaImage extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42451, 42452, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFormulaImage() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamFormulaImageLength value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaImageLength get(quickfix.field.LegPaymentStreamFormulaImageLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaImageLength getLegPaymentStreamFormulaImageLength() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaImageLength());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaImageLength field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaImageLength() {
    return isSetField(42451);
  }

  public void set(quickfix.field.LegPaymentStreamFormulaImage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFormulaImage get(quickfix.field.LegPaymentStreamFormulaImage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFormulaImage getLegPaymentStreamFormulaImage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFormulaImage());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFormulaImage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFormulaImage() {
    return isSetField(42452);
  }
}

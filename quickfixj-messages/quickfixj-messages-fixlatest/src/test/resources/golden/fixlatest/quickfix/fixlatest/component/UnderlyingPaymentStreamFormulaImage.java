/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamFormulaImage extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42947, 42948, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamFormulaImage() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaImageLength value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaImageLength get(quickfix.field.UnderlyingPaymentStreamFormulaImageLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaImageLength getUnderlyingPaymentStreamFormulaImageLength() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaImageLength());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaImageLength field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaImageLength() {
    return isSetField(42947);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamFormulaImage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaImage get(quickfix.field.UnderlyingPaymentStreamFormulaImage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamFormulaImage getUnderlyingPaymentStreamFormulaImage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamFormulaImage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamFormulaImage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamFormulaImage() {
    return isSetField(42948);
  }
}

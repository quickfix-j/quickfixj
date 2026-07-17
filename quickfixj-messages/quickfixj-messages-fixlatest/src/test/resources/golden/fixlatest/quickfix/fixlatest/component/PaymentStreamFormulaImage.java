/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamFormulaImage extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42652, 42653, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamFormulaImage() {
    super();
  }

  public void set(quickfix.field.PaymentStreamFormulaImageLength value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaImageLength get(quickfix.field.PaymentStreamFormulaImageLength value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaImageLength getPaymentStreamFormulaImageLength() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaImageLength());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaImageLength field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaImageLength() {
    return isSetField(42652);
  }

  public void set(quickfix.field.PaymentStreamFormulaImage value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamFormulaImage get(quickfix.field.PaymentStreamFormulaImage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamFormulaImage getPaymentStreamFormulaImage() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamFormulaImage());
  }

  public boolean isSet(quickfix.field.PaymentStreamFormulaImage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamFormulaImage() {
    return isSetField(42653);
  }
}

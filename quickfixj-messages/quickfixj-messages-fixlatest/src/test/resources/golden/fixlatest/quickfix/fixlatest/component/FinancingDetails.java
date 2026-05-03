/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FinancingDetails extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {918, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public FinancingDetails() {
    super();
  }

  public void set(quickfix.field.AgreementCurrency value) {
    setField(value);
  }

  public quickfix.field.AgreementCurrency get(quickfix.field.AgreementCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
    return get(new quickfix.field.AgreementCurrency());
  }

  public boolean isSet(quickfix.field.AgreementCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAgreementCurrency() {
    return isSetField(918);
  }
}

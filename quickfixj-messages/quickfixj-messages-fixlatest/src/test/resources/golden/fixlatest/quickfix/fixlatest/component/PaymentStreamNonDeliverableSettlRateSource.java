/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PaymentStreamNonDeliverableSettlRateSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40371, 40372, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PaymentStreamNonDeliverableSettlRateSource() {
    super();
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableSettlRateSource value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableSettlRateSource get(quickfix.field.PaymentStreamNonDeliverableSettlRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableSettlRateSource getPaymentStreamNonDeliverableSettlRateSource() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableSettlRateSource());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableSettlRateSource field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableSettlRateSource() {
    return isSetField(40371);
  }

  public void set(quickfix.field.PaymentStreamNonDeliverableSettlReferencePage value) {
    setField(value);
  }

  public quickfix.field.PaymentStreamNonDeliverableSettlReferencePage get(quickfix.field.PaymentStreamNonDeliverableSettlReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PaymentStreamNonDeliverableSettlReferencePage getPaymentStreamNonDeliverableSettlReferencePage() throws FieldNotFound {
    return get(new quickfix.field.PaymentStreamNonDeliverableSettlReferencePage());
  }

  public boolean isSet(quickfix.field.PaymentStreamNonDeliverableSettlReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetPaymentStreamNonDeliverableSettlReferencePage() {
    return isSetField(40372);
  }
}

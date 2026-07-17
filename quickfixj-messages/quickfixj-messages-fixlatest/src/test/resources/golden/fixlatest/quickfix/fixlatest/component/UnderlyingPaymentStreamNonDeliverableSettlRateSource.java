/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPaymentStreamNonDeliverableSettlRateSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40661, 40824, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPaymentStreamNonDeliverableSettlRateSource() {
    super();
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlRateSource get(quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlRateSource getUnderlyingPaymentStreamNonDeliverableSettlRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableSettlRateSource() {
    return isSetField(40661);
  }

  public void set(quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlReferencePage get(quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlReferencePage getUnderlyingPaymentStreamNonDeliverableSettlReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingPaymentStreamNonDeliverableSettlReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPaymentStreamNonDeliverableSettlReferencePage() {
    return isSetField(40824);
  }
}

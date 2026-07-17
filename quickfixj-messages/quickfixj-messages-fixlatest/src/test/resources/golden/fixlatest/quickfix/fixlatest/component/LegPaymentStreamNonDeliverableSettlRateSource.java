/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamNonDeliverableSettlRateSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40087, 40228, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamNonDeliverableSettlRateSource() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableSettlRateSource value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableSettlRateSource get(quickfix.field.LegPaymentStreamNonDeliverableSettlRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableSettlRateSource getLegPaymentStreamNonDeliverableSettlRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableSettlRateSource());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableSettlRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableSettlRateSource() {
    return isSetField(40087);
  }

  public void set(quickfix.field.LegPaymentStreamNonDeliverableSettlReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamNonDeliverableSettlReferencePage get(quickfix.field.LegPaymentStreamNonDeliverableSettlReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamNonDeliverableSettlReferencePage getLegPaymentStreamNonDeliverableSettlReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamNonDeliverableSettlReferencePage());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamNonDeliverableSettlReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamNonDeliverableSettlReferencePage() {
    return isSetField(40228);
  }
}

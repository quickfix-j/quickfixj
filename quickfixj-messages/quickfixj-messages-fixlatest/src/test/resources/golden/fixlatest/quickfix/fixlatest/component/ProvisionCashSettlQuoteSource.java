/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionCashSettlQuoteSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40112, 41406, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionCashSettlQuoteSource() {
    super();
  }

  public void set(quickfix.field.ProvisionCashSettlQuoteSource value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlQuoteSource get(quickfix.field.ProvisionCashSettlQuoteSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlQuoteSource getProvisionCashSettlQuoteSource() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlQuoteSource());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlQuoteSource field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlQuoteSource() {
    return isSetField(40112);
  }

  public void set(quickfix.field.ProvisionCashSettlQuoteReferencePage value) {
    setField(value);
  }

  public quickfix.field.ProvisionCashSettlQuoteReferencePage get(quickfix.field.ProvisionCashSettlQuoteReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionCashSettlQuoteReferencePage getProvisionCashSettlQuoteReferencePage() throws FieldNotFound {
    return get(new quickfix.field.ProvisionCashSettlQuoteReferencePage());
  }

  public boolean isSet(quickfix.field.ProvisionCashSettlQuoteReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetProvisionCashSettlQuoteReferencePage() {
    return isSetField(41406);
  }
}

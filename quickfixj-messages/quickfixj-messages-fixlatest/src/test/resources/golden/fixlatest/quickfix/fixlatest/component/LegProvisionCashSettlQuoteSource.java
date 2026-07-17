/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionCashSettlQuoteSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40470, 41407, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionCashSettlQuoteSource() {
    super();
  }

  public void set(quickfix.field.LegProvisionCashSettlQuoteSource value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlQuoteSource get(quickfix.field.LegProvisionCashSettlQuoteSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlQuoteSource getLegProvisionCashSettlQuoteSource() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlQuoteSource());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlQuoteSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlQuoteSource() {
    return isSetField(40470);
  }

  public void set(quickfix.field.LegProvisionCashSettlQuoteReferencePage value) {
    setField(value);
  }

  public quickfix.field.LegProvisionCashSettlQuoteReferencePage get(quickfix.field.LegProvisionCashSettlQuoteReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionCashSettlQuoteReferencePage getLegProvisionCashSettlQuoteReferencePage() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionCashSettlQuoteReferencePage());
  }

  public boolean isSet(quickfix.field.LegProvisionCashSettlQuoteReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionCashSettlQuoteReferencePage() {
    return isSetField(41407);
  }
}

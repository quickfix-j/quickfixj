/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionCashSettlQuoteSource extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42102, 42103, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionCashSettlQuoteSource() {
    super();
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlQuoteSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteSource get(quickfix.field.UnderlyingProvisionCashSettlQuoteSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteSource getUnderlyingProvisionCashSettlQuoteSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlQuoteSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlQuoteSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlQuoteSource() {
    return isSetField(42102);
  }

  public void set(quickfix.field.UnderlyingProvisionCashSettlQuoteReferencePage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteReferencePage get(quickfix.field.UnderlyingProvisionCashSettlQuoteReferencePage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionCashSettlQuoteReferencePage getUnderlyingProvisionCashSettlQuoteReferencePage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionCashSettlQuoteReferencePage());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionCashSettlQuoteReferencePage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionCashSettlQuoteReferencePage() {
    return isSetField(42103);
  }
}

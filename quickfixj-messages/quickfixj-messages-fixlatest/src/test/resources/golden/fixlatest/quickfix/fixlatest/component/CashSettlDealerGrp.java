/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class CashSettlDealerGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40277, };
  protected int[] getGroupFields() { return componentGroups; }

  public CashSettlDealerGrp() {
    super();
  }

  public void set(quickfix.field.NoCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoCashSettlDealers get(quickfix.field.NoCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCashSettlDealers getNoCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoCashSettlDealers() {
    return isSetField(40277);
  }

public static class NoCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40032, 0};

  public NoCashSettlDealers() {
    super(40277, 40032, ORDER);
  }

  public void set(quickfix.field.CashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.CashSettlDealer get(quickfix.field.CashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDealer getCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDealer());
  }

  public boolean isSet(quickfix.field.CashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDealer() {
    return isSetField(40032);
  }
}

  public void set(quickfix.field.CashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.CashSettlDealer get(quickfix.field.CashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashSettlDealer getCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.CashSettlDealer());
  }

  public boolean isSet(quickfix.field.CashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetCashSettlDealer() {
    return isSetField(40032);
  }
}

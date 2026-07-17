/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingCashSettlDealerGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42039, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingCashSettlDealerGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingCashSettlDealers get(quickfix.field.NoUnderlyingCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingCashSettlDealers getNoUnderlyingCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingCashSettlDealers() {
    return isSetField(42039);
  }

public static class NoUnderlyingCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42040, 0};

  public NoUnderlyingCashSettlDealers() {
    super(42039, 42040, ORDER);
  }

  public void set(quickfix.field.UnderlyingCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDealer get(quickfix.field.UnderlyingCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDealer getUnderlyingCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDealer());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDealer() {
    return isSetField(42040);
  }
}

  public void set(quickfix.field.UnderlyingCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCashSettlDealer get(quickfix.field.UnderlyingCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCashSettlDealer getUnderlyingCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCashSettlDealer());
  }

  public boolean isSet(quickfix.field.UnderlyingCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCashSettlDealer() {
    return isSetField(42040);
  }
}

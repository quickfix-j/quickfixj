/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegCashSettlDealerGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41342, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegCashSettlDealerGrp() {
    super();
  }

  public void set(quickfix.field.NoLegCashSettlDealers value) {
    setField(value);
  }

  public quickfix.field.NoLegCashSettlDealers get(quickfix.field.NoLegCashSettlDealers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegCashSettlDealers getNoLegCashSettlDealers() throws FieldNotFound {
    return get(new quickfix.field.NoLegCashSettlDealers());
  }

  public boolean isSet(quickfix.field.NoLegCashSettlDealers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegCashSettlDealers() {
    return isSetField(41342);
  }

public static class NoLegCashSettlDealers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41343, 0};

  public NoLegCashSettlDealers() {
    super(41342, 41343, ORDER);
  }

  public void set(quickfix.field.LegCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDealer get(quickfix.field.LegCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDealer getLegCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDealer());
  }

  public boolean isSet(quickfix.field.LegCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDealer() {
    return isSetField(41343);
  }
}

  public void set(quickfix.field.LegCashSettlDealer value) {
    setField(value);
  }

  public quickfix.field.LegCashSettlDealer get(quickfix.field.LegCashSettlDealer value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCashSettlDealer getLegCashSettlDealer() throws FieldNotFound {
    return get(new quickfix.field.LegCashSettlDealer());
  }

  public boolean isSet(quickfix.field.LegCashSettlDealer field) {
    return isSetField(field);
  }

  public boolean isSetLegCashSettlDealer() {
    return isSetField(41343);
  }
}

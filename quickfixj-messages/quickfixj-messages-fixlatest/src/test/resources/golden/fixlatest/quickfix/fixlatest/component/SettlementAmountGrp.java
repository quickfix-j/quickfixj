/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlementAmountGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1700, };
  protected int[] getGroupFields() { return componentGroups; }

  public SettlementAmountGrp() {
    super();
  }

  public void set(quickfix.field.NoSettlementAmounts value) {
    setField(value);
  }

  public quickfix.field.NoSettlementAmounts get(quickfix.field.NoSettlementAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlementAmounts getNoSettlementAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoSettlementAmounts());
  }

  public boolean isSet(quickfix.field.NoSettlementAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlementAmounts() {
    return isSetField(1700);
  }

public static class NoSettlementAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1701, 1702, 0};

  public NoSettlementAmounts() {
    super(1700, 1701, ORDER);
  }

  public void set(quickfix.field.SettlementAmount value) {
    setField(value);
  }

  public quickfix.field.SettlementAmount get(quickfix.field.SettlementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementAmount getSettlementAmount() throws FieldNotFound {
    return get(new quickfix.field.SettlementAmount());
  }

  public boolean isSet(quickfix.field.SettlementAmount field) {
    return isSetField(field);
  }

  public boolean isSetSettlementAmount() {
    return isSetField(1701);
  }

  public void set(quickfix.field.SettlementAmountCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlementAmountCurrency get(quickfix.field.SettlementAmountCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementAmountCurrency getSettlementAmountCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlementAmountCurrency());
  }

  public boolean isSet(quickfix.field.SettlementAmountCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlementAmountCurrency() {
    return isSetField(1702);
  }
}

  public void set(quickfix.field.SettlementAmount value) {
    setField(value);
  }

  public quickfix.field.SettlementAmount get(quickfix.field.SettlementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementAmount getSettlementAmount() throws FieldNotFound {
    return get(new quickfix.field.SettlementAmount());
  }

  public boolean isSet(quickfix.field.SettlementAmount field) {
    return isSetField(field);
  }

  public boolean isSetSettlementAmount() {
    return isSetField(1701);
  }

  public void set(quickfix.field.SettlementAmountCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlementAmountCurrency get(quickfix.field.SettlementAmountCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementAmountCurrency getSettlementAmountCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlementAmountCurrency());
  }

  public boolean isSet(quickfix.field.SettlementAmountCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlementAmountCurrency() {
    return isSetField(1702);
  }
}

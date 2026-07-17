/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingAmount extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {984, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingAmount() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingAmounts value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingAmounts get(quickfix.field.NoUnderlyingAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingAmounts getNoUnderlyingAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingAmounts());
  }

  public boolean isSet(quickfix.field.NoUnderlyingAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingAmounts() {
    return isSetField(984);
  }

public static class NoUnderlyingAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {985, 986, 987, 988, 0};

  public NoUnderlyingAmounts() {
    super(984, 985, ORDER);
  }

  public void set(quickfix.field.UnderlyingPayAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPayAmount get(quickfix.field.UnderlyingPayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPayAmount getUnderlyingPayAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPayAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPayAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPayAmount() {
    return isSetField(985);
  }

  public void set(quickfix.field.UnderlyingCollectAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCollectAmount get(quickfix.field.UnderlyingCollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCollectAmount getUnderlyingCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCollectAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCollectAmount() {
    return isSetField(986);
  }

  public void set(quickfix.field.UnderlyingSettlementDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementDate get(quickfix.field.UnderlyingSettlementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementDate getUnderlyingSettlementDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementDate());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementDate() {
    return isSetField(987);
  }

  public void set(quickfix.field.UnderlyingSettlementStatus value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementStatus get(quickfix.field.UnderlyingSettlementStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementStatus getUnderlyingSettlementStatus() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementStatus());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementStatus field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementStatus() {
    return isSetField(988);
  }
}

  public void set(quickfix.field.UnderlyingPayAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPayAmount get(quickfix.field.UnderlyingPayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPayAmount getUnderlyingPayAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPayAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingPayAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPayAmount() {
    return isSetField(985);
  }

  public void set(quickfix.field.UnderlyingCollectAmount value) {
    setField(value);
  }

  public quickfix.field.UnderlyingCollectAmount get(quickfix.field.UnderlyingCollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingCollectAmount getUnderlyingCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingCollectAmount());
  }

  public boolean isSet(quickfix.field.UnderlyingCollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingCollectAmount() {
    return isSetField(986);
  }

  public void set(quickfix.field.UnderlyingSettlementDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementDate get(quickfix.field.UnderlyingSettlementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementDate getUnderlyingSettlementDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementDate());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementDate() {
    return isSetField(987);
  }

  public void set(quickfix.field.UnderlyingSettlementStatus value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlementStatus get(quickfix.field.UnderlyingSettlementStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlementStatus getUnderlyingSettlementStatus() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlementStatus());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlementStatus field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlementStatus() {
    return isSetField(988);
  }
}

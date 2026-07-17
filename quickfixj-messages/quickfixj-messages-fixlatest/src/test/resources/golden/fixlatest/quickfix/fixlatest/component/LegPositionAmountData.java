/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPositionAmountData extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1586, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPositionAmountData() {
    super();
  }

  public void set(quickfix.field.NoLegPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoLegPosAmt get(quickfix.field.NoLegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPosAmt getNoLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoLegPosAmt());
  }

  public boolean isSet(quickfix.field.NoLegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPosAmt() {
    return isSetField(1586);
  }

public static class NoLegPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1587, 1588, 1589, 1590, 0};

  public NoLegPosAmt() {
    super(1586, 1587, ORDER);
  }

  public void set(quickfix.field.LegPosAmt value) {
    setField(value);
  }

  public quickfix.field.LegPosAmt get(quickfix.field.LegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmt getLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmt());
  }

  public boolean isSet(quickfix.field.LegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmt() {
    return isSetField(1587);
  }

  public void set(quickfix.field.LegPosAmtType value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtType get(quickfix.field.LegPosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtType getLegPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtType());
  }

  public boolean isSet(quickfix.field.LegPosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtType() {
    return isSetField(1588);
  }

  public void set(quickfix.field.LegPosCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPosCurrency get(quickfix.field.LegPosCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosCurrency getLegPosCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPosCurrency());
  }

  public boolean isSet(quickfix.field.LegPosCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPosCurrency() {
    return isSetField(1589);
  }

  public void set(quickfix.field.LegPosAmtReason value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtReason get(quickfix.field.LegPosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtReason getLegPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtReason());
  }

  public boolean isSet(quickfix.field.LegPosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtReason() {
    return isSetField(1590);
  }
}

  public void set(quickfix.field.LegPosAmt value) {
    setField(value);
  }

  public quickfix.field.LegPosAmt get(quickfix.field.LegPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmt getLegPosAmt() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmt());
  }

  public boolean isSet(quickfix.field.LegPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmt() {
    return isSetField(1587);
  }

  public void set(quickfix.field.LegPosAmtType value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtType get(quickfix.field.LegPosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtType getLegPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtType());
  }

  public boolean isSet(quickfix.field.LegPosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtType() {
    return isSetField(1588);
  }

  public void set(quickfix.field.LegPosCurrency value) {
    setField(value);
  }

  public quickfix.field.LegPosCurrency get(quickfix.field.LegPosCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosCurrency getLegPosCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegPosCurrency());
  }

  public boolean isSet(quickfix.field.LegPosCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegPosCurrency() {
    return isSetField(1589);
  }

  public void set(quickfix.field.LegPosAmtReason value) {
    setField(value);
  }

  public quickfix.field.LegPosAmtReason get(quickfix.field.LegPosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPosAmtReason getLegPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.LegPosAmtReason());
  }

  public boolean isSet(quickfix.field.LegPosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetLegPosAmtReason() {
    return isSetField(1590);
  }
}

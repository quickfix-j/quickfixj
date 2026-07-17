/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradePositionQty extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {702, };
  protected int[] getGroupFields() { return componentGroups; }

  public TradePositionQty() {
    super();
  }

  public void set(quickfix.field.NoPositions value) {
    setField(value);
  }

  public quickfix.field.NoPositions get(quickfix.field.NoPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPositions getNoPositions() throws FieldNotFound {
    return get(new quickfix.field.NoPositions());
  }

  public boolean isSet(quickfix.field.NoPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoPositions() {
    return isSetField(702);
  }

public static class NoPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {703, 704, 705, 1654, 706, 976, 0};

  public NoPositions() {
    super(702, 703, ORDER);
  }

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }
}

  public void set(quickfix.field.PosType value) {
    setField(value);
  }

  public quickfix.field.PosType get(quickfix.field.PosType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosType getPosType() throws FieldNotFound {
    return get(new quickfix.field.PosType());
  }

  public boolean isSet(quickfix.field.PosType field) {
    return isSetField(field);
  }

  public boolean isSetPosType() {
    return isSetField(703);
  }

  public void set(quickfix.field.LongQty value) {
    setField(value);
  }

  public quickfix.field.LongQty get(quickfix.field.LongQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LongQty getLongQty() throws FieldNotFound {
    return get(new quickfix.field.LongQty());
  }

  public boolean isSet(quickfix.field.LongQty field) {
    return isSetField(field);
  }

  public boolean isSetLongQty() {
    return isSetField(704);
  }

  public void set(quickfix.field.ShortQty value) {
    setField(value);
  }

  public quickfix.field.ShortQty get(quickfix.field.ShortQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ShortQty getShortQty() throws FieldNotFound {
    return get(new quickfix.field.ShortQty());
  }

  public boolean isSet(quickfix.field.ShortQty field) {
    return isSetField(field);
  }

  public boolean isSetShortQty() {
    return isSetField(705);
  }

  public void set(quickfix.field.CoveredQty value) {
    setField(value);
  }

  public quickfix.field.CoveredQty get(quickfix.field.CoveredQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CoveredQty getCoveredQty() throws FieldNotFound {
    return get(new quickfix.field.CoveredQty());
  }

  public boolean isSet(quickfix.field.CoveredQty field) {
    return isSetField(field);
  }

  public boolean isSetCoveredQty() {
    return isSetField(1654);
  }

  public void set(quickfix.field.PosQtyStatus value) {
    setField(value);
  }

  public quickfix.field.PosQtyStatus get(quickfix.field.PosQtyStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosQtyStatus getPosQtyStatus() throws FieldNotFound {
    return get(new quickfix.field.PosQtyStatus());
  }

  public boolean isSet(quickfix.field.PosQtyStatus field) {
    return isSetField(field);
  }

  public boolean isSetPosQtyStatus() {
    return isSetField(706);
  }

  public void set(quickfix.field.QuantityDate value) {
    setField(value);
  }

  public quickfix.field.QuantityDate get(quickfix.field.QuantityDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.QuantityDate getQuantityDate() throws FieldNotFound {
    return get(new quickfix.field.QuantityDate());
  }

  public boolean isSet(quickfix.field.QuantityDate field) {
    return isSetField(field);
  }

  public boolean isSetQuantityDate() {
    return isSetField(976);
  }
}

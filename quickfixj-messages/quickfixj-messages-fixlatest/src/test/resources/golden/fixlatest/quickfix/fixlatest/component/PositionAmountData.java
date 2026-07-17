/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PositionAmountData extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {753, };
  protected int[] getGroupFields() { return componentGroups; }

  public PositionAmountData() {
    super();
  }

  public void set(quickfix.field.NoPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoPosAmt());
  }

  public boolean isSet(quickfix.field.NoPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoPosAmt() {
    return isSetField(753);
  }

public static class NoPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {707, 708, 2096, 1055, 2097, 2098, 1585, 2099, 2100, 2876, 2877, 0};

  public NoPosAmt() {
    super(753, 707, ORDER);
  }

  public void set(quickfix.field.PosAmtType value) {
    setField(value);
  }

  public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtType());
  }

  public boolean isSet(quickfix.field.PosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtType() {
    return isSetField(707);
  }

  public void set(quickfix.field.PosAmt value) {
    setField(value);
  }

  public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
    return get(new quickfix.field.PosAmt());
  }

  public boolean isSet(quickfix.field.PosAmt field) {
    return isSetField(field);
  }

  public boolean isSetPosAmt() {
    return isSetField(708);
  }

  public void set(quickfix.field.PosAmtStreamDesc value) {
    setField(value);
  }

  public quickfix.field.PosAmtStreamDesc get(quickfix.field.PosAmtStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtStreamDesc getPosAmtStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.PosAmtStreamDesc());
  }

  public boolean isSet(quickfix.field.PosAmtStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtStreamDesc() {
    return isSetField(2096);
  }

  public void set(quickfix.field.PositionCurrency value) {
    setField(value);
  }

  public quickfix.field.PositionCurrency get(quickfix.field.PositionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionCurrency getPositionCurrency() throws FieldNotFound {
    return get(new quickfix.field.PositionCurrency());
  }

  public boolean isSet(quickfix.field.PositionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPositionCurrency() {
    return isSetField(1055);
  }

  public void set(quickfix.field.PositionFXRate value) {
    setField(value);
  }

  public quickfix.field.PositionFXRate get(quickfix.field.PositionFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRate getPositionFXRate() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRate());
  }

  public boolean isSet(quickfix.field.PositionFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRate() {
    return isSetField(2097);
  }

  public void set(quickfix.field.PositionFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PositionFXRateCalc get(quickfix.field.PositionFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRateCalc getPositionFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRateCalc());
  }

  public boolean isSet(quickfix.field.PositionFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRateCalc() {
    return isSetField(2098);
  }

  public void set(quickfix.field.PosAmtReason value) {
    setField(value);
  }

  public quickfix.field.PosAmtReason get(quickfix.field.PosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtReason getPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.PosAmtReason());
  }

  public boolean isSet(quickfix.field.PosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtReason() {
    return isSetField(1585);
  }

  public void set(quickfix.field.PosAmtMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketSegmentID get(quickfix.field.PosAmtMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketSegmentID getPosAmtMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketSegmentID() {
    return isSetField(2099);
  }

  public void set(quickfix.field.PosAmtMarketID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketID get(quickfix.field.PosAmtMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketID getPosAmtMarketID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketID() {
    return isSetField(2100);
  }

  public void set(quickfix.field.PosAmtPrice value) {
    setField(value);
  }

  public quickfix.field.PosAmtPrice get(quickfix.field.PosAmtPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPrice getPosAmtPrice() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPrice());
  }

  public boolean isSet(quickfix.field.PosAmtPrice field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPrice() {
    return isSetField(2876);
  }

  public void set(quickfix.field.PosAmtPriceType value) {
    setField(value);
  }

  public quickfix.field.PosAmtPriceType get(quickfix.field.PosAmtPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPriceType getPosAmtPriceType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPriceType());
  }

  public boolean isSet(quickfix.field.PosAmtPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPriceType() {
    return isSetField(2877);
  }
}

  public void set(quickfix.field.PosAmtType value) {
    setField(value);
  }

  public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtType());
  }

  public boolean isSet(quickfix.field.PosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtType() {
    return isSetField(707);
  }

  public void set(quickfix.field.PosAmt value) {
    setField(value);
  }

  public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
    return get(new quickfix.field.PosAmt());
  }

  public boolean isSet(quickfix.field.PosAmt field) {
    return isSetField(field);
  }

  public boolean isSetPosAmt() {
    return isSetField(708);
  }

  public void set(quickfix.field.PosAmtStreamDesc value) {
    setField(value);
  }

  public quickfix.field.PosAmtStreamDesc get(quickfix.field.PosAmtStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtStreamDesc getPosAmtStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.PosAmtStreamDesc());
  }

  public boolean isSet(quickfix.field.PosAmtStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtStreamDesc() {
    return isSetField(2096);
  }

  public void set(quickfix.field.PositionCurrency value) {
    setField(value);
  }

  public quickfix.field.PositionCurrency get(quickfix.field.PositionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionCurrency getPositionCurrency() throws FieldNotFound {
    return get(new quickfix.field.PositionCurrency());
  }

  public boolean isSet(quickfix.field.PositionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPositionCurrency() {
    return isSetField(1055);
  }

  public void set(quickfix.field.PositionFXRate value) {
    setField(value);
  }

  public quickfix.field.PositionFXRate get(quickfix.field.PositionFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRate getPositionFXRate() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRate());
  }

  public boolean isSet(quickfix.field.PositionFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRate() {
    return isSetField(2097);
  }

  public void set(quickfix.field.PositionFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PositionFXRateCalc get(quickfix.field.PositionFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRateCalc getPositionFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRateCalc());
  }

  public boolean isSet(quickfix.field.PositionFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRateCalc() {
    return isSetField(2098);
  }

  public void set(quickfix.field.PosAmtReason value) {
    setField(value);
  }

  public quickfix.field.PosAmtReason get(quickfix.field.PosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtReason getPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.PosAmtReason());
  }

  public boolean isSet(quickfix.field.PosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtReason() {
    return isSetField(1585);
  }

  public void set(quickfix.field.PosAmtMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketSegmentID get(quickfix.field.PosAmtMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketSegmentID getPosAmtMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketSegmentID() {
    return isSetField(2099);
  }

  public void set(quickfix.field.PosAmtMarketID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketID get(quickfix.field.PosAmtMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketID getPosAmtMarketID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketID() {
    return isSetField(2100);
  }

  public void set(quickfix.field.PosAmtPrice value) {
    setField(value);
  }

  public quickfix.field.PosAmtPrice get(quickfix.field.PosAmtPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPrice getPosAmtPrice() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPrice());
  }

  public boolean isSet(quickfix.field.PosAmtPrice field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPrice() {
    return isSetField(2876);
  }

  public void set(quickfix.field.PosAmtPriceType value) {
    setField(value);
  }

  public quickfix.field.PosAmtPriceType get(quickfix.field.PosAmtPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPriceType getPosAmtPriceType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPriceType());
  }

  public boolean isSet(quickfix.field.PosAmtPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPriceType() {
    return isSetField(2877);
  }
}

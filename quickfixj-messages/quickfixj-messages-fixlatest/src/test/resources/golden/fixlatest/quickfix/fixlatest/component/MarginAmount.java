/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarginAmount extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1643, };
  protected int[] getGroupFields() { return componentGroups; }

  public MarginAmount() {
    super();
  }

  public void set(quickfix.field.NoMarginAmt value) {
    setField(value);
  }

  public quickfix.field.NoMarginAmt get(quickfix.field.NoMarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarginAmt getNoMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.NoMarginAmt());
  }

  public boolean isSet(quickfix.field.NoMarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoMarginAmt() {
    return isSetField(1643);
  }

public static class NoMarginAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1645, 1644, 1646, 2088, 2089, 1714, 1715, 2851, 0};

  public NoMarginAmt() {
    super(1643, 1645, ORDER);
  }

  public void set(quickfix.field.MarginAmt value) {
    setField(value);
  }

  public quickfix.field.MarginAmt get(quickfix.field.MarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmt getMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.MarginAmt());
  }

  public boolean isSet(quickfix.field.MarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmt() {
    return isSetField(1645);
  }

  public void set(quickfix.field.MarginAmtType value) {
    setField(value);
  }

  public quickfix.field.MarginAmtType get(quickfix.field.MarginAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtType getMarginAmtType() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtType());
  }

  public boolean isSet(quickfix.field.MarginAmtType field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtType() {
    return isSetField(1644);
  }

  public void set(quickfix.field.MarginAmtCcy value) {
    setField(value);
  }

  public quickfix.field.MarginAmtCcy get(quickfix.field.MarginAmtCcy value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtCcy getMarginAmtCcy() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtCcy());
  }

  public boolean isSet(quickfix.field.MarginAmtCcy field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtCcy() {
    return isSetField(1646);
  }

  public void set(quickfix.field.MarginAmtFXRate value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRate get(quickfix.field.MarginAmtFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRate getMarginAmtFXRate() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRate());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRate field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRate() {
    return isSetField(2088);
  }

  public void set(quickfix.field.MarginAmtFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRateCalc get(quickfix.field.MarginAmtFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRateCalc getMarginAmtFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRateCalc());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRateCalc() {
    return isSetField(2089);
  }

  public void set(quickfix.field.MarginAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketSegmentID get(quickfix.field.MarginAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketSegmentID getMarginAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketSegmentID() {
    return isSetField(1714);
  }

  public void set(quickfix.field.MarginAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketID get(quickfix.field.MarginAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketID getMarginAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketID() {
    return isSetField(1715);
  }

  public void set(quickfix.field.MarginDirection value) {
    setField(value);
  }

  public quickfix.field.MarginDirection get(quickfix.field.MarginDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginDirection getMarginDirection() throws FieldNotFound {
    return get(new quickfix.field.MarginDirection());
  }

  public boolean isSet(quickfix.field.MarginDirection field) {
    return isSetField(field);
  }

  public boolean isSetMarginDirection() {
    return isSetField(2851);
  }
}

  public void set(quickfix.field.MarginAmt value) {
    setField(value);
  }

  public quickfix.field.MarginAmt get(quickfix.field.MarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmt getMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.MarginAmt());
  }

  public boolean isSet(quickfix.field.MarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmt() {
    return isSetField(1645);
  }

  public void set(quickfix.field.MarginAmtType value) {
    setField(value);
  }

  public quickfix.field.MarginAmtType get(quickfix.field.MarginAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtType getMarginAmtType() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtType());
  }

  public boolean isSet(quickfix.field.MarginAmtType field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtType() {
    return isSetField(1644);
  }

  public void set(quickfix.field.MarginAmtCcy value) {
    setField(value);
  }

  public quickfix.field.MarginAmtCcy get(quickfix.field.MarginAmtCcy value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtCcy getMarginAmtCcy() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtCcy());
  }

  public boolean isSet(quickfix.field.MarginAmtCcy field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtCcy() {
    return isSetField(1646);
  }

  public void set(quickfix.field.MarginAmtFXRate value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRate get(quickfix.field.MarginAmtFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRate getMarginAmtFXRate() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRate());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRate field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRate() {
    return isSetField(2088);
  }

  public void set(quickfix.field.MarginAmtFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRateCalc get(quickfix.field.MarginAmtFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRateCalc getMarginAmtFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRateCalc());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRateCalc() {
    return isSetField(2089);
  }

  public void set(quickfix.field.MarginAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketSegmentID get(quickfix.field.MarginAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketSegmentID getMarginAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketSegmentID() {
    return isSetField(1714);
  }

  public void set(quickfix.field.MarginAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketID get(quickfix.field.MarginAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketID getMarginAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketID() {
    return isSetField(1715);
  }

  public void set(quickfix.field.MarginDirection value) {
    setField(value);
  }

  public quickfix.field.MarginDirection get(quickfix.field.MarginDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginDirection getMarginDirection() throws FieldNotFound {
    return get(new quickfix.field.MarginDirection());
  }

  public boolean isSet(quickfix.field.MarginDirection field) {
    return isSetField(field);
  }

  public boolean isSetMarginDirection() {
    return isSetField(2851);
  }
}

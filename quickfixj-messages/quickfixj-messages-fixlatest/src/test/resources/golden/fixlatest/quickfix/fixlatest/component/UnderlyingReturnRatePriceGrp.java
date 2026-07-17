/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingReturnRatePriceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43064, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingReturnRatePriceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingReturnRatePrices get(quickfix.field.NoUnderlyingReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingReturnRatePrices getNoUnderlyingReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoUnderlyingReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingReturnRatePrices() {
    return isSetField(43064);
  }

public static class NoUnderlyingReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43065, 43066, 43067, 43068, 0};

  public NoUnderlyingReturnRatePrices() {
    super(43064, 43065, ORDER);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis get(quickfix.field.UnderlyingReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis getUnderlyingReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceBasis() {
    return isSetField(43065);
  }

  public void set(quickfix.field.UnderlyingReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePrice get(quickfix.field.UnderlyingReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePrice getUnderlyingReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePrice() {
    return isSetField(43066);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency get(quickfix.field.UnderlyingReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency getUnderlyingReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceCurrency() {
    return isSetField(43067);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceType get(quickfix.field.UnderlyingReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceType getUnderlyingReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceType() {
    return isSetField(43068);
  }
}

  public void set(quickfix.field.UnderlyingReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis get(quickfix.field.UnderlyingReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceBasis getUnderlyingReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceBasis() {
    return isSetField(43065);
  }

  public void set(quickfix.field.UnderlyingReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePrice get(quickfix.field.UnderlyingReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePrice getUnderlyingReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePrice());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePrice() {
    return isSetField(43066);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency get(quickfix.field.UnderlyingReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceCurrency getUnderlyingReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceCurrency() {
    return isSetField(43067);
  }

  public void set(quickfix.field.UnderlyingReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingReturnRatePriceType get(quickfix.field.UnderlyingReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingReturnRatePriceType getUnderlyingReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.UnderlyingReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingReturnRatePriceType() {
    return isSetField(43068);
  }
}

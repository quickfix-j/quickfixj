/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ReturnRatePriceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42765, };
  protected int[] getGroupFields() { return componentGroups; }

  public ReturnRatePriceGrp() {
    super();
  }

  public void set(quickfix.field.NoReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoReturnRatePrices get(quickfix.field.NoReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoReturnRatePrices getNoReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoReturnRatePrices() {
    return isSetField(42765);
  }

public static class NoReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42766, 42767, 42768, 42769, 0};

  public NoReturnRatePrices() {
    super(42765, 42766, ORDER);
  }

  public void set(quickfix.field.ReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceBasis get(quickfix.field.ReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceBasis getReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceBasis() {
    return isSetField(42766);
  }

  public void set(quickfix.field.ReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePrice get(quickfix.field.ReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePrice getReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePrice());
  }

  public boolean isSet(quickfix.field.ReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePrice() {
    return isSetField(42767);
  }

  public void set(quickfix.field.ReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceCurrency get(quickfix.field.ReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceCurrency getReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceCurrency() {
    return isSetField(42768);
  }

  public void set(quickfix.field.ReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceType get(quickfix.field.ReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceType getReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceType() {
    return isSetField(42769);
  }
}

  public void set(quickfix.field.ReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceBasis get(quickfix.field.ReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceBasis getReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceBasis() {
    return isSetField(42766);
  }

  public void set(quickfix.field.ReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePrice get(quickfix.field.ReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePrice getReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePrice());
  }

  public boolean isSet(quickfix.field.ReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePrice() {
    return isSetField(42767);
  }

  public void set(quickfix.field.ReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceCurrency get(quickfix.field.ReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceCurrency getReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceCurrency() {
    return isSetField(42768);
  }

  public void set(quickfix.field.ReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.ReturnRatePriceType get(quickfix.field.ReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ReturnRatePriceType getReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.ReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.ReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetReturnRatePriceType() {
    return isSetField(42769);
  }
}

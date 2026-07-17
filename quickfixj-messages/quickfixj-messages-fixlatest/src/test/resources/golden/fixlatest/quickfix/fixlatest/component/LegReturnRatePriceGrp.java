/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegReturnRatePriceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42564, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegReturnRatePriceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegReturnRatePrices value) {
    setField(value);
  }

  public quickfix.field.NoLegReturnRatePrices get(quickfix.field.NoLegReturnRatePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegReturnRatePrices getNoLegReturnRatePrices() throws FieldNotFound {
    return get(new quickfix.field.NoLegReturnRatePrices());
  }

  public boolean isSet(quickfix.field.NoLegReturnRatePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoLegReturnRatePrices() {
    return isSetField(42564);
  }

public static class NoLegReturnRatePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42565, 42566, 42567, 42568, 0};

  public NoLegReturnRatePrices() {
    super(42564, 42565, ORDER);
  }

  public void set(quickfix.field.LegReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceBasis get(quickfix.field.LegReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceBasis getLegReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceBasis() {
    return isSetField(42565);
  }

  public void set(quickfix.field.LegReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePrice get(quickfix.field.LegReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePrice getLegReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePrice());
  }

  public boolean isSet(quickfix.field.LegReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePrice() {
    return isSetField(42566);
  }

  public void set(quickfix.field.LegReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceCurrency get(quickfix.field.LegReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceCurrency getLegReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceCurrency() {
    return isSetField(42567);
  }

  public void set(quickfix.field.LegReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceType get(quickfix.field.LegReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceType getLegReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceType() {
    return isSetField(42568);
  }
}

  public void set(quickfix.field.LegReturnRatePriceBasis value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceBasis get(quickfix.field.LegReturnRatePriceBasis value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceBasis getLegReturnRatePriceBasis() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceBasis());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceBasis field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceBasis() {
    return isSetField(42565);
  }

  public void set(quickfix.field.LegReturnRatePrice value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePrice get(quickfix.field.LegReturnRatePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePrice getLegReturnRatePrice() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePrice());
  }

  public boolean isSet(quickfix.field.LegReturnRatePrice field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePrice() {
    return isSetField(42566);
  }

  public void set(quickfix.field.LegReturnRatePriceCurrency value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceCurrency get(quickfix.field.LegReturnRatePriceCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceCurrency getLegReturnRatePriceCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceCurrency());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceCurrency() {
    return isSetField(42567);
  }

  public void set(quickfix.field.LegReturnRatePriceType value) {
    setField(value);
  }

  public quickfix.field.LegReturnRatePriceType get(quickfix.field.LegReturnRatePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegReturnRatePriceType getLegReturnRatePriceType() throws FieldNotFound {
    return get(new quickfix.field.LegReturnRatePriceType());
  }

  public boolean isSet(quickfix.field.LegReturnRatePriceType field) {
    return isSetField(field);
  }

  public boolean isSetLegReturnRatePriceType() {
    return isSetField(42568);
  }
}

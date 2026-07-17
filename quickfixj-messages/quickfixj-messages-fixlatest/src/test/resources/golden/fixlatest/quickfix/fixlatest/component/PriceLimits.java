/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PriceLimits extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1306, 1148, 1149, 1150, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PriceLimits() {
    super();
  }

  public void set(quickfix.field.PriceLimitType value) {
    setField(value);
  }

  public quickfix.field.PriceLimitType get(quickfix.field.PriceLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceLimitType getPriceLimitType() throws FieldNotFound {
    return get(new quickfix.field.PriceLimitType());
  }

  public boolean isSet(quickfix.field.PriceLimitType field) {
    return isSetField(field);
  }

  public boolean isSetPriceLimitType() {
    return isSetField(1306);
  }

  public void set(quickfix.field.LowLimitPrice value) {
    setField(value);
  }

  public quickfix.field.LowLimitPrice get(quickfix.field.LowLimitPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LowLimitPrice getLowLimitPrice() throws FieldNotFound {
    return get(new quickfix.field.LowLimitPrice());
  }

  public boolean isSet(quickfix.field.LowLimitPrice field) {
    return isSetField(field);
  }

  public boolean isSetLowLimitPrice() {
    return isSetField(1148);
  }

  public void set(quickfix.field.HighLimitPrice value) {
    setField(value);
  }

  public quickfix.field.HighLimitPrice get(quickfix.field.HighLimitPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HighLimitPrice getHighLimitPrice() throws FieldNotFound {
    return get(new quickfix.field.HighLimitPrice());
  }

  public boolean isSet(quickfix.field.HighLimitPrice field) {
    return isSetField(field);
  }

  public boolean isSetHighLimitPrice() {
    return isSetField(1149);
  }

  public void set(quickfix.field.TradingReferencePrice value) {
    setField(value);
  }

  public quickfix.field.TradingReferencePrice get(quickfix.field.TradingReferencePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingReferencePrice getTradingReferencePrice() throws FieldNotFound {
    return get(new quickfix.field.TradingReferencePrice());
  }

  public boolean isSet(quickfix.field.TradingReferencePrice field) {
    return isSetField(field);
  }

  public boolean isSetTradingReferencePrice() {
    return isSetField(1150);
  }
}

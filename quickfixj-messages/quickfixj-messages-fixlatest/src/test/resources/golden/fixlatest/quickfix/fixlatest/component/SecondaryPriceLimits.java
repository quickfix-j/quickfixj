/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecondaryPriceLimits extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1305, 1221, 1230, 1240, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public SecondaryPriceLimits() {
    super();
  }

  public void set(quickfix.field.SecondaryPriceLimitType value) {
    setField(value);
  }

  public quickfix.field.SecondaryPriceLimitType get(quickfix.field.SecondaryPriceLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryPriceLimitType getSecondaryPriceLimitType() throws FieldNotFound {
    return get(new quickfix.field.SecondaryPriceLimitType());
  }

  public boolean isSet(quickfix.field.SecondaryPriceLimitType field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryPriceLimitType() {
    return isSetField(1305);
  }

  public void set(quickfix.field.SecondaryLowLimitPrice value) {
    setField(value);
  }

  public quickfix.field.SecondaryLowLimitPrice get(quickfix.field.SecondaryLowLimitPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryLowLimitPrice getSecondaryLowLimitPrice() throws FieldNotFound {
    return get(new quickfix.field.SecondaryLowLimitPrice());
  }

  public boolean isSet(quickfix.field.SecondaryLowLimitPrice field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryLowLimitPrice() {
    return isSetField(1221);
  }

  public void set(quickfix.field.SecondaryHighLimitPrice value) {
    setField(value);
  }

  public quickfix.field.SecondaryHighLimitPrice get(quickfix.field.SecondaryHighLimitPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryHighLimitPrice getSecondaryHighLimitPrice() throws FieldNotFound {
    return get(new quickfix.field.SecondaryHighLimitPrice());
  }

  public boolean isSet(quickfix.field.SecondaryHighLimitPrice field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryHighLimitPrice() {
    return isSetField(1230);
  }

  public void set(quickfix.field.SecondaryTradingReferencePrice value) {
    setField(value);
  }

  public quickfix.field.SecondaryTradingReferencePrice get(quickfix.field.SecondaryTradingReferencePrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryTradingReferencePrice getSecondaryTradingReferencePrice() throws FieldNotFound {
    return get(new quickfix.field.SecondaryTradingReferencePrice());
  }

  public boolean isSet(quickfix.field.SecondaryTradingReferencePrice field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryTradingReferencePrice() {
    return isSetField(1240);
  }
}

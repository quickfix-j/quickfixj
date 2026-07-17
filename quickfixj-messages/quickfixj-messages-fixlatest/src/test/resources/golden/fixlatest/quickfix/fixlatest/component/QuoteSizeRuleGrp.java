/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class QuoteSizeRuleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2558, };
  protected int[] getGroupFields() { return componentGroups; }

  public QuoteSizeRuleGrp() {
    super();
  }

  public void set(quickfix.field.NoQuoteSizeRules value) {
    setField(value);
  }

  public quickfix.field.NoQuoteSizeRules get(quickfix.field.NoQuoteSizeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoQuoteSizeRules getNoQuoteSizeRules() throws FieldNotFound {
    return get(new quickfix.field.NoQuoteSizeRules());
  }

  public boolean isSet(quickfix.field.NoQuoteSizeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoQuoteSizeRules() {
    return isSetField(2558);
  }

public static class NoQuoteSizeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {647, 648, 2447, 0};

  public NoQuoteSizeRules() {
    super(2558, 647, ORDER);
  }

  public void set(quickfix.field.MinBidSize value) {
    setField(value);
  }

  public quickfix.field.MinBidSize get(quickfix.field.MinBidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinBidSize getMinBidSize() throws FieldNotFound {
    return get(new quickfix.field.MinBidSize());
  }

  public boolean isSet(quickfix.field.MinBidSize field) {
    return isSetField(field);
  }

  public boolean isSetMinBidSize() {
    return isSetField(647);
  }

  public void set(quickfix.field.MinOfferSize value) {
    setField(value);
  }

  public quickfix.field.MinOfferSize get(quickfix.field.MinOfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinOfferSize getMinOfferSize() throws FieldNotFound {
    return get(new quickfix.field.MinOfferSize());
  }

  public boolean isSet(quickfix.field.MinOfferSize field) {
    return isSetField(field);
  }

  public boolean isSetMinOfferSize() {
    return isSetField(648);
  }

  public void set(quickfix.field.FastMarketIndicator value) {
    setField(value);
  }

  public quickfix.field.FastMarketIndicator get(quickfix.field.FastMarketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FastMarketIndicator getFastMarketIndicator() throws FieldNotFound {
    return get(new quickfix.field.FastMarketIndicator());
  }

  public boolean isSet(quickfix.field.FastMarketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFastMarketIndicator() {
    return isSetField(2447);
  }
}

  public void set(quickfix.field.MinBidSize value) {
    setField(value);
  }

  public quickfix.field.MinBidSize get(quickfix.field.MinBidSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinBidSize getMinBidSize() throws FieldNotFound {
    return get(new quickfix.field.MinBidSize());
  }

  public boolean isSet(quickfix.field.MinBidSize field) {
    return isSetField(field);
  }

  public boolean isSetMinBidSize() {
    return isSetField(647);
  }

  public void set(quickfix.field.MinOfferSize value) {
    setField(value);
  }

  public quickfix.field.MinOfferSize get(quickfix.field.MinOfferSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MinOfferSize getMinOfferSize() throws FieldNotFound {
    return get(new quickfix.field.MinOfferSize());
  }

  public boolean isSet(quickfix.field.MinOfferSize field) {
    return isSetField(field);
  }

  public boolean isSetMinOfferSize() {
    return isSetField(648);
  }

  public void set(quickfix.field.FastMarketIndicator value) {
    setField(value);
  }

  public quickfix.field.FastMarketIndicator get(quickfix.field.FastMarketIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FastMarketIndicator getFastMarketIndicator() throws FieldNotFound {
    return get(new quickfix.field.FastMarketIndicator());
  }

  public boolean isSet(quickfix.field.FastMarketIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFastMarketIndicator() {
    return isSetField(2447);
  }
}

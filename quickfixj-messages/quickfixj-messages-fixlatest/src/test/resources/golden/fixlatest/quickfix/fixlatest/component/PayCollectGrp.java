/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PayCollectGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1707, };
  protected int[] getGroupFields() { return componentGroups; }

  public PayCollectGrp() {
    super();
  }

  public void set(quickfix.field.NoPayCollects value) {
    setField(value);
  }

  public quickfix.field.NoPayCollects get(quickfix.field.NoPayCollects value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPayCollects getNoPayCollects() throws FieldNotFound {
    return get(new quickfix.field.NoPayCollects());
  }

  public boolean isSet(quickfix.field.NoPayCollects field) {
    return isSetField(field);
  }

  public boolean isSetNoPayCollects() {
    return isSetField(1707);
  }

public static class NoPayCollects extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1708, 1709, 2094, 2095, 1710, 1711, 1712, 1713, 0};

  public NoPayCollects() {
    super(1707, 1708, ORDER);
  }

  public void set(quickfix.field.PayCollectType value) {
    setField(value);
  }

  public quickfix.field.PayCollectType get(quickfix.field.PayCollectType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectType getPayCollectType() throws FieldNotFound {
    return get(new quickfix.field.PayCollectType());
  }

  public boolean isSet(quickfix.field.PayCollectType field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectType() {
    return isSetField(1708);
  }

  public void set(quickfix.field.PayCollectCurrency value) {
    setField(value);
  }

  public quickfix.field.PayCollectCurrency get(quickfix.field.PayCollectCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectCurrency getPayCollectCurrency() throws FieldNotFound {
    return get(new quickfix.field.PayCollectCurrency());
  }

  public boolean isSet(quickfix.field.PayCollectCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectCurrency() {
    return isSetField(1709);
  }

  public void set(quickfix.field.PayCollectFXRate value) {
    setField(value);
  }

  public quickfix.field.PayCollectFXRate get(quickfix.field.PayCollectFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectFXRate getPayCollectFXRate() throws FieldNotFound {
    return get(new quickfix.field.PayCollectFXRate());
  }

  public boolean isSet(quickfix.field.PayCollectFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectFXRate() {
    return isSetField(2094);
  }

  public void set(quickfix.field.PayCollectFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PayCollectFXRateCalc get(quickfix.field.PayCollectFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectFXRateCalc getPayCollectFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PayCollectFXRateCalc());
  }

  public boolean isSet(quickfix.field.PayCollectFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectFXRateCalc() {
    return isSetField(2095);
  }

  public void set(quickfix.field.PayAmount value) {
    setField(value);
  }

  public quickfix.field.PayAmount get(quickfix.field.PayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayAmount getPayAmount() throws FieldNotFound {
    return get(new quickfix.field.PayAmount());
  }

  public boolean isSet(quickfix.field.PayAmount field) {
    return isSetField(field);
  }

  public boolean isSetPayAmount() {
    return isSetField(1710);
  }

  public void set(quickfix.field.CollectAmount value) {
    setField(value);
  }

  public quickfix.field.CollectAmount get(quickfix.field.CollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollectAmount getCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.CollectAmount());
  }

  public boolean isSet(quickfix.field.CollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetCollectAmount() {
    return isSetField(1711);
  }

  public void set(quickfix.field.PayCollectMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PayCollectMarketSegmentID get(quickfix.field.PayCollectMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectMarketSegmentID getPayCollectMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PayCollectMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PayCollectMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectMarketSegmentID() {
    return isSetField(1712);
  }

  public void set(quickfix.field.PayCollectMarketID value) {
    setField(value);
  }

  public quickfix.field.PayCollectMarketID get(quickfix.field.PayCollectMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectMarketID getPayCollectMarketID() throws FieldNotFound {
    return get(new quickfix.field.PayCollectMarketID());
  }

  public boolean isSet(quickfix.field.PayCollectMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectMarketID() {
    return isSetField(1713);
  }
}

  public void set(quickfix.field.PayCollectType value) {
    setField(value);
  }

  public quickfix.field.PayCollectType get(quickfix.field.PayCollectType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectType getPayCollectType() throws FieldNotFound {
    return get(new quickfix.field.PayCollectType());
  }

  public boolean isSet(quickfix.field.PayCollectType field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectType() {
    return isSetField(1708);
  }

  public void set(quickfix.field.PayCollectCurrency value) {
    setField(value);
  }

  public quickfix.field.PayCollectCurrency get(quickfix.field.PayCollectCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectCurrency getPayCollectCurrency() throws FieldNotFound {
    return get(new quickfix.field.PayCollectCurrency());
  }

  public boolean isSet(quickfix.field.PayCollectCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectCurrency() {
    return isSetField(1709);
  }

  public void set(quickfix.field.PayCollectFXRate value) {
    setField(value);
  }

  public quickfix.field.PayCollectFXRate get(quickfix.field.PayCollectFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectFXRate getPayCollectFXRate() throws FieldNotFound {
    return get(new quickfix.field.PayCollectFXRate());
  }

  public boolean isSet(quickfix.field.PayCollectFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectFXRate() {
    return isSetField(2094);
  }

  public void set(quickfix.field.PayCollectFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PayCollectFXRateCalc get(quickfix.field.PayCollectFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectFXRateCalc getPayCollectFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PayCollectFXRateCalc());
  }

  public boolean isSet(quickfix.field.PayCollectFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectFXRateCalc() {
    return isSetField(2095);
  }

  public void set(quickfix.field.PayAmount value) {
    setField(value);
  }

  public quickfix.field.PayAmount get(quickfix.field.PayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayAmount getPayAmount() throws FieldNotFound {
    return get(new quickfix.field.PayAmount());
  }

  public boolean isSet(quickfix.field.PayAmount field) {
    return isSetField(field);
  }

  public boolean isSetPayAmount() {
    return isSetField(1710);
  }

  public void set(quickfix.field.CollectAmount value) {
    setField(value);
  }

  public quickfix.field.CollectAmount get(quickfix.field.CollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollectAmount getCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.CollectAmount());
  }

  public boolean isSet(quickfix.field.CollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetCollectAmount() {
    return isSetField(1711);
  }

  public void set(quickfix.field.PayCollectMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PayCollectMarketSegmentID get(quickfix.field.PayCollectMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectMarketSegmentID getPayCollectMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PayCollectMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PayCollectMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectMarketSegmentID() {
    return isSetField(1712);
  }

  public void set(quickfix.field.PayCollectMarketID value) {
    setField(value);
  }

  public quickfix.field.PayCollectMarketID get(quickfix.field.PayCollectMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectMarketID getPayCollectMarketID() throws FieldNotFound {
    return get(new quickfix.field.PayCollectMarketID());
  }

  public boolean isSet(quickfix.field.PayCollectMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectMarketID() {
    return isSetField(1713);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradePriceConditionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1838, };
  protected int[] getGroupFields() { return componentGroups; }

  public TradePriceConditionGrp() {
    super();
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}

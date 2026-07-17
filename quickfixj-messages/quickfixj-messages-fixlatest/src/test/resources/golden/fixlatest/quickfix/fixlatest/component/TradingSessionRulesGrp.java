/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradingSessionRulesGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1309, };
  protected int[] getGroupFields() { return componentGroups; }

  public TradingSessionRulesGrp() {
    super();
  }

  public void set(quickfix.field.NoTradingSessionRules value) {
    setField(value);
  }

  public quickfix.field.NoTradingSessionRules get(quickfix.field.NoTradingSessionRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradingSessionRules getNoTradingSessionRules() throws FieldNotFound {
    return get(new quickfix.field.NoTradingSessionRules());
  }

  public boolean isSet(quickfix.field.NoTradingSessionRules field) {
    return isSetField(field);
  }

  public boolean isSetNoTradingSessionRules() {
    return isSetField(1309);
  }

public static class NoTradingSessionRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {336, 625, 1237, 1239, 1232, 2548, 1235, 1141, 0};

  public NoTradingSessionRules() {
    super(1309, 336, ORDER);
  }

  public void set(quickfix.field.TradingSessionID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionID());
  }

  public boolean isSet(quickfix.field.TradingSessionID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID() {
    return isSetField(336);
  }

  public void set(quickfix.field.TradingSessionSubID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionSubID());
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID() {
    return isSetField(625);
  }

  public void set(quickfix.fixlatest.component.TradingSessionRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradingSessionRules get(quickfix.fixlatest.component.TradingSessionRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradingSessionRules getTradingSessionRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradingSessionRules());
  }
}

  public void set(quickfix.field.TradingSessionID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionID());
  }

  public boolean isSet(quickfix.field.TradingSessionID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionID() {
    return isSetField(336);
  }

  public void set(quickfix.field.TradingSessionSubID value) {
    setField(value);
  }

  public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
    return get(new quickfix.field.TradingSessionSubID());
  }

  public boolean isSet(quickfix.field.TradingSessionSubID field) {
    return isSetField(field);
  }

  public boolean isSetTradingSessionSubID() {
    return isSetField(625);
  }

  public void set(quickfix.fixlatest.component.TradingSessionRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradingSessionRules get(quickfix.fixlatest.component.TradingSessionRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradingSessionRules getTradingSessionRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradingSessionRules());
  }
}

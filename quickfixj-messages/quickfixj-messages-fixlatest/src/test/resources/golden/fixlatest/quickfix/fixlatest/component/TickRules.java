/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TickRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1205, };
  protected int[] getGroupFields() { return componentGroups; }

  public TickRules() {
    super();
  }

  public void set(quickfix.field.NoTickRules value) {
    setField(value);
  }

  public quickfix.field.NoTickRules get(quickfix.field.NoTickRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTickRules getNoTickRules() throws FieldNotFound {
    return get(new quickfix.field.NoTickRules());
  }

  public boolean isSet(quickfix.field.NoTickRules field) {
    return isSetField(field);
  }

  public boolean isSetNoTickRules() {
    return isSetField(1205);
  }

public static class NoTickRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1206, 1207, 1208, 1209, 2571, 1830, 1831, 0};

  public NoTickRules() {
    super(1205, 1206, ORDER);
  }

  public void set(quickfix.field.StartTickPriceRange value) {
    setField(value);
  }

  public quickfix.field.StartTickPriceRange get(quickfix.field.StartTickPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartTickPriceRange getStartTickPriceRange() throws FieldNotFound {
    return get(new quickfix.field.StartTickPriceRange());
  }

  public boolean isSet(quickfix.field.StartTickPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetStartTickPriceRange() {
    return isSetField(1206);
  }

  public void set(quickfix.field.EndTickPriceRange value) {
    setField(value);
  }

  public quickfix.field.EndTickPriceRange get(quickfix.field.EndTickPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndTickPriceRange getEndTickPriceRange() throws FieldNotFound {
    return get(new quickfix.field.EndTickPriceRange());
  }

  public boolean isSet(quickfix.field.EndTickPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetEndTickPriceRange() {
    return isSetField(1207);
  }

  public void set(quickfix.field.TickIncrement value) {
    setField(value);
  }

  public quickfix.field.TickIncrement get(quickfix.field.TickIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickIncrement getTickIncrement() throws FieldNotFound {
    return get(new quickfix.field.TickIncrement());
  }

  public boolean isSet(quickfix.field.TickIncrement field) {
    return isSetField(field);
  }

  public boolean isSetTickIncrement() {
    return isSetField(1208);
  }

  public void set(quickfix.field.TickRuleType value) {
    setField(value);
  }

  public quickfix.field.TickRuleType get(quickfix.field.TickRuleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickRuleType getTickRuleType() throws FieldNotFound {
    return get(new quickfix.field.TickRuleType());
  }

  public boolean isSet(quickfix.field.TickRuleType field) {
    return isSetField(field);
  }

  public boolean isSetTickRuleType() {
    return isSetField(1209);
  }

  public void set(quickfix.field.TickRuleProductComplex value) {
    setField(value);
  }

  public quickfix.field.TickRuleProductComplex get(quickfix.field.TickRuleProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickRuleProductComplex getTickRuleProductComplex() throws FieldNotFound {
    return get(new quickfix.field.TickRuleProductComplex());
  }

  public boolean isSet(quickfix.field.TickRuleProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetTickRuleProductComplex() {
    return isSetField(2571);
  }

  public void set(quickfix.field.SettlPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.SettlPriceIncrement get(quickfix.field.SettlPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceIncrement getSettlPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceIncrement());
  }

  public boolean isSet(quickfix.field.SettlPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceIncrement() {
    return isSetField(1830);
  }

  public void set(quickfix.field.SettlPriceSecondaryIncrement value) {
    setField(value);
  }

  public quickfix.field.SettlPriceSecondaryIncrement get(quickfix.field.SettlPriceSecondaryIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceSecondaryIncrement getSettlPriceSecondaryIncrement() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceSecondaryIncrement());
  }

  public boolean isSet(quickfix.field.SettlPriceSecondaryIncrement field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceSecondaryIncrement() {
    return isSetField(1831);
  }
}

  public void set(quickfix.field.StartTickPriceRange value) {
    setField(value);
  }

  public quickfix.field.StartTickPriceRange get(quickfix.field.StartTickPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartTickPriceRange getStartTickPriceRange() throws FieldNotFound {
    return get(new quickfix.field.StartTickPriceRange());
  }

  public boolean isSet(quickfix.field.StartTickPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetStartTickPriceRange() {
    return isSetField(1206);
  }

  public void set(quickfix.field.EndTickPriceRange value) {
    setField(value);
  }

  public quickfix.field.EndTickPriceRange get(quickfix.field.EndTickPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndTickPriceRange getEndTickPriceRange() throws FieldNotFound {
    return get(new quickfix.field.EndTickPriceRange());
  }

  public boolean isSet(quickfix.field.EndTickPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetEndTickPriceRange() {
    return isSetField(1207);
  }

  public void set(quickfix.field.TickIncrement value) {
    setField(value);
  }

  public quickfix.field.TickIncrement get(quickfix.field.TickIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickIncrement getTickIncrement() throws FieldNotFound {
    return get(new quickfix.field.TickIncrement());
  }

  public boolean isSet(quickfix.field.TickIncrement field) {
    return isSetField(field);
  }

  public boolean isSetTickIncrement() {
    return isSetField(1208);
  }

  public void set(quickfix.field.TickRuleType value) {
    setField(value);
  }

  public quickfix.field.TickRuleType get(quickfix.field.TickRuleType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickRuleType getTickRuleType() throws FieldNotFound {
    return get(new quickfix.field.TickRuleType());
  }

  public boolean isSet(quickfix.field.TickRuleType field) {
    return isSetField(field);
  }

  public boolean isSetTickRuleType() {
    return isSetField(1209);
  }

  public void set(quickfix.field.TickRuleProductComplex value) {
    setField(value);
  }

  public quickfix.field.TickRuleProductComplex get(quickfix.field.TickRuleProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TickRuleProductComplex getTickRuleProductComplex() throws FieldNotFound {
    return get(new quickfix.field.TickRuleProductComplex());
  }

  public boolean isSet(quickfix.field.TickRuleProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetTickRuleProductComplex() {
    return isSetField(2571);
  }

  public void set(quickfix.field.SettlPriceIncrement value) {
    setField(value);
  }

  public quickfix.field.SettlPriceIncrement get(quickfix.field.SettlPriceIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceIncrement getSettlPriceIncrement() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceIncrement());
  }

  public boolean isSet(quickfix.field.SettlPriceIncrement field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceIncrement() {
    return isSetField(1830);
  }

  public void set(quickfix.field.SettlPriceSecondaryIncrement value) {
    setField(value);
  }

  public quickfix.field.SettlPriceSecondaryIncrement get(quickfix.field.SettlPriceSecondaryIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlPriceSecondaryIncrement getSettlPriceSecondaryIncrement() throws FieldNotFound {
    return get(new quickfix.field.SettlPriceSecondaryIncrement());
  }

  public boolean isSet(quickfix.field.SettlPriceSecondaryIncrement field) {
    return isSetField(field);
  }

  public boolean isSetSettlPriceSecondaryIncrement() {
    return isSetField(1831);
  }
}

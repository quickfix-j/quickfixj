/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MatchRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1235, };
  protected int[] getGroupFields() { return componentGroups; }

  public MatchRules() {
    super();
  }

  public void set(quickfix.field.NoMatchRules value) {
    setField(value);
  }

  public quickfix.field.NoMatchRules get(quickfix.field.NoMatchRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchRules getNoMatchRules() throws FieldNotFound {
    return get(new quickfix.field.NoMatchRules());
  }

  public boolean isSet(quickfix.field.NoMatchRules field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchRules() {
    return isSetField(1235);
  }

public static class NoMatchRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1142, 574, 2569, 2570, 0};

  public NoMatchRules() {
    super(1235, 1142, ORDER);
  }

  public void set(quickfix.field.MatchAlgorithm value) {
    setField(value);
  }

  public quickfix.field.MatchAlgorithm get(quickfix.field.MatchAlgorithm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAlgorithm getMatchAlgorithm() throws FieldNotFound {
    return get(new quickfix.field.MatchAlgorithm());
  }

  public boolean isSet(quickfix.field.MatchAlgorithm field) {
    return isSetField(field);
  }

  public boolean isSetMatchAlgorithm() {
    return isSetField(1142);
  }

  public void set(quickfix.field.MatchType value) {
    setField(value);
  }

  public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchType getMatchType() throws FieldNotFound {
    return get(new quickfix.field.MatchType());
  }

  public boolean isSet(quickfix.field.MatchType field) {
    return isSetField(field);
  }

  public boolean isSetMatchType() {
    return isSetField(574);
  }

  public void set(quickfix.field.MatchRuleProductComplex value) {
    setField(value);
  }

  public quickfix.field.MatchRuleProductComplex get(quickfix.field.MatchRuleProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchRuleProductComplex getMatchRuleProductComplex() throws FieldNotFound {
    return get(new quickfix.field.MatchRuleProductComplex());
  }

  public boolean isSet(quickfix.field.MatchRuleProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetMatchRuleProductComplex() {
    return isSetField(2569);
  }

  public void set(quickfix.field.CustomerPriority value) {
    setField(value);
  }

  public quickfix.field.CustomerPriority get(quickfix.field.CustomerPriority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustomerPriority getCustomerPriority() throws FieldNotFound {
    return get(new quickfix.field.CustomerPriority());
  }

  public boolean isSet(quickfix.field.CustomerPriority field) {
    return isSetField(field);
  }

  public boolean isSetCustomerPriority() {
    return isSetField(2570);
  }
}

  public void set(quickfix.field.MatchAlgorithm value) {
    setField(value);
  }

  public quickfix.field.MatchAlgorithm get(quickfix.field.MatchAlgorithm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAlgorithm getMatchAlgorithm() throws FieldNotFound {
    return get(new quickfix.field.MatchAlgorithm());
  }

  public boolean isSet(quickfix.field.MatchAlgorithm field) {
    return isSetField(field);
  }

  public boolean isSetMatchAlgorithm() {
    return isSetField(1142);
  }

  public void set(quickfix.field.MatchType value) {
    setField(value);
  }

  public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchType getMatchType() throws FieldNotFound {
    return get(new quickfix.field.MatchType());
  }

  public boolean isSet(quickfix.field.MatchType field) {
    return isSetField(field);
  }

  public boolean isSetMatchType() {
    return isSetField(574);
  }

  public void set(quickfix.field.MatchRuleProductComplex value) {
    setField(value);
  }

  public quickfix.field.MatchRuleProductComplex get(quickfix.field.MatchRuleProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchRuleProductComplex getMatchRuleProductComplex() throws FieldNotFound {
    return get(new quickfix.field.MatchRuleProductComplex());
  }

  public boolean isSet(quickfix.field.MatchRuleProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetMatchRuleProductComplex() {
    return isSetField(2569);
  }

  public void set(quickfix.field.CustomerPriority value) {
    setField(value);
  }

  public quickfix.field.CustomerPriority get(quickfix.field.CustomerPriority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustomerPriority getCustomerPriority() throws FieldNotFound {
    return get(new quickfix.field.CustomerPriority());
  }

  public boolean isSet(quickfix.field.CustomerPriority field) {
    return isSetField(field);
  }

  public boolean isSetCustomerPriority() {
    return isSetField(2570);
  }
}

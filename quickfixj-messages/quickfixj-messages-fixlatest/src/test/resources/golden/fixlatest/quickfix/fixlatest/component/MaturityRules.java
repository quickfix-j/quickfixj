/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MaturityRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1236, };
  protected int[] getGroupFields() { return componentGroups; }

  public MaturityRules() {
    super();
  }

  public void set(quickfix.field.NoMaturityRules value) {
    setField(value);
  }

  public quickfix.field.NoMaturityRules get(quickfix.field.NoMaturityRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMaturityRules getNoMaturityRules() throws FieldNotFound {
    return get(new quickfix.field.NoMaturityRules());
  }

  public boolean isSet(quickfix.field.NoMaturityRules field) {
    return isSetField(field);
  }

  public boolean isSetNoMaturityRules() {
    return isSetField(1236);
  }

public static class NoMaturityRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1222, 1303, 1302, 1241, 1226, 1229, 0};

  public NoMaturityRules() {
    super(1236, 1222, ORDER);
  }

  public void set(quickfix.field.MaturityRuleID value) {
    setField(value);
  }

  public quickfix.field.MaturityRuleID get(quickfix.field.MaturityRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityRuleID getMaturityRuleID() throws FieldNotFound {
    return get(new quickfix.field.MaturityRuleID());
  }

  public boolean isSet(quickfix.field.MaturityRuleID field) {
    return isSetField(field);
  }

  public boolean isSetMaturityRuleID() {
    return isSetField(1222);
  }

  public void set(quickfix.field.MaturityMonthYearFormat value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearFormat get(quickfix.field.MaturityMonthYearFormat value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearFormat getMaturityMonthYearFormat() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearFormat());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearFormat field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearFormat() {
    return isSetField(1303);
  }

  public void set(quickfix.field.MaturityMonthYearIncrementUnits value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrementUnits get(quickfix.field.MaturityMonthYearIncrementUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrementUnits getMaturityMonthYearIncrementUnits() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrementUnits());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrementUnits field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrementUnits() {
    return isSetField(1302);
  }

  public void set(quickfix.field.StartMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.StartMaturityMonthYear get(quickfix.field.StartMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartMaturityMonthYear getStartMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.StartMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.StartMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetStartMaturityMonthYear() {
    return isSetField(1241);
  }

  public void set(quickfix.field.EndMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.EndMaturityMonthYear get(quickfix.field.EndMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndMaturityMonthYear getEndMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EndMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.EndMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEndMaturityMonthYear() {
    return isSetField(1226);
  }

  public void set(quickfix.field.MaturityMonthYearIncrement value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrement get(quickfix.field.MaturityMonthYearIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrement getMaturityMonthYearIncrement() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrement());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrement() {
    return isSetField(1229);
  }
}

  public void set(quickfix.field.MaturityRuleID value) {
    setField(value);
  }

  public quickfix.field.MaturityRuleID get(quickfix.field.MaturityRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityRuleID getMaturityRuleID() throws FieldNotFound {
    return get(new quickfix.field.MaturityRuleID());
  }

  public boolean isSet(quickfix.field.MaturityRuleID field) {
    return isSetField(field);
  }

  public boolean isSetMaturityRuleID() {
    return isSetField(1222);
  }

  public void set(quickfix.field.MaturityMonthYearFormat value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearFormat get(quickfix.field.MaturityMonthYearFormat value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearFormat getMaturityMonthYearFormat() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearFormat());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearFormat field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearFormat() {
    return isSetField(1303);
  }

  public void set(quickfix.field.MaturityMonthYearIncrementUnits value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrementUnits get(quickfix.field.MaturityMonthYearIncrementUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrementUnits getMaturityMonthYearIncrementUnits() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrementUnits());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrementUnits field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrementUnits() {
    return isSetField(1302);
  }

  public void set(quickfix.field.StartMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.StartMaturityMonthYear get(quickfix.field.StartMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartMaturityMonthYear getStartMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.StartMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.StartMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetStartMaturityMonthYear() {
    return isSetField(1241);
  }

  public void set(quickfix.field.EndMaturityMonthYear value) {
    setField(value);
  }

  public quickfix.field.EndMaturityMonthYear get(quickfix.field.EndMaturityMonthYear value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndMaturityMonthYear getEndMaturityMonthYear() throws FieldNotFound {
    return get(new quickfix.field.EndMaturityMonthYear());
  }

  public boolean isSet(quickfix.field.EndMaturityMonthYear field) {
    return isSetField(field);
  }

  public boolean isSetEndMaturityMonthYear() {
    return isSetField(1226);
  }

  public void set(quickfix.field.MaturityMonthYearIncrement value) {
    setField(value);
  }

  public quickfix.field.MaturityMonthYearIncrement get(quickfix.field.MaturityMonthYearIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MaturityMonthYearIncrement getMaturityMonthYearIncrement() throws FieldNotFound {
    return get(new quickfix.field.MaturityMonthYearIncrement());
  }

  public boolean isSet(quickfix.field.MaturityMonthYearIncrement field) {
    return isSetField(field);
  }

  public boolean isSetMaturityMonthYearIncrement() {
    return isSetField(1229);
  }
}

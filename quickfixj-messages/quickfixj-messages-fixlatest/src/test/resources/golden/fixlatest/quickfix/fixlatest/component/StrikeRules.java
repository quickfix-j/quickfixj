/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StrikeRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1201, };
  protected int[] getGroupFields() { return componentGroups; }

  public StrikeRules() {
    super();
  }

  public void set(quickfix.field.NoStrikeRules value) {
    setField(value);
  }

  public quickfix.field.NoStrikeRules get(quickfix.field.NoStrikeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrikeRules getNoStrikeRules() throws FieldNotFound {
    return get(new quickfix.field.NoStrikeRules());
  }

  public boolean isSet(quickfix.field.NoStrikeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoStrikeRules() {
    return isSetField(1201);
  }

public static class NoStrikeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1223, 1202, 1203, 1204, 1304, 1236, 0};

  public NoStrikeRules() {
    super(1201, 1223, ORDER);
  }

  public void set(quickfix.field.StrikeRuleID value) {
    setField(value);
  }

  public quickfix.field.StrikeRuleID get(quickfix.field.StrikeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeRuleID getStrikeRuleID() throws FieldNotFound {
    return get(new quickfix.field.StrikeRuleID());
  }

  public boolean isSet(quickfix.field.StrikeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetStrikeRuleID() {
    return isSetField(1223);
  }

  public void set(quickfix.field.StartStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.StartStrikePxRange get(quickfix.field.StartStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartStrikePxRange getStartStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.StartStrikePxRange());
  }

  public boolean isSet(quickfix.field.StartStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetStartStrikePxRange() {
    return isSetField(1202);
  }

  public void set(quickfix.field.EndStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.EndStrikePxRange get(quickfix.field.EndStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndStrikePxRange getEndStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.EndStrikePxRange());
  }

  public boolean isSet(quickfix.field.EndStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetEndStrikePxRange() {
    return isSetField(1203);
  }

  public void set(quickfix.field.StrikeIncrement value) {
    setField(value);
  }

  public quickfix.field.StrikeIncrement get(quickfix.field.StrikeIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIncrement getStrikeIncrement() throws FieldNotFound {
    return get(new quickfix.field.StrikeIncrement());
  }

  public boolean isSet(quickfix.field.StrikeIncrement field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIncrement() {
    return isSetField(1204);
  }

  public void set(quickfix.field.StrikeExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.StrikeExerciseStyle get(quickfix.field.StrikeExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeExerciseStyle getStrikeExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.StrikeExerciseStyle());
  }

  public boolean isSet(quickfix.field.StrikeExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetStrikeExerciseStyle() {
    return isSetField(1304);
  }

  public void set(quickfix.fixlatest.component.MaturityRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MaturityRules get(quickfix.fixlatest.component.MaturityRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MaturityRules getMaturityRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MaturityRules());
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
}

  public void set(quickfix.field.StrikeRuleID value) {
    setField(value);
  }

  public quickfix.field.StrikeRuleID get(quickfix.field.StrikeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeRuleID getStrikeRuleID() throws FieldNotFound {
    return get(new quickfix.field.StrikeRuleID());
  }

  public boolean isSet(quickfix.field.StrikeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetStrikeRuleID() {
    return isSetField(1223);
  }

  public void set(quickfix.field.StartStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.StartStrikePxRange get(quickfix.field.StartStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartStrikePxRange getStartStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.StartStrikePxRange());
  }

  public boolean isSet(quickfix.field.StartStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetStartStrikePxRange() {
    return isSetField(1202);
  }

  public void set(quickfix.field.EndStrikePxRange value) {
    setField(value);
  }

  public quickfix.field.EndStrikePxRange get(quickfix.field.EndStrikePxRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndStrikePxRange getEndStrikePxRange() throws FieldNotFound {
    return get(new quickfix.field.EndStrikePxRange());
  }

  public boolean isSet(quickfix.field.EndStrikePxRange field) {
    return isSetField(field);
  }

  public boolean isSetEndStrikePxRange() {
    return isSetField(1203);
  }

  public void set(quickfix.field.StrikeIncrement value) {
    setField(value);
  }

  public quickfix.field.StrikeIncrement get(quickfix.field.StrikeIncrement value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeIncrement getStrikeIncrement() throws FieldNotFound {
    return get(new quickfix.field.StrikeIncrement());
  }

  public boolean isSet(quickfix.field.StrikeIncrement field) {
    return isSetField(field);
  }

  public boolean isSetStrikeIncrement() {
    return isSetField(1204);
  }

  public void set(quickfix.field.StrikeExerciseStyle value) {
    setField(value);
  }

  public quickfix.field.StrikeExerciseStyle get(quickfix.field.StrikeExerciseStyle value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrikeExerciseStyle getStrikeExerciseStyle() throws FieldNotFound {
    return get(new quickfix.field.StrikeExerciseStyle());
  }

  public boolean isSet(quickfix.field.StrikeExerciseStyle field) {
    return isSetField(field);
  }

  public boolean isSetStrikeExerciseStyle() {
    return isSetField(1304);
  }

  public void set(quickfix.fixlatest.component.MaturityRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MaturityRules get(quickfix.fixlatest.component.MaturityRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MaturityRules getMaturityRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MaturityRules());
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
}

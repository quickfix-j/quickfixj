/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeSecurityDefinition extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeSecurityDefinition() {
    super();
  }

  public void set(quickfix.fixlatest.component.DerivativeInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrument get(quickfix.fixlatest.component.DerivativeInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrument getDerivativeInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrument());
  }

  public void set(quickfix.fixlatest.component.DerivativeInstrumentAttribute component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DerivativeInstrumentAttribute get(quickfix.fixlatest.component.DerivativeInstrumentAttribute component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DerivativeInstrumentAttribute getDerivativeInstrumentAttributeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DerivativeInstrumentAttribute());
  }

  public void set(quickfix.field.NoDerivativeInstrAttrib value) {
    setField(value);
  }

  public quickfix.field.NoDerivativeInstrAttrib get(quickfix.field.NoDerivativeInstrAttrib value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDerivativeInstrAttrib getNoDerivativeInstrAttrib() throws FieldNotFound {
    return get(new quickfix.field.NoDerivativeInstrAttrib());
  }

  public boolean isSet(quickfix.field.NoDerivativeInstrAttrib field) {
    return isSetField(field);
  }

  public boolean isSetNoDerivativeInstrAttrib() {
    return isSetField(1311);
  }

public static class NoDerivativeInstrAttrib extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1313, 1314, 0};

  public NoDerivativeInstrAttrib() {
    super(1311, 1313, ORDER);
  }

  public void set(quickfix.field.DerivativeInstrAttribType value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrAttribType get(quickfix.field.DerivativeInstrAttribType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrAttribType getDerivativeInstrAttribType() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrAttribType());
  }

  public boolean isSet(quickfix.field.DerivativeInstrAttribType field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrAttribType() {
    return isSetField(1313);
  }

  public void set(quickfix.field.DerivativeInstrAttribValue value) {
    setField(value);
  }

  public quickfix.field.DerivativeInstrAttribValue get(quickfix.field.DerivativeInstrAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeInstrAttribValue getDerivativeInstrAttribValue() throws FieldNotFound {
    return get(new quickfix.field.DerivativeInstrAttribValue());
  }

  public boolean isSet(quickfix.field.DerivativeInstrAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeInstrAttribValue() {
    return isSetField(1314);
  }
}

  public void set(quickfix.fixlatest.component.MarketSegmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketSegmentGrp get(quickfix.fixlatest.component.MarketSegmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketSegmentGrp getMarketSegmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketSegmentGrp());
  }

  public void set(quickfix.field.NoMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoMarketSegments get(quickfix.field.NoMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketSegments getNoMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoMarketSegments());
  }

  public boolean isSet(quickfix.field.NoMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketSegments() {
    return isSetField(1310);
  }

public static class NoMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1301, 1300, 1205, 1234, 1306, 1148, 1149, 1150, 2550, 2558, 827, 1786, 562, 1140, 1143, 1144, 1245, 561, 1377, 1378, 423, 2557, 2559, 1309, 1312, 1201, 0};

  public NoMarketSegments() {
    super(1310, 1301, ORDER);
  }

  public void set(quickfix.field.MarketID value) {
    setField(value);
  }

  public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketID getMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarketID());
  }

  public boolean isSet(quickfix.field.MarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarketID() {
    return isSetField(1301);
  }

  public void set(quickfix.field.MarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentID() {
    return isSetField(1300);
  }

  public void set(quickfix.fixlatest.component.SecurityTradingRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecurityTradingRules get(quickfix.fixlatest.component.SecurityTradingRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecurityTradingRules getSecurityTradingRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecurityTradingRules());
  }

  public void set(quickfix.fixlatest.component.StrikeRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.StrikeRules get(quickfix.fixlatest.component.StrikeRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.StrikeRules getStrikeRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.StrikeRules());
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
}

  public void set(quickfix.fixlatest.component.SecurityClassificationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SecurityClassificationGrp get(quickfix.fixlatest.component.SecurityClassificationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SecurityClassificationGrp getSecurityClassificationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SecurityClassificationGrp());
  }

  public void set(quickfix.field.NoSecurityClassifications value) {
    setField(value);
  }

  public quickfix.field.NoSecurityClassifications get(quickfix.field.NoSecurityClassifications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityClassifications getNoSecurityClassifications() throws FieldNotFound {
    return get(new quickfix.field.NoSecurityClassifications());
  }

  public boolean isSet(quickfix.field.NoSecurityClassifications field) {
    return isSetField(field);
  }

  public boolean isSetNoSecurityClassifications() {
    return isSetField(1582);
  }

public static class NoSecurityClassifications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1583, 1584, 0};

  public NoSecurityClassifications() {
    super(1582, 1583, ORDER);
  }

  public void set(quickfix.field.SecurityClassificationReason value) {
    setField(value);
  }

  public quickfix.field.SecurityClassificationReason get(quickfix.field.SecurityClassificationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityClassificationReason getSecurityClassificationReason() throws FieldNotFound {
    return get(new quickfix.field.SecurityClassificationReason());
  }

  public boolean isSet(quickfix.field.SecurityClassificationReason field) {
    return isSetField(field);
  }

  public boolean isSetSecurityClassificationReason() {
    return isSetField(1583);
  }

  public void set(quickfix.field.SecurityClassificationValue value) {
    setField(value);
  }

  public quickfix.field.SecurityClassificationValue get(quickfix.field.SecurityClassificationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityClassificationValue getSecurityClassificationValue() throws FieldNotFound {
    return get(new quickfix.field.SecurityClassificationValue());
  }

  public boolean isSet(quickfix.field.SecurityClassificationValue field) {
    return isSetField(field);
  }

  public boolean isSetSecurityClassificationValue() {
    return isSetField(1584);
  }
}
}

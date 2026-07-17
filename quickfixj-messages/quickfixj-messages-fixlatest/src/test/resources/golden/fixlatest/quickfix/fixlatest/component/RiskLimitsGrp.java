/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RiskLimitsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1669, };
  protected int[] getGroupFields() { return componentGroups; }

  public RiskLimitsGrp() {
    super();
  }

  public void set(quickfix.field.NoRiskLimits value) {
    setField(value);
  }

  public quickfix.field.NoRiskLimits get(quickfix.field.NoRiskLimits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskLimits getNoRiskLimits() throws FieldNotFound {
    return get(new quickfix.field.NoRiskLimits());
  }

  public boolean isSet(quickfix.field.NoRiskLimits field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskLimits() {
    return isSetField(1669);
  }

public static class NoRiskLimits extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1529, 1534, 0};

  public NoRiskLimits() {
    super(1669, 1529, ORDER);
  }

  public void set(quickfix.fixlatest.component.RiskLimitTypesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskLimitTypesGrp get(quickfix.fixlatest.component.RiskLimitTypesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskLimitTypesGrp getRiskLimitTypesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskLimitTypesGrp());
  }

  public void set(quickfix.field.NoRiskLimitTypes value) {
    setField(value);
  }

  public quickfix.field.NoRiskLimitTypes get(quickfix.field.NoRiskLimitTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskLimitTypes getNoRiskLimitTypes() throws FieldNotFound {
    return get(new quickfix.field.NoRiskLimitTypes());
  }

  public boolean isSet(quickfix.field.NoRiskLimitTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskLimitTypes() {
    return isSetField(1529);
  }

public static class NoRiskLimitTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1530, 1531, 1767, 1766, 1765, 1532, 1533, 2336, 2337, 1559, 0};

  public NoRiskLimitTypes() {
    super(1529, 1530, ORDER);
  }

  public void set(quickfix.field.RiskLimitType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitType get(quickfix.field.RiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitType getRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitType());
  }

  public boolean isSet(quickfix.field.RiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitType() {
    return isSetField(1530);
  }

  public void set(quickfix.field.RiskLimitAmount value) {
    setField(value);
  }

  public quickfix.field.RiskLimitAmount get(quickfix.field.RiskLimitAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitAmount getRiskLimitAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitAmount());
  }

  public boolean isSet(quickfix.field.RiskLimitAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitAmount() {
    return isSetField(1531);
  }

  public void set(quickfix.field.RiskLimitAction value) {
    setField(value);
  }

  public quickfix.field.RiskLimitAction get(quickfix.field.RiskLimitAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitAction getRiskLimitAction() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitAction());
  }

  public boolean isSet(quickfix.field.RiskLimitAction field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitAction() {
    return isSetField(1767);
  }

  public void set(quickfix.field.RiskLimitUtilizationAmount value) {
    setField(value);
  }

  public quickfix.field.RiskLimitUtilizationAmount get(quickfix.field.RiskLimitUtilizationAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitUtilizationAmount getRiskLimitUtilizationAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitUtilizationAmount());
  }

  public boolean isSet(quickfix.field.RiskLimitUtilizationAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitUtilizationAmount() {
    return isSetField(1766);
  }

  public void set(quickfix.field.RiskLimitUtilizationPercent value) {
    setField(value);
  }

  public quickfix.field.RiskLimitUtilizationPercent get(quickfix.field.RiskLimitUtilizationPercent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitUtilizationPercent getRiskLimitUtilizationPercent() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitUtilizationPercent());
  }

  public boolean isSet(quickfix.field.RiskLimitUtilizationPercent field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitUtilizationPercent() {
    return isSetField(1765);
  }

  public void set(quickfix.field.RiskLimitCurrency value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCurrency get(quickfix.field.RiskLimitCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCurrency getRiskLimitCurrency() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCurrency());
  }

  public boolean isSet(quickfix.field.RiskLimitCurrency field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCurrency() {
    return isSetField(1532);
  }

  public void set(quickfix.field.RiskLimitPlatform value) {
    setField(value);
  }

  public quickfix.field.RiskLimitPlatform get(quickfix.field.RiskLimitPlatform value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitPlatform getRiskLimitPlatform() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitPlatform());
  }

  public boolean isSet(quickfix.field.RiskLimitPlatform field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitPlatform() {
    return isSetField(1533);
  }

  public void set(quickfix.field.RiskLimitVelocityPeriod value) {
    setField(value);
  }

  public quickfix.field.RiskLimitVelocityPeriod get(quickfix.field.RiskLimitVelocityPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitVelocityPeriod getRiskLimitVelocityPeriod() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitVelocityPeriod());
  }

  public boolean isSet(quickfix.field.RiskLimitVelocityPeriod field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitVelocityPeriod() {
    return isSetField(2336);
  }

  public void set(quickfix.field.RiskLimitVelocityUnit value) {
    setField(value);
  }

  public quickfix.field.RiskLimitVelocityUnit get(quickfix.field.RiskLimitVelocityUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitVelocityUnit getRiskLimitVelocityUnit() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitVelocityUnit());
  }

  public boolean isSet(quickfix.field.RiskLimitVelocityUnit field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitVelocityUnit() {
    return isSetField(2337);
  }

  public void set(quickfix.fixlatest.component.RiskWarningLevelGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskWarningLevelGrp get(quickfix.fixlatest.component.RiskWarningLevelGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskWarningLevelGrp getRiskWarningLevelGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskWarningLevelGrp());
  }

  public void set(quickfix.field.NoRiskWarningLevels value) {
    setField(value);
  }

  public quickfix.field.NoRiskWarningLevels get(quickfix.field.NoRiskWarningLevels value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskWarningLevels getNoRiskWarningLevels() throws FieldNotFound {
    return get(new quickfix.field.NoRiskWarningLevels());
  }

  public boolean isSet(quickfix.field.NoRiskWarningLevels field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskWarningLevels() {
    return isSetField(1559);
  }

public static class NoRiskWarningLevels extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1769, 1560, 1768, 1561, 0};

  public NoRiskWarningLevels() {
    super(1559, 1769, ORDER);
  }

  public void set(quickfix.field.RiskWarningLevelAction value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelAction get(quickfix.field.RiskWarningLevelAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelAction getRiskWarningLevelAction() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelAction());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelAction field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelAction() {
    return isSetField(1769);
  }

  public void set(quickfix.field.RiskWarningLevelPercent value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelPercent get(quickfix.field.RiskWarningLevelPercent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelPercent getRiskWarningLevelPercent() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelPercent());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelPercent field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelPercent() {
    return isSetField(1560);
  }

  public void set(quickfix.field.RiskWarningLevelAmount value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelAmount get(quickfix.field.RiskWarningLevelAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelAmount getRiskWarningLevelAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelAmount());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelAmount() {
    return isSetField(1768);
  }

  public void set(quickfix.field.RiskWarningLevelName value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelName get(quickfix.field.RiskWarningLevelName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelName getRiskWarningLevelName() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelName());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelName field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelName() {
    return isSetField(1561);
  }
}
}

  public void set(quickfix.fixlatest.component.RiskInstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskInstrumentScopeGrp get(quickfix.fixlatest.component.RiskInstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskInstrumentScopeGrp getRiskInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskInstrumentScopeGrp());
  }

  public void set(quickfix.field.NoRiskInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoRiskInstrumentScopes get(quickfix.field.NoRiskInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskInstrumentScopes getNoRiskInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoRiskInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoRiskInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskInstrumentScopes() {
    return isSetField(1534);
  }

public static class NoRiskInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 1558, 0};

  public NoRiskInstrumentScopes() {
    super(1534, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }

  public void set(quickfix.field.RiskInstrumentMultiplier value) {
    setField(value);
  }

  public quickfix.field.RiskInstrumentMultiplier get(quickfix.field.RiskInstrumentMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskInstrumentMultiplier getRiskInstrumentMultiplier() throws FieldNotFound {
    return get(new quickfix.field.RiskInstrumentMultiplier());
  }

  public boolean isSet(quickfix.field.RiskInstrumentMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetRiskInstrumentMultiplier() {
    return isSetField(1558);
  }
}
}

  public void set(quickfix.fixlatest.component.RiskLimitTypesGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskLimitTypesGrp get(quickfix.fixlatest.component.RiskLimitTypesGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskLimitTypesGrp getRiskLimitTypesGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskLimitTypesGrp());
  }

  public void set(quickfix.field.NoRiskLimitTypes value) {
    setField(value);
  }

  public quickfix.field.NoRiskLimitTypes get(quickfix.field.NoRiskLimitTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskLimitTypes getNoRiskLimitTypes() throws FieldNotFound {
    return get(new quickfix.field.NoRiskLimitTypes());
  }

  public boolean isSet(quickfix.field.NoRiskLimitTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskLimitTypes() {
    return isSetField(1529);
  }

public static class NoRiskLimitTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1530, 1531, 1767, 1766, 1765, 1532, 1533, 2336, 2337, 1559, 0};

  public NoRiskLimitTypes() {
    super(1529, 1530, ORDER);
  }

  public void set(quickfix.field.RiskLimitType value) {
    setField(value);
  }

  public quickfix.field.RiskLimitType get(quickfix.field.RiskLimitType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitType getRiskLimitType() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitType());
  }

  public boolean isSet(quickfix.field.RiskLimitType field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitType() {
    return isSetField(1530);
  }

  public void set(quickfix.field.RiskLimitAmount value) {
    setField(value);
  }

  public quickfix.field.RiskLimitAmount get(quickfix.field.RiskLimitAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitAmount getRiskLimitAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitAmount());
  }

  public boolean isSet(quickfix.field.RiskLimitAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitAmount() {
    return isSetField(1531);
  }

  public void set(quickfix.field.RiskLimitAction value) {
    setField(value);
  }

  public quickfix.field.RiskLimitAction get(quickfix.field.RiskLimitAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitAction getRiskLimitAction() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitAction());
  }

  public boolean isSet(quickfix.field.RiskLimitAction field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitAction() {
    return isSetField(1767);
  }

  public void set(quickfix.field.RiskLimitUtilizationAmount value) {
    setField(value);
  }

  public quickfix.field.RiskLimitUtilizationAmount get(quickfix.field.RiskLimitUtilizationAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitUtilizationAmount getRiskLimitUtilizationAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitUtilizationAmount());
  }

  public boolean isSet(quickfix.field.RiskLimitUtilizationAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitUtilizationAmount() {
    return isSetField(1766);
  }

  public void set(quickfix.field.RiskLimitUtilizationPercent value) {
    setField(value);
  }

  public quickfix.field.RiskLimitUtilizationPercent get(quickfix.field.RiskLimitUtilizationPercent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitUtilizationPercent getRiskLimitUtilizationPercent() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitUtilizationPercent());
  }

  public boolean isSet(quickfix.field.RiskLimitUtilizationPercent field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitUtilizationPercent() {
    return isSetField(1765);
  }

  public void set(quickfix.field.RiskLimitCurrency value) {
    setField(value);
  }

  public quickfix.field.RiskLimitCurrency get(quickfix.field.RiskLimitCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitCurrency getRiskLimitCurrency() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitCurrency());
  }

  public boolean isSet(quickfix.field.RiskLimitCurrency field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitCurrency() {
    return isSetField(1532);
  }

  public void set(quickfix.field.RiskLimitPlatform value) {
    setField(value);
  }

  public quickfix.field.RiskLimitPlatform get(quickfix.field.RiskLimitPlatform value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitPlatform getRiskLimitPlatform() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitPlatform());
  }

  public boolean isSet(quickfix.field.RiskLimitPlatform field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitPlatform() {
    return isSetField(1533);
  }

  public void set(quickfix.field.RiskLimitVelocityPeriod value) {
    setField(value);
  }

  public quickfix.field.RiskLimitVelocityPeriod get(quickfix.field.RiskLimitVelocityPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitVelocityPeriod getRiskLimitVelocityPeriod() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitVelocityPeriod());
  }

  public boolean isSet(quickfix.field.RiskLimitVelocityPeriod field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitVelocityPeriod() {
    return isSetField(2336);
  }

  public void set(quickfix.field.RiskLimitVelocityUnit value) {
    setField(value);
  }

  public quickfix.field.RiskLimitVelocityUnit get(quickfix.field.RiskLimitVelocityUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskLimitVelocityUnit getRiskLimitVelocityUnit() throws FieldNotFound {
    return get(new quickfix.field.RiskLimitVelocityUnit());
  }

  public boolean isSet(quickfix.field.RiskLimitVelocityUnit field) {
    return isSetField(field);
  }

  public boolean isSetRiskLimitVelocityUnit() {
    return isSetField(2337);
  }

  public void set(quickfix.fixlatest.component.RiskWarningLevelGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskWarningLevelGrp get(quickfix.fixlatest.component.RiskWarningLevelGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskWarningLevelGrp getRiskWarningLevelGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskWarningLevelGrp());
  }

  public void set(quickfix.field.NoRiskWarningLevels value) {
    setField(value);
  }

  public quickfix.field.NoRiskWarningLevels get(quickfix.field.NoRiskWarningLevels value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskWarningLevels getNoRiskWarningLevels() throws FieldNotFound {
    return get(new quickfix.field.NoRiskWarningLevels());
  }

  public boolean isSet(quickfix.field.NoRiskWarningLevels field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskWarningLevels() {
    return isSetField(1559);
  }

public static class NoRiskWarningLevels extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1769, 1560, 1768, 1561, 0};

  public NoRiskWarningLevels() {
    super(1559, 1769, ORDER);
  }

  public void set(quickfix.field.RiskWarningLevelAction value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelAction get(quickfix.field.RiskWarningLevelAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelAction getRiskWarningLevelAction() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelAction());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelAction field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelAction() {
    return isSetField(1769);
  }

  public void set(quickfix.field.RiskWarningLevelPercent value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelPercent get(quickfix.field.RiskWarningLevelPercent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelPercent getRiskWarningLevelPercent() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelPercent());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelPercent field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelPercent() {
    return isSetField(1560);
  }

  public void set(quickfix.field.RiskWarningLevelAmount value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelAmount get(quickfix.field.RiskWarningLevelAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelAmount getRiskWarningLevelAmount() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelAmount());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelAmount field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelAmount() {
    return isSetField(1768);
  }

  public void set(quickfix.field.RiskWarningLevelName value) {
    setField(value);
  }

  public quickfix.field.RiskWarningLevelName get(quickfix.field.RiskWarningLevelName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskWarningLevelName getRiskWarningLevelName() throws FieldNotFound {
    return get(new quickfix.field.RiskWarningLevelName());
  }

  public boolean isSet(quickfix.field.RiskWarningLevelName field) {
    return isSetField(field);
  }

  public boolean isSetRiskWarningLevelName() {
    return isSetField(1561);
  }
}
}

  public void set(quickfix.fixlatest.component.RiskInstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RiskInstrumentScopeGrp get(quickfix.fixlatest.component.RiskInstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RiskInstrumentScopeGrp getRiskInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RiskInstrumentScopeGrp());
  }

  public void set(quickfix.field.NoRiskInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoRiskInstrumentScopes get(quickfix.field.NoRiskInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskInstrumentScopes getNoRiskInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoRiskInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoRiskInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskInstrumentScopes() {
    return isSetField(1534);
  }

public static class NoRiskInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 1558, 0};

  public NoRiskInstrumentScopes() {
    super(1534, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }

  public void set(quickfix.field.RiskInstrumentMultiplier value) {
    setField(value);
  }

  public quickfix.field.RiskInstrumentMultiplier get(quickfix.field.RiskInstrumentMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskInstrumentMultiplier getRiskInstrumentMultiplier() throws FieldNotFound {
    return get(new quickfix.field.RiskInstrumentMultiplier());
  }

  public boolean isSet(quickfix.field.RiskInstrumentMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetRiskInstrumentMultiplier() {
    return isSetField(1558);
  }
}
}

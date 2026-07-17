/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RiskLimitTypesGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1529, };
  protected int[] getGroupFields() { return componentGroups; }

  public RiskLimitTypesGrp() {
    super();
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

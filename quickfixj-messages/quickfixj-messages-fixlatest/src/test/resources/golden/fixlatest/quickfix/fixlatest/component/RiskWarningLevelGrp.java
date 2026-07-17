/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RiskWarningLevelGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1559, };
  protected int[] getGroupFields() { return componentGroups; }

  public RiskWarningLevelGrp() {
    super();
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

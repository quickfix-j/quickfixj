/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StrategyParametersGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {957, };
  protected int[] getGroupFields() { return componentGroups; }

  public StrategyParametersGrp() {
    super();
  }

  public void set(quickfix.field.NoStrategyParameters value) {
    setField(value);
  }

  public quickfix.field.NoStrategyParameters get(quickfix.field.NoStrategyParameters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStrategyParameters getNoStrategyParameters() throws FieldNotFound {
    return get(new quickfix.field.NoStrategyParameters());
  }

  public boolean isSet(quickfix.field.NoStrategyParameters field) {
    return isSetField(field);
  }

  public boolean isSetNoStrategyParameters() {
    return isSetField(957);
  }

public static class NoStrategyParameters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {958, 959, 960, 0};

  public NoStrategyParameters() {
    super(957, 958, ORDER);
  }

  public void set(quickfix.field.StrategyParameterName value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterName get(quickfix.field.StrategyParameterName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterName getStrategyParameterName() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterName());
  }

  public boolean isSet(quickfix.field.StrategyParameterName field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterName() {
    return isSetField(958);
  }

  public void set(quickfix.field.StrategyParameterType value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterType get(quickfix.field.StrategyParameterType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterType getStrategyParameterType() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterType());
  }

  public boolean isSet(quickfix.field.StrategyParameterType field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterType() {
    return isSetField(959);
  }

  public void set(quickfix.field.StrategyParameterValue value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterValue get(quickfix.field.StrategyParameterValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterValue getStrategyParameterValue() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterValue());
  }

  public boolean isSet(quickfix.field.StrategyParameterValue field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterValue() {
    return isSetField(960);
  }
}

  public void set(quickfix.field.StrategyParameterName value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterName get(quickfix.field.StrategyParameterName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterName getStrategyParameterName() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterName());
  }

  public boolean isSet(quickfix.field.StrategyParameterName field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterName() {
    return isSetField(958);
  }

  public void set(quickfix.field.StrategyParameterType value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterType get(quickfix.field.StrategyParameterType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterType getStrategyParameterType() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterType());
  }

  public boolean isSet(quickfix.field.StrategyParameterType field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterType() {
    return isSetField(959);
  }

  public void set(quickfix.field.StrategyParameterValue value) {
    setField(value);
  }

  public quickfix.field.StrategyParameterValue get(quickfix.field.StrategyParameterValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StrategyParameterValue getStrategyParameterValue() throws FieldNotFound {
    return get(new quickfix.field.StrategyParameterValue());
  }

  public boolean isSet(quickfix.field.StrategyParameterValue field) {
    return isSetField(field);
  }

  public boolean isSetStrategyParameterValue() {
    return isSetField(960);
  }
}

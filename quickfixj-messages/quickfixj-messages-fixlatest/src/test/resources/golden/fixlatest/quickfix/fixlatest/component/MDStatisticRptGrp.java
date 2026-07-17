/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MDStatisticRptGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2474, };
  protected int[] getGroupFields() { return componentGroups; }

  public MDStatisticRptGrp() {
    super();
  }

  public void set(quickfix.field.NoMDStatistics value) {
    setField(value);
  }

  public quickfix.field.NoMDStatistics get(quickfix.field.NoMDStatistics value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDStatistics getNoMDStatistics() throws FieldNotFound {
    return get(new quickfix.field.NoMDStatistics());
  }

  public boolean isSet(quickfix.field.NoMDStatistics field) {
    return isSetField(field);
  }

  public boolean isSetNoMDStatistics() {
    return isSetField(2474);
  }

public static class NoMDStatistics extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2456, 2457, 2458, 2459, 2454, 2455, 2481, 2482, 264, 2460, 2461, 2462, 2463, 2464, 2465, 2466, 2467, 2468, 2469, 2470, 2471, 2472, 539, 2584, 1815, 40, 59, 276, 277, 54, 578, 336, 625, 1024, 2711, 338, 1022, 1629, 1916, 1057, 2475, 2476, 2477, 2478, 2479, 2480, 0};

  public NoMDStatistics() {
    super(2474, 2456, ORDER);
  }

  public void set(quickfix.fixlatest.component.MDStatisticParameters component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDStatisticParameters get(quickfix.fixlatest.component.MDStatisticParameters component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDStatisticParameters getMDStatisticParametersComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDStatisticParameters());
  }

  public void set(quickfix.field.MDStatisticID value) {
    setField(value);
  }

  public quickfix.field.MDStatisticID get(quickfix.field.MDStatisticID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticID getMDStatisticID() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticID());
  }

  public boolean isSet(quickfix.field.MDStatisticID field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticID() {
    return isSetField(2475);
  }

  public void set(quickfix.field.MDStatisticTime value) {
    setField(value);
  }

  public quickfix.field.MDStatisticTime get(quickfix.field.MDStatisticTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticTime getMDStatisticTime() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticTime());
  }

  public boolean isSet(quickfix.field.MDStatisticTime field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticTime() {
    return isSetField(2476);
  }

  public void set(quickfix.field.MDStatisticStatus value) {
    setField(value);
  }

  public quickfix.field.MDStatisticStatus get(quickfix.field.MDStatisticStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticStatus getMDStatisticStatus() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticStatus());
  }

  public boolean isSet(quickfix.field.MDStatisticStatus field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticStatus() {
    return isSetField(2477);
  }

  public void set(quickfix.field.MDStatisticValue value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValue get(quickfix.field.MDStatisticValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValue getMDStatisticValue() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValue());
  }

  public boolean isSet(quickfix.field.MDStatisticValue field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValue() {
    return isSetField(2478);
  }

  public void set(quickfix.field.MDStatisticValueType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValueType get(quickfix.field.MDStatisticValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValueType getMDStatisticValueType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValueType());
  }

  public boolean isSet(quickfix.field.MDStatisticValueType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValueType() {
    return isSetField(2479);
  }

  public void set(quickfix.field.MDStatisticValueUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValueUnit get(quickfix.field.MDStatisticValueUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValueUnit getMDStatisticValueUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValueUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticValueUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValueUnit() {
    return isSetField(2480);
  }
}

  public void set(quickfix.fixlatest.component.MDStatisticParameters component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDStatisticParameters get(quickfix.fixlatest.component.MDStatisticParameters component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDStatisticParameters getMDStatisticParametersComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDStatisticParameters());
  }

  public void set(quickfix.field.MDStatisticID value) {
    setField(value);
  }

  public quickfix.field.MDStatisticID get(quickfix.field.MDStatisticID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticID getMDStatisticID() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticID());
  }

  public boolean isSet(quickfix.field.MDStatisticID field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticID() {
    return isSetField(2475);
  }

  public void set(quickfix.field.MDStatisticTime value) {
    setField(value);
  }

  public quickfix.field.MDStatisticTime get(quickfix.field.MDStatisticTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticTime getMDStatisticTime() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticTime());
  }

  public boolean isSet(quickfix.field.MDStatisticTime field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticTime() {
    return isSetField(2476);
  }

  public void set(quickfix.field.MDStatisticStatus value) {
    setField(value);
  }

  public quickfix.field.MDStatisticStatus get(quickfix.field.MDStatisticStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticStatus getMDStatisticStatus() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticStatus());
  }

  public boolean isSet(quickfix.field.MDStatisticStatus field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticStatus() {
    return isSetField(2477);
  }

  public void set(quickfix.field.MDStatisticValue value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValue get(quickfix.field.MDStatisticValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValue getMDStatisticValue() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValue());
  }

  public boolean isSet(quickfix.field.MDStatisticValue field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValue() {
    return isSetField(2478);
  }

  public void set(quickfix.field.MDStatisticValueType value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValueType get(quickfix.field.MDStatisticValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValueType getMDStatisticValueType() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValueType());
  }

  public boolean isSet(quickfix.field.MDStatisticValueType field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValueType() {
    return isSetField(2479);
  }

  public void set(quickfix.field.MDStatisticValueUnit value) {
    setField(value);
  }

  public quickfix.field.MDStatisticValueUnit get(quickfix.field.MDStatisticValueUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDStatisticValueUnit getMDStatisticValueUnit() throws FieldNotFound {
    return get(new quickfix.field.MDStatisticValueUnit());
  }

  public boolean isSet(quickfix.field.MDStatisticValueUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDStatisticValueUnit() {
    return isSetField(2480);
  }
}

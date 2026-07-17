/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventPeriodDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41376, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventPeriodDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes get(quickfix.field.NoLegComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventPeriodDateTimes getNoLegComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventPeriodDateTimes() {
    return isSetField(41376);
  }

public static class NoLegComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41377, 41378, 0};

  public NoLegComplexEventPeriodDateTimes() {
    super(41376, 41377, ORDER);
  }

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

  public void set(quickfix.field.LegComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodDate get(quickfix.field.LegComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodDate getLegComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodDate() {
    return isSetField(41377);
  }

  public void set(quickfix.field.LegComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventPeriodTime get(quickfix.field.LegComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventPeriodTime getLegComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventPeriodTime() {
    return isSetField(41378);
  }
}

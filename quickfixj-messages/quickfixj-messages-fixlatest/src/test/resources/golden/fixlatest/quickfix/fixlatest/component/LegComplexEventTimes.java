/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventTimes extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2253, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventTimes() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventTimes get(quickfix.field.NoLegComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventTimes getNoLegComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventTimes() {
    return isSetField(2253);
  }

public static class NoLegComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2204, 2247, 0};

  public NoLegComplexEventTimes() {
    super(2253, 2204, ORDER);
  }

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}

  public void set(quickfix.field.LegComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventStartTime get(quickfix.field.LegComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventStartTime getLegComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventStartTime() {
    return isSetField(2204);
  }

  public void set(quickfix.field.LegComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventEndTime get(quickfix.field.LegComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventEndTime getLegComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.LegComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventEndTime() {
    return isSetField(2247);
  }
}

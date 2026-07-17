/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventTimes extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2056, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventTimes() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventTimes get(quickfix.field.NoUnderlyingComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventTimes getNoUnderlyingComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventTimes() {
    return isSetField(2056);
  }

public static class NoUnderlyingComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2057, 2058, 0};

  public NoUnderlyingComplexEventTimes() {
    super(2056, 2057, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventStartTime get(quickfix.field.UnderlyingComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventStartTime getUnderlyingComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventStartTime() {
    return isSetField(2057);
  }

  public void set(quickfix.field.UnderlyingComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventEndTime get(quickfix.field.UnderlyingComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventEndTime getUnderlyingComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventEndTime() {
    return isSetField(2058);
  }
}

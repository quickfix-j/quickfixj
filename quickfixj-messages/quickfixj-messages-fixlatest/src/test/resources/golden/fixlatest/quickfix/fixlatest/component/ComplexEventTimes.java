/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventTimes extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1494, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventTimes() {
    super();
  }

  public void set(quickfix.field.NoComplexEventTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventTimes() {
    return isSetField(1494);
  }

public static class NoComplexEventTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1495, 1496, 0};

  public NoComplexEventTimes() {
    super(1494, 1495, ORDER);
  }

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}

  public void set(quickfix.field.ComplexEventStartTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventStartTime());
  }

  public boolean isSet(quickfix.field.ComplexEventStartTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventStartTime() {
    return isSetField(1495);
  }

  public void set(quickfix.field.ComplexEventEndTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventEndTime());
  }

  public boolean isSet(quickfix.field.ComplexEventEndTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventEndTime() {
    return isSetField(1496);
  }
}

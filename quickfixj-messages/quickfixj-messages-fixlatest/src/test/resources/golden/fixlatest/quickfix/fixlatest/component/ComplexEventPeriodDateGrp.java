/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventPeriodDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41007, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventPeriodDateGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventPeriodDateTimes get(quickfix.field.NoComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventPeriodDateTimes getNoComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventPeriodDateTimes() {
    return isSetField(41007);
  }

public static class NoComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41008, 41009, 0};

  public NoComplexEventPeriodDateTimes() {
    super(41007, 41008, ORDER);
  }

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

  public void set(quickfix.field.ComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodDate get(quickfix.field.ComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodDate getComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodDate() {
    return isSetField(41008);
  }

  public void set(quickfix.field.ComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.ComplexEventPeriodTime get(quickfix.field.ComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventPeriodTime getComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.ComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventPeriodTime() {
    return isSetField(41009);
  }
}

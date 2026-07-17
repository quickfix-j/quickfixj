/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventPeriodDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41726, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventPeriodDateGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes get(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventPeriodDateTimes getNoUnderlyingComplexEventPeriodDateTimes() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventPeriodDateTimes());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventPeriodDateTimes field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventPeriodDateTimes() {
    return isSetField(41726);
  }

public static class NoUnderlyingComplexEventPeriodDateTimes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41727, 41728, 0};

  public NoUnderlyingComplexEventPeriodDateTimes() {
    super(41726, 41727, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventPeriodDate value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate get(quickfix.field.UnderlyingComplexEventPeriodDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodDate getUnderlyingComplexEventPeriodDate() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodDate());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodDate field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodDate() {
    return isSetField(41727);
  }

  public void set(quickfix.field.UnderlyingComplexEventPeriodTime value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime get(quickfix.field.UnderlyingComplexEventPeriodTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventPeriodTime getUnderlyingComplexEventPeriodTime() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventPeriodTime());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventPeriodTime field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventPeriodTime() {
    return isSetField(41728);
  }
}

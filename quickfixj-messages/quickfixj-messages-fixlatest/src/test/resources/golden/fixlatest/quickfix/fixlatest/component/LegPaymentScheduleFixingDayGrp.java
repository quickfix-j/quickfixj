/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentScheduleFixingDayGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41530, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentScheduleFixingDayGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentScheduleFixingDays value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays get(quickfix.field.NoLegPaymentScheduleFixingDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentScheduleFixingDays getNoLegPaymentScheduleFixingDays() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentScheduleFixingDays());
  }

  public boolean isSet(quickfix.field.NoLegPaymentScheduleFixingDays field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentScheduleFixingDays() {
    return isSetField(41530);
  }

public static class NoLegPaymentScheduleFixingDays extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41531, 41532, 0};

  public NoLegPaymentScheduleFixingDays() {
    super(41530, 41531, ORDER);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

  public void set(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek get(quickfix.field.LegPaymentScheduleFixingDayOfWeek value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayOfWeek getLegPaymentScheduleFixingDayOfWeek() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayOfWeek());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayOfWeek field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayOfWeek() {
    return isSetField(41531);
  }

  public void set(quickfix.field.LegPaymentScheduleFixingDayNumber value) {
    setField(value);
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber get(quickfix.field.LegPaymentScheduleFixingDayNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentScheduleFixingDayNumber getLegPaymentScheduleFixingDayNumber() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentScheduleFixingDayNumber());
  }

  public boolean isSet(quickfix.field.LegPaymentScheduleFixingDayNumber field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentScheduleFixingDayNumber() {
    return isSetField(41532);
  }
}

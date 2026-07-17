/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamCompoundingEndDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42421, 42422, 42423, 42424, 42425, 42426, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamCompoundingEndDate() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingEndDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateUnadjusted get(quickfix.field.LegPaymentStreamCompoundingEndDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateUnadjusted getLegPaymentStreamCompoundingEndDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingEndDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingEndDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingEndDateUnadjusted() {
    return isSetField(42421);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingEndDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateRelativeTo get(quickfix.field.LegPaymentStreamCompoundingEndDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateRelativeTo getLegPaymentStreamCompoundingEndDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingEndDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingEndDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingEndDateRelativeTo() {
    return isSetField(42422);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateOffsetPeriod get(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateOffsetPeriod getLegPaymentStreamCompoundingEndDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingEndDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingEndDateOffsetPeriod() {
    return isSetField(42423);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateOffsetUnit get(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateOffsetUnit getLegPaymentStreamCompoundingEndDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingEndDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingEndDateOffsetUnit() {
    return isSetField(42424);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateOffsetDayType get(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateOffsetDayType getLegPaymentStreamCompoundingEndDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingEndDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingEndDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingEndDateOffsetDayType() {
    return isSetField(42425);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingEndDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateAdjusted get(quickfix.field.LegPaymentStreamCompoundingEndDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingEndDateAdjusted getLegPaymentStreamCompoundingEndDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingEndDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingEndDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingEndDateAdjusted() {
    return isSetField(42426);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamCompoundingStartDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42445, 42446, 42447, 42448, 42449, 42450, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamCompoundingStartDate() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingStartDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateUnadjusted get(quickfix.field.LegPaymentStreamCompoundingStartDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateUnadjusted getLegPaymentStreamCompoundingStartDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingStartDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingStartDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingStartDateUnadjusted() {
    return isSetField(42445);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingStartDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateRelativeTo get(quickfix.field.LegPaymentStreamCompoundingStartDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateRelativeTo getLegPaymentStreamCompoundingStartDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingStartDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingStartDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingStartDateRelativeTo() {
    return isSetField(42446);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateOffsetPeriod get(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateOffsetPeriod getLegPaymentStreamCompoundingStartDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingStartDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingStartDateOffsetPeriod() {
    return isSetField(42447);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateOffsetUnit get(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateOffsetUnit getLegPaymentStreamCompoundingStartDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingStartDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingStartDateOffsetUnit() {
    return isSetField(42448);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateOffsetDayType get(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateOffsetDayType getLegPaymentStreamCompoundingStartDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingStartDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingStartDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingStartDateOffsetDayType() {
    return isSetField(42449);
  }

  public void set(quickfix.field.LegPaymentStreamCompoundingStartDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateAdjusted get(quickfix.field.LegPaymentStreamCompoundingStartDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamCompoundingStartDateAdjusted getLegPaymentStreamCompoundingStartDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamCompoundingStartDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamCompoundingStartDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamCompoundingStartDateAdjusted() {
    return isSetField(42450);
  }
}

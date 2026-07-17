/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamFinalPricePaymentDate extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {42453, 42454, 42455, 42456, 42457, 42458, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamFinalPricePaymentDate() {
    super();
  }

  public void set(quickfix.field.LegPaymentStreamFinalPricePaymentDateUnadjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateUnadjusted get(quickfix.field.LegPaymentStreamFinalPricePaymentDateUnadjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateUnadjusted getLegPaymentStreamFinalPricePaymentDateUnadjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPricePaymentDateUnadjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPricePaymentDateUnadjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPricePaymentDateUnadjusted() {
    return isSetField(42453);
  }

  public void set(quickfix.field.LegPaymentStreamFinalPricePaymentDateRelativeTo value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateRelativeTo get(quickfix.field.LegPaymentStreamFinalPricePaymentDateRelativeTo value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateRelativeTo getLegPaymentStreamFinalPricePaymentDateRelativeTo() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPricePaymentDateRelativeTo());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPricePaymentDateRelativeTo field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPricePaymentDateRelativeTo() {
    return isSetField(42454);
  }

  public void set(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetPeriod value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetPeriod get(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetPeriod getLegPaymentStreamFinalPricePaymentDateOffsetPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetPeriod());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPricePaymentDateOffsetPeriod() {
    return isSetField(42455);
  }

  public void set(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetUnit value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetUnit get(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetUnit getLegPaymentStreamFinalPricePaymentDateOffsetUnit() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetUnit());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPricePaymentDateOffsetUnit() {
    return isSetField(42456);
  }

  public void set(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetDayType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetDayType get(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetDayType getLegPaymentStreamFinalPricePaymentDateOffsetDayType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetDayType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPricePaymentDateOffsetDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPricePaymentDateOffsetDayType() {
    return isSetField(42457);
  }

  public void set(quickfix.field.LegPaymentStreamFinalPricePaymentDateAdjusted value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateAdjusted get(quickfix.field.LegPaymentStreamFinalPricePaymentDateAdjusted value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamFinalPricePaymentDateAdjusted getLegPaymentStreamFinalPricePaymentDateAdjusted() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamFinalPricePaymentDateAdjusted());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamFinalPricePaymentDateAdjusted field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamFinalPricePaymentDateAdjusted() {
    return isSetField(42458);
  }
}

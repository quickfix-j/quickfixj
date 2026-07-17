/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamNonDeliverableFixingDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40367, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamNonDeliverableFixingDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegNonDeliverableFixingDates value) {
    setField(value);
  }

  public quickfix.field.NoLegNonDeliverableFixingDates get(quickfix.field.NoLegNonDeliverableFixingDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegNonDeliverableFixingDates getNoLegNonDeliverableFixingDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegNonDeliverableFixingDates());
  }

  public boolean isSet(quickfix.field.NoLegNonDeliverableFixingDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegNonDeliverableFixingDates() {
    return isSetField(40367);
  }

public static class NoLegNonDeliverableFixingDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40368, 40369, 0};

  public NoLegNonDeliverableFixingDates() {
    super(40367, 40368, ORDER);
  }

  public void set(quickfix.field.LegNonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.LegNonDeliverableFixingDate get(quickfix.field.LegNonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonDeliverableFixingDate getLegNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.LegNonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.LegNonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegNonDeliverableFixingDate() {
    return isSetField(40368);
  }

  public void set(quickfix.field.LegNonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.LegNonDeliverableFixingDateType get(quickfix.field.LegNonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonDeliverableFixingDateType getLegNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegNonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.LegNonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegNonDeliverableFixingDateType() {
    return isSetField(40369);
  }
}

  public void set(quickfix.field.LegNonDeliverableFixingDate value) {
    setField(value);
  }

  public quickfix.field.LegNonDeliverableFixingDate get(quickfix.field.LegNonDeliverableFixingDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonDeliverableFixingDate getLegNonDeliverableFixingDate() throws FieldNotFound {
    return get(new quickfix.field.LegNonDeliverableFixingDate());
  }

  public boolean isSet(quickfix.field.LegNonDeliverableFixingDate field) {
    return isSetField(field);
  }

  public boolean isSetLegNonDeliverableFixingDate() {
    return isSetField(40368);
  }

  public void set(quickfix.field.LegNonDeliverableFixingDateType value) {
    setField(value);
  }

  public quickfix.field.LegNonDeliverableFixingDateType get(quickfix.field.LegNonDeliverableFixingDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegNonDeliverableFixingDateType getLegNonDeliverableFixingDateType() throws FieldNotFound {
    return get(new quickfix.field.LegNonDeliverableFixingDateType());
  }

  public boolean isSet(quickfix.field.LegNonDeliverableFixingDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegNonDeliverableFixingDateType() {
    return isSetField(40369);
  }
}

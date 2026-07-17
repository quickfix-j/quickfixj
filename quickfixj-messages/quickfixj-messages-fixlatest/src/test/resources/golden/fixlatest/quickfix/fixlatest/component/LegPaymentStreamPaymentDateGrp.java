/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPaymentStreamPaymentDateGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41589, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPaymentStreamPaymentDateGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPaymentStreamPaymentDates value) {
    setField(value);
  }

  public quickfix.field.NoLegPaymentStreamPaymentDates get(quickfix.field.NoLegPaymentStreamPaymentDates value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPaymentStreamPaymentDates getNoLegPaymentStreamPaymentDates() throws FieldNotFound {
    return get(new quickfix.field.NoLegPaymentStreamPaymentDates());
  }

  public boolean isSet(quickfix.field.NoLegPaymentStreamPaymentDates field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPaymentStreamPaymentDates() {
    return isSetField(41589);
  }

public static class NoLegPaymentStreamPaymentDates extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41590, 41591, 0};

  public NoLegPaymentStreamPaymentDates() {
    super(41589, 41590, ORDER);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDate get(quickfix.field.LegPaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDate getLegPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDate() {
    return isSetField(41590);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateType get(quickfix.field.LegPaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateType getLegPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateType() {
    return isSetField(41591);
  }
}

  public void set(quickfix.field.LegPaymentStreamPaymentDate value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDate get(quickfix.field.LegPaymentStreamPaymentDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDate getLegPaymentStreamPaymentDate() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDate());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDate field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDate() {
    return isSetField(41590);
  }

  public void set(quickfix.field.LegPaymentStreamPaymentDateType value) {
    setField(value);
  }

  public quickfix.field.LegPaymentStreamPaymentDateType get(quickfix.field.LegPaymentStreamPaymentDateType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPaymentStreamPaymentDateType getLegPaymentStreamPaymentDateType() throws FieldNotFound {
    return get(new quickfix.field.LegPaymentStreamPaymentDateType());
  }

  public boolean isSet(quickfix.field.LegPaymentStreamPaymentDateType field) {
    return isSetField(field);
  }

  public boolean isSetLegPaymentStreamPaymentDateType() {
    return isSetField(41591);
  }
}

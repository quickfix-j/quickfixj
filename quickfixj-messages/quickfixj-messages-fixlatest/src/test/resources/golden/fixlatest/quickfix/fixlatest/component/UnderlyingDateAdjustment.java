/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDateAdjustment extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40964, 40965, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDateAdjustment() {
    super();
  }

  public void set(quickfix.field.UnderlyingBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingBusinessDayConvention get(quickfix.field.UnderlyingBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingBusinessDayConvention getUnderlyingBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingBusinessDayConvention() {
    return isSetField(40964);
  }

  public void set(quickfix.fixlatest.component.UnderlyingBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingBusinessCenterGrp get(quickfix.fixlatest.component.UnderlyingBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingBusinessCenterGrp getUnderlyingBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingBusinessCenterGrp());
  }

  public void set(quickfix.field.NoUnderlyingBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingBusinessCenters get(quickfix.field.NoUnderlyingBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingBusinessCenters getNoUnderlyingBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingBusinessCenters() {
    return isSetField(40962);
  }

public static class NoUnderlyingBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40963, 0};

  public NoUnderlyingBusinessCenters() {
    super(40962, 40963, ORDER);
  }

  public void set(quickfix.field.UnderlyingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingBusinessCenter get(quickfix.field.UnderlyingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingBusinessCenter getUnderlyingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingBusinessCenter() {
    return isSetField(40963);
  }
}

  public void set(quickfix.field.UnderlyingDateRollConvention value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDateRollConvention get(quickfix.field.UnderlyingDateRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDateRollConvention getUnderlyingDateRollConvention() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDateRollConvention());
  }

  public boolean isSet(quickfix.field.UnderlyingDateRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDateRollConvention() {
    return isSetField(40965);
  }
}

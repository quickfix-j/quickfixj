/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DateAdjustment extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40921, 40922, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DateAdjustment() {
    super();
  }

  public void set(quickfix.field.BusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.BusinessDayConvention get(quickfix.field.BusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessDayConvention getBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.BusinessDayConvention());
  }

  public boolean isSet(quickfix.field.BusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetBusinessDayConvention() {
    return isSetField(40921);
  }

  public void set(quickfix.fixlatest.component.BusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.BusinessCenterGrp get(quickfix.fixlatest.component.BusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.BusinessCenterGrp getBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.BusinessCenterGrp());
  }

  public void set(quickfix.field.NoBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoBusinessCenters get(quickfix.field.NoBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoBusinessCenters getNoBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoBusinessCenters() {
    return isSetField(40278);
  }

public static class NoBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40471, 0};

  public NoBusinessCenters() {
    super(40278, 40471, ORDER);
  }

  public void set(quickfix.field.BusinessCenter value) {
    setField(value);
  }

  public quickfix.field.BusinessCenter get(quickfix.field.BusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BusinessCenter getBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.BusinessCenter());
  }

  public boolean isSet(quickfix.field.BusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetBusinessCenter() {
    return isSetField(40471);
  }
}

  public void set(quickfix.field.DateRollConvention value) {
    setField(value);
  }

  public quickfix.field.DateRollConvention get(quickfix.field.DateRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DateRollConvention getDateRollConvention() throws FieldNotFound {
    return get(new quickfix.field.DateRollConvention());
  }

  public boolean isSet(quickfix.field.DateRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetDateRollConvention() {
    return isSetField(40922);
  }
}

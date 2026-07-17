/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDateAdjustment extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {40925, 40926, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegDateAdjustment() {
    super();
  }

  public void set(quickfix.field.LegBusinessDayConvention value) {
    setField(value);
  }

  public quickfix.field.LegBusinessDayConvention get(quickfix.field.LegBusinessDayConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegBusinessDayConvention getLegBusinessDayConvention() throws FieldNotFound {
    return get(new quickfix.field.LegBusinessDayConvention());
  }

  public boolean isSet(quickfix.field.LegBusinessDayConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegBusinessDayConvention() {
    return isSetField(40925);
  }

  public void set(quickfix.fixlatest.component.LegBusinessCenterGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegBusinessCenterGrp get(quickfix.fixlatest.component.LegBusinessCenterGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegBusinessCenterGrp getLegBusinessCenterGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegBusinessCenterGrp());
  }

  public void set(quickfix.field.NoLegBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegBusinessCenters get(quickfix.field.NoLegBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegBusinessCenters getNoLegBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegBusinessCenters() {
    return isSetField(40923);
  }

public static class NoLegBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40924, 0};

  public NoLegBusinessCenters() {
    super(40923, 40924, ORDER);
  }

  public void set(quickfix.field.LegBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegBusinessCenter get(quickfix.field.LegBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegBusinessCenter getLegBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegBusinessCenter() {
    return isSetField(40924);
  }
}

  public void set(quickfix.field.LegDateRollConvention value) {
    setField(value);
  }

  public quickfix.field.LegDateRollConvention get(quickfix.field.LegDateRollConvention value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDateRollConvention getLegDateRollConvention() throws FieldNotFound {
    return get(new quickfix.field.LegDateRollConvention());
  }

  public boolean isSet(quickfix.field.LegDateRollConvention field) {
    return isSetField(field);
  }

  public boolean isSetLegDateRollConvention() {
    return isSetField(40926);
  }
}

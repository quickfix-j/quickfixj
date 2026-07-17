/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40923, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegBusinessCenterGrp() {
    super();
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

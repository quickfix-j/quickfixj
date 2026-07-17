/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40938, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionRelevantUnderlyingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters get(quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters getNoLegProvisionOptionRelevantUnderlyingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    return isSetField(40938);
  }

public static class NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40510, 0};

  public NoLegProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    super(40938, 40510, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter getLegProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(40510);
  }
}

  public void set(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter getLegProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(40510);
  }
}

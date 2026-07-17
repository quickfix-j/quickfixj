/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42188, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters getNoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    return isSetField(42188);
  }

public static class NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42189, 0};

  public NoUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    super(42188, 42189, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter getUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(42189);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter getUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(42189);
  }
}

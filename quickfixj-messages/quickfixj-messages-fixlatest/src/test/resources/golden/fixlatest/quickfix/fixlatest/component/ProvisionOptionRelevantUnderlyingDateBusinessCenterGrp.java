/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40956, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionRelevantUnderlyingDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters get(quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters getNoProvisionOptionRelevantUnderlyingDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionRelevantUnderlyingDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    return isSetField(40956);
  }

public static class NoProvisionOptionRelevantUnderlyingDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40157, 0};

  public NoProvisionOptionRelevantUnderlyingDateBusinessCenters() {
    super(40956, 40157, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter getProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(40157);
  }
}

  public void set(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter get(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter getProvisionOptionRelevantUnderlyingDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionRelevantUnderlyingDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionRelevantUnderlyingDateBusinessCenter() {
    return isSetField(40157);
  }
}

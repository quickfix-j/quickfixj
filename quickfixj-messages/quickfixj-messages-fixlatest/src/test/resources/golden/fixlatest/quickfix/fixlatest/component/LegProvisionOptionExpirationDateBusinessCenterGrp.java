/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProvisionOptionExpirationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40937, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProvisionOptionExpirationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters get(quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters getNoLegProvisionOptionExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegProvisionOptionExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProvisionOptionExpirationDateBusinessCenters() {
    return isSetField(40937);
  }

public static class NoLegProvisionOptionExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40500, 0};

  public NoLegProvisionOptionExpirationDateBusinessCenters() {
    super(40937, 40500, ORDER);
  }

  public void set(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessCenter get(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessCenter getLegProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(40500);
  }
}

  public void set(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessCenter get(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProvisionOptionExpirationDateBusinessCenter getLegProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(40500);
  }
}

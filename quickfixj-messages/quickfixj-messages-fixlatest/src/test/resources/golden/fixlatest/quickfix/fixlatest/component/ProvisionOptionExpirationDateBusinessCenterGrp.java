/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProvisionOptionExpirationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40955, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProvisionOptionExpirationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoProvisionOptionExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoProvisionOptionExpirationDateBusinessCenters get(quickfix.field.NoProvisionOptionExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProvisionOptionExpirationDateBusinessCenters getNoProvisionOptionExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoProvisionOptionExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoProvisionOptionExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoProvisionOptionExpirationDateBusinessCenters() {
    return isSetField(40955);
  }

public static class NoProvisionOptionExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40147, 0};

  public NoProvisionOptionExpirationDateBusinessCenters() {
    super(40955, 40147, ORDER);
  }

  public void set(quickfix.field.ProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessCenter get(quickfix.field.ProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessCenter getProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(40147);
  }
}

  public void set(quickfix.field.ProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessCenter get(quickfix.field.ProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProvisionOptionExpirationDateBusinessCenter getProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(40147);
  }
}

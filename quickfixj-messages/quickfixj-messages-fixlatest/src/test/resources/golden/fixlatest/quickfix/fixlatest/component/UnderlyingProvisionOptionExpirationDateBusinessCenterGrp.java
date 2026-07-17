/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionOptionExpirationDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42186, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionOptionExpirationDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters getNoUnderlyingProvisionOptionExpirationDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionOptionExpirationDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionOptionExpirationDateBusinessCenters() {
    return isSetField(42186);
  }

public static class NoUnderlyingProvisionOptionExpirationDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42187, 0};

  public NoUnderlyingProvisionOptionExpirationDateBusinessCenters() {
    super(42186, 42187, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter getUnderlyingProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(42187);
  }
}

  public void set(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter get(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter getUnderlyingProvisionOptionExpirationDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionOptionExpirationDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionOptionExpirationDateBusinessCenter() {
    return isSetField(42187);
  }
}

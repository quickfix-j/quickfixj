/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProvisionDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42190, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProvisionDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters get(quickfix.field.NoUnderlyingProvisionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProvisionDateBusinessCenters getNoUnderlyingProvisionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProvisionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProvisionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProvisionDateBusinessCenters() {
    return isSetField(42190);
  }

public static class NoUnderlyingProvisionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42191, 0};

  public NoUnderlyingProvisionDateBusinessCenters() {
    super(42190, 42191, ORDER);
  }

  public void set(quickfix.field.UnderlyingProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter get(quickfix.field.UnderlyingProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter getUnderlyingProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessCenter() {
    return isSetField(42191);
  }
}

  public void set(quickfix.field.UnderlyingProvisionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter get(quickfix.field.UnderlyingProvisionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProvisionDateBusinessCenter getUnderlyingProvisionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProvisionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProvisionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProvisionDateBusinessCenter() {
    return isSetField(42191);
  }
}

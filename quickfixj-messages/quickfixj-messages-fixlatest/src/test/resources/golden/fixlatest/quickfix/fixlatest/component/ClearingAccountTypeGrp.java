/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ClearingAccountTypeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1918, };
  protected int[] getGroupFields() { return componentGroups; }

  public ClearingAccountTypeGrp() {
    super();
  }

  public void set(quickfix.field.NoClearingAccountTypes value) {
    setField(value);
  }

  public quickfix.field.NoClearingAccountTypes get(quickfix.field.NoClearingAccountTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingAccountTypes getNoClearingAccountTypes() throws FieldNotFound {
    return get(new quickfix.field.NoClearingAccountTypes());
  }

  public boolean isSet(quickfix.field.NoClearingAccountTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingAccountTypes() {
    return isSetField(1918);
  }

public static class NoClearingAccountTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1816, 0};

  public NoClearingAccountTypes() {
    super(1918, 1816, ORDER);
  }

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }
}

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProtectionTermEventQualifierGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41633, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProtectionTermEventQualifierGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers get(quickfix.field.NoLegProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers getNoLegProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventQualifiers() {
    return isSetField(41633);
  }

public static class NoLegProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41634, 0};

  public NoLegProtectionTermEventQualifiers() {
    super(41633, 41634, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}

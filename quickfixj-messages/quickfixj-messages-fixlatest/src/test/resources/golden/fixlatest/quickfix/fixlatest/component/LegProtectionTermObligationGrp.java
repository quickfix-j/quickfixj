/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProtectionTermObligationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41635, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProtectionTermObligationGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermObligations get(quickfix.field.NoLegProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermObligations getNoLegProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermObligations() {
    return isSetField(41635);
  }

public static class NoLegProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41636, 41637, 0};

  public NoLegProtectionTermObligations() {
    super(41635, 41636, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationType get(quickfix.field.LegProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationType getLegProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationType() {
    return isSetField(41636);
  }

  public void set(quickfix.field.LegProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationValue get(quickfix.field.LegProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationValue getLegProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationValue() {
    return isSetField(41637);
  }
}

  public void set(quickfix.field.LegProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationType get(quickfix.field.LegProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationType getLegProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationType() {
    return isSetField(41636);
  }

  public void set(quickfix.field.LegProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationValue get(quickfix.field.LegProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationValue getLegProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationValue() {
    return isSetField(41637);
  }
}

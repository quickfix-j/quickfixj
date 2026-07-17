/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FlexProductEligibilityGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2560, };
  protected int[] getGroupFields() { return componentGroups; }

  public FlexProductEligibilityGrp() {
    super();
  }

  public void set(quickfix.field.NoFlexProductEligibilities value) {
    setField(value);
  }

  public quickfix.field.NoFlexProductEligibilities get(quickfix.field.NoFlexProductEligibilities value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFlexProductEligibilities getNoFlexProductEligibilities() throws FieldNotFound {
    return get(new quickfix.field.NoFlexProductEligibilities());
  }

  public boolean isSet(quickfix.field.NoFlexProductEligibilities field) {
    return isSetField(field);
  }

  public boolean isSetNoFlexProductEligibilities() {
    return isSetField(2560);
  }

public static class NoFlexProductEligibilities extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1242, 2561, 0};

  public NoFlexProductEligibilities() {
    super(2560, 1242, ORDER);
  }

  public void set(quickfix.field.FlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityIndicator get(quickfix.field.FlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityIndicator getFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityIndicator() {
    return isSetField(1242);
  }

  public void set(quickfix.field.FlexProductEligibilityComplex value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityComplex get(quickfix.field.FlexProductEligibilityComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityComplex getFlexProductEligibilityComplex() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityComplex());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityComplex field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityComplex() {
    return isSetField(2561);
  }
}

  public void set(quickfix.field.FlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityIndicator get(quickfix.field.FlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityIndicator getFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityIndicator() {
    return isSetField(1242);
  }

  public void set(quickfix.field.FlexProductEligibilityComplex value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityComplex get(quickfix.field.FlexProductEligibilityComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityComplex getFlexProductEligibilityComplex() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityComplex());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityComplex field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityComplex() {
    return isSetField(2561);
  }
}

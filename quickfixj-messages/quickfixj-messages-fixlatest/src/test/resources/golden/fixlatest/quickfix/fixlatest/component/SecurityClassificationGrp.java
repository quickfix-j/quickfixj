/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecurityClassificationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1582, };
  protected int[] getGroupFields() { return componentGroups; }

  public SecurityClassificationGrp() {
    super();
  }

  public void set(quickfix.field.NoSecurityClassifications value) {
    setField(value);
  }

  public quickfix.field.NoSecurityClassifications get(quickfix.field.NoSecurityClassifications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityClassifications getNoSecurityClassifications() throws FieldNotFound {
    return get(new quickfix.field.NoSecurityClassifications());
  }

  public boolean isSet(quickfix.field.NoSecurityClassifications field) {
    return isSetField(field);
  }

  public boolean isSetNoSecurityClassifications() {
    return isSetField(1582);
  }

public static class NoSecurityClassifications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1583, 1584, 0};

  public NoSecurityClassifications() {
    super(1582, 1583, ORDER);
  }

  public void set(quickfix.field.SecurityClassificationReason value) {
    setField(value);
  }

  public quickfix.field.SecurityClassificationReason get(quickfix.field.SecurityClassificationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityClassificationReason getSecurityClassificationReason() throws FieldNotFound {
    return get(new quickfix.field.SecurityClassificationReason());
  }

  public boolean isSet(quickfix.field.SecurityClassificationReason field) {
    return isSetField(field);
  }

  public boolean isSetSecurityClassificationReason() {
    return isSetField(1583);
  }

  public void set(quickfix.field.SecurityClassificationValue value) {
    setField(value);
  }

  public quickfix.field.SecurityClassificationValue get(quickfix.field.SecurityClassificationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityClassificationValue getSecurityClassificationValue() throws FieldNotFound {
    return get(new quickfix.field.SecurityClassificationValue());
  }

  public boolean isSet(quickfix.field.SecurityClassificationValue field) {
    return isSetField(field);
  }

  public boolean isSetSecurityClassificationValue() {
    return isSetField(1584);
  }
}

  public void set(quickfix.field.SecurityClassificationReason value) {
    setField(value);
  }

  public quickfix.field.SecurityClassificationReason get(quickfix.field.SecurityClassificationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityClassificationReason getSecurityClassificationReason() throws FieldNotFound {
    return get(new quickfix.field.SecurityClassificationReason());
  }

  public boolean isSet(quickfix.field.SecurityClassificationReason field) {
    return isSetField(field);
  }

  public boolean isSetSecurityClassificationReason() {
    return isSetField(1583);
  }

  public void set(quickfix.field.SecurityClassificationValue value) {
    setField(value);
  }

  public quickfix.field.SecurityClassificationValue get(quickfix.field.SecurityClassificationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityClassificationValue getSecurityClassificationValue() throws FieldNotFound {
    return get(new quickfix.field.SecurityClassificationValue());
  }

  public boolean isSet(quickfix.field.SecurityClassificationValue field) {
    return isSetField(field);
  }

  public boolean isSetSecurityClassificationValue() {
    return isSetField(1584);
  }
}

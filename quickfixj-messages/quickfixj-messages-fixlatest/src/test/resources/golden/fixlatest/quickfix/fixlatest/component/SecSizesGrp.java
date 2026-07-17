/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecSizesGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1177, };
  protected int[] getGroupFields() { return componentGroups; }

  public SecSizesGrp() {
    super();
  }

  public void set(quickfix.field.NoOfSecSizes value) {
    setField(value);
  }

  public quickfix.field.NoOfSecSizes get(quickfix.field.NoOfSecSizes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfSecSizes getNoOfSecSizes() throws FieldNotFound {
    return get(new quickfix.field.NoOfSecSizes());
  }

  public boolean isSet(quickfix.field.NoOfSecSizes field) {
    return isSetField(field);
  }

  public boolean isSetNoOfSecSizes() {
    return isSetField(1177);
  }

public static class NoOfSecSizes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1178, 1179, 0};

  public NoOfSecSizes() {
    super(1177, 1178, ORDER);
  }

  public void set(quickfix.field.MDSecSizeType value) {
    setField(value);
  }

  public quickfix.field.MDSecSizeType get(quickfix.field.MDSecSizeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSizeType getMDSecSizeType() throws FieldNotFound {
    return get(new quickfix.field.MDSecSizeType());
  }

  public boolean isSet(quickfix.field.MDSecSizeType field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSizeType() {
    return isSetField(1178);
  }

  public void set(quickfix.field.MDSecSize value) {
    setField(value);
  }

  public quickfix.field.MDSecSize get(quickfix.field.MDSecSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSize getMDSecSize() throws FieldNotFound {
    return get(new quickfix.field.MDSecSize());
  }

  public boolean isSet(quickfix.field.MDSecSize field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSize() {
    return isSetField(1179);
  }
}

  public void set(quickfix.field.MDSecSizeType value) {
    setField(value);
  }

  public quickfix.field.MDSecSizeType get(quickfix.field.MDSecSizeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSizeType getMDSecSizeType() throws FieldNotFound {
    return get(new quickfix.field.MDSecSizeType());
  }

  public boolean isSet(quickfix.field.MDSecSizeType field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSizeType() {
    return isSetField(1178);
  }

  public void set(quickfix.field.MDSecSize value) {
    setField(value);
  }

  public quickfix.field.MDSecSize get(quickfix.field.MDSecSize value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSecSize getMDSecSize() throws FieldNotFound {
    return get(new quickfix.field.MDSecSize());
  }

  public boolean isSet(quickfix.field.MDSecSize field) {
    return isSetField(field);
  }

  public boolean isSetMDSecSize() {
    return isSetField(1179);
  }
}

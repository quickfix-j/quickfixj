/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamCommodityAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41990, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamCommodityAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamCommodityAltIDs value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamCommodityAltIDs get(quickfix.field.NoUnderlyingStreamCommodityAltIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamCommodityAltIDs getNoUnderlyingStreamCommodityAltIDs() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamCommodityAltIDs());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamCommodityAltIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamCommodityAltIDs() {
    return isSetField(41990);
  }

public static class NoUnderlyingStreamCommodityAltIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41991, 41992, 0};

  public NoUnderlyingStreamCommodityAltIDs() {
    super(41990, 41991, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityAltID get(quickfix.field.UnderlyingStreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityAltID getUnderlyingStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityAltID() {
    return isSetField(41991);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityAltIDSource get(quickfix.field.UnderlyingStreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityAltIDSource getUnderlyingStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityAltIDSource() {
    return isSetField(41992);
  }
}

  public void set(quickfix.field.UnderlyingStreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityAltID get(quickfix.field.UnderlyingStreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityAltID getUnderlyingStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityAltID() {
    return isSetField(41991);
  }

  public void set(quickfix.field.UnderlyingStreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamCommodityAltIDSource get(quickfix.field.UnderlyingStreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamCommodityAltIDSource getUnderlyingStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamCommodityAltIDSource() {
    return isSetField(41992);
  }
}

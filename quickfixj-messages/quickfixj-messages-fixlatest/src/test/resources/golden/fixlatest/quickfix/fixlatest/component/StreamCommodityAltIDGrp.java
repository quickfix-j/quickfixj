/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCommodityAltIDGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41277, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCommodityAltIDGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCommodityAltIDs value) {
    setField(value);
  }

  public quickfix.field.NoStreamCommodityAltIDs get(quickfix.field.NoStreamCommodityAltIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCommodityAltIDs getNoStreamCommodityAltIDs() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCommodityAltIDs());
  }

  public boolean isSet(quickfix.field.NoStreamCommodityAltIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCommodityAltIDs() {
    return isSetField(41277);
  }

public static class NoStreamCommodityAltIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41278, 41279, 0};

  public NoStreamCommodityAltIDs() {
    super(41277, 41278, ORDER);
  }

  public void set(quickfix.field.StreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityAltID get(quickfix.field.StreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityAltID getStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.StreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityAltID() {
    return isSetField(41278);
  }

  public void set(quickfix.field.StreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityAltIDSource get(quickfix.field.StreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityAltIDSource getStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.StreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityAltIDSource() {
    return isSetField(41279);
  }
}

  public void set(quickfix.field.StreamCommodityAltID value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityAltID get(quickfix.field.StreamCommodityAltID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityAltID getStreamCommodityAltID() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityAltID());
  }

  public boolean isSet(quickfix.field.StreamCommodityAltID field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityAltID() {
    return isSetField(41278);
  }

  public void set(quickfix.field.StreamCommodityAltIDSource value) {
    setField(value);
  }

  public quickfix.field.StreamCommodityAltIDSource get(quickfix.field.StreamCommodityAltIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCommodityAltIDSource getStreamCommodityAltIDSource() throws FieldNotFound {
    return get(new quickfix.field.StreamCommodityAltIDSource());
  }

  public boolean isSet(quickfix.field.StreamCommodityAltIDSource field) {
    return isSetField(field);
  }

  public boolean isSetStreamCommodityAltIDSource() {
    return isSetField(41279);
  }
}

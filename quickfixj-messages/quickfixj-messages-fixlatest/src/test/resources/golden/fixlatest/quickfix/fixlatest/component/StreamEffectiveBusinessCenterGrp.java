/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamEffectiveBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40960, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamEffectiveBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamEffectiveBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamEffectiveBusinessCenters get(quickfix.field.NoStreamEffectiveBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamEffectiveBusinessCenters getNoStreamEffectiveBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamEffectiveBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamEffectiveBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamEffectiveBusinessCenters() {
    return isSetField(40960);
  }

public static class NoStreamEffectiveBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40909, 0};

  public NoStreamEffectiveBusinessCenters() {
    super(40960, 40909, ORDER);
  }

  public void set(quickfix.field.StreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateBusinessCenter get(quickfix.field.StreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateBusinessCenter getStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateBusinessCenter() {
    return isSetField(40909);
  }
}

  public void set(quickfix.field.StreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamEffectiveDateBusinessCenter get(quickfix.field.StreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamEffectiveDateBusinessCenter getStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamEffectiveDateBusinessCenter() {
    return isSetField(40909);
  }
}

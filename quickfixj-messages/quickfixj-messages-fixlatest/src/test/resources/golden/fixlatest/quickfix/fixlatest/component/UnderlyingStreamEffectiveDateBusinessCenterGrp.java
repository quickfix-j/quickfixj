/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingStreamEffectiveDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40975, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingStreamEffectiveDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters get(quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters getNoUnderlyingStreamEffectiveDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingStreamEffectiveDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingStreamEffectiveDateBusinessCenters() {
    return isSetField(40975);
  }

public static class NoUnderlyingStreamEffectiveDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40059, 0};

  public NoUnderlyingStreamEffectiveDateBusinessCenters() {
    super(40975, 40059, ORDER);
  }

  public void set(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter get(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter getUnderlyingStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateBusinessCenter() {
    return isSetField(40059);
  }
}

  public void set(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter get(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter getUnderlyingStreamEffectiveDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingStreamEffectiveDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingStreamEffectiveDateBusinessCenter() {
    return isSetField(40059);
  }
}

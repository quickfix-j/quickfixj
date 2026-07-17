/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingComplexEventDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41737, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingComplexEventDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingComplexEventDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingComplexEventDateBusinessCenters get(quickfix.field.NoUnderlyingComplexEventDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingComplexEventDateBusinessCenters getNoUnderlyingComplexEventDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingComplexEventDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingComplexEventDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingComplexEventDateBusinessCenters() {
    return isSetField(41737);
  }

public static class NoUnderlyingComplexEventDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41738, 0};

  public NoUnderlyingComplexEventDateBusinessCenters() {
    super(41737, 41738, ORDER);
  }

  public void set(quickfix.field.UnderlyingComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessCenter get(quickfix.field.UnderlyingComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessCenter getUnderlyingComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateBusinessCenter() {
    return isSetField(41738);
  }
}

  public void set(quickfix.field.UnderlyingComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessCenter get(quickfix.field.UnderlyingComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingComplexEventDateBusinessCenter getUnderlyingComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingComplexEventDateBusinessCenter() {
    return isSetField(41738);
  }
}

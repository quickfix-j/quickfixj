/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ComplexEventDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41018, };
  protected int[] getGroupFields() { return componentGroups; }

  public ComplexEventDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoComplexEventDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoComplexEventDateBusinessCenters get(quickfix.field.NoComplexEventDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoComplexEventDateBusinessCenters getNoComplexEventDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoComplexEventDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoComplexEventDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoComplexEventDateBusinessCenters() {
    return isSetField(41018);
  }

public static class NoComplexEventDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41019, 0};

  public NoComplexEventDateBusinessCenters() {
    super(41018, 41019, ORDER);
  }

  public void set(quickfix.field.ComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateBusinessCenter get(quickfix.field.ComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateBusinessCenter getComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateBusinessCenter() {
    return isSetField(41019);
  }
}

  public void set(quickfix.field.ComplexEventDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ComplexEventDateBusinessCenter get(quickfix.field.ComplexEventDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ComplexEventDateBusinessCenter getComplexEventDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ComplexEventDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.ComplexEventDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetComplexEventDateBusinessCenter() {
    return isSetField(41019);
  }
}

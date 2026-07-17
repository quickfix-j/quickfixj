/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40962, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingBusinessCenters get(quickfix.field.NoUnderlyingBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingBusinessCenters getNoUnderlyingBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingBusinessCenters() {
    return isSetField(40962);
  }

public static class NoUnderlyingBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40963, 0};

  public NoUnderlyingBusinessCenters() {
    super(40962, 40963, ORDER);
  }

  public void set(quickfix.field.UnderlyingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingBusinessCenter get(quickfix.field.UnderlyingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingBusinessCenter getUnderlyingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingBusinessCenter() {
    return isSetField(40963);
  }
}

  public void set(quickfix.field.UnderlyingBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingBusinessCenter get(quickfix.field.UnderlyingBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingBusinessCenter getUnderlyingBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingBusinessCenter() {
    return isSetField(40963);
  }
}

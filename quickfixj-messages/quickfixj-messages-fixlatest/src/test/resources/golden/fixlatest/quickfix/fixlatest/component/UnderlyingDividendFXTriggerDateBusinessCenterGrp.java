/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingDividendFXTriggerDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42853, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingDividendFXTriggerDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingDividendFXTriggerDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingDividendFXTriggerDateBusinessCenters get(quickfix.field.NoUnderlyingDividendFXTriggerDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingDividendFXTriggerDateBusinessCenters getNoUnderlyingDividendFXTriggerDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingDividendFXTriggerDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingDividendFXTriggerDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingDividendFXTriggerDateBusinessCenters() {
    return isSetField(42853);
  }

public static class NoUnderlyingDividendFXTriggerDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42854, 0};

  public NoUnderlyingDividendFXTriggerDateBusinessCenters() {
    super(42853, 42854, ORDER);
  }

  public void set(quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter get(quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter getUnderlyingDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendFXTriggerDateBusinessCenter() {
    return isSetField(42854);
  }
}

  public void set(quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter get(quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter getUnderlyingDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingDividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingDividendFXTriggerDateBusinessCenter() {
    return isSetField(42854);
  }
}

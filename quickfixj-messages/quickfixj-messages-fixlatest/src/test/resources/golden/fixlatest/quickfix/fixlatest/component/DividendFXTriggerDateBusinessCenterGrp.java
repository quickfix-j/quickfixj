/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DividendFXTriggerDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42272, };
  protected int[] getGroupFields() { return componentGroups; }

  public DividendFXTriggerDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoDividendFXTriggerDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoDividendFXTriggerDateBusinessCenters get(quickfix.field.NoDividendFXTriggerDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDividendFXTriggerDateBusinessCenters getNoDividendFXTriggerDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoDividendFXTriggerDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoDividendFXTriggerDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoDividendFXTriggerDateBusinessCenters() {
    return isSetField(42272);
  }

public static class NoDividendFXTriggerDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42273, 0};

  public NoDividendFXTriggerDateBusinessCenters() {
    super(42272, 42273, ORDER);
  }

  public void set(quickfix.field.DividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateBusinessCenter get(quickfix.field.DividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateBusinessCenter getDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateBusinessCenter() {
    return isSetField(42273);
  }
}

  public void set(quickfix.field.DividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.DividendFXTriggerDateBusinessCenter get(quickfix.field.DividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DividendFXTriggerDateBusinessCenter getDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.DividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.DividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetDividendFXTriggerDateBusinessCenter() {
    return isSetField(42273);
  }
}

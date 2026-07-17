/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegDividendFXTriggerDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42364, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegDividendFXTriggerDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegDividendFXTriggerDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegDividendFXTriggerDateBusinessCenters get(quickfix.field.NoLegDividendFXTriggerDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegDividendFXTriggerDateBusinessCenters getNoLegDividendFXTriggerDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegDividendFXTriggerDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegDividendFXTriggerDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegDividendFXTriggerDateBusinessCenters() {
    return isSetField(42364);
  }

public static class NoLegDividendFXTriggerDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42365, 0};

  public NoLegDividendFXTriggerDateBusinessCenters() {
    super(42364, 42365, ORDER);
  }

  public void set(quickfix.field.LegDividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessCenter get(quickfix.field.LegDividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessCenter getLegDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateBusinessCenter() {
    return isSetField(42365);
  }
}

  public void set(quickfix.field.LegDividendFXTriggerDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessCenter get(quickfix.field.LegDividendFXTriggerDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDividendFXTriggerDateBusinessCenter getLegDividendFXTriggerDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegDividendFXTriggerDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegDividendFXTriggerDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegDividendFXTriggerDateBusinessCenter() {
    return isSetField(42365);
  }
}

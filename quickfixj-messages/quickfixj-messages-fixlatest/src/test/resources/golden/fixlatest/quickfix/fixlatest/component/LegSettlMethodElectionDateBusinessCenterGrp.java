/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSettlMethodElectionDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42581, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegSettlMethodElectionDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoLegSettlMethodElectionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoLegSettlMethodElectionDateBusinessCenters get(quickfix.field.NoLegSettlMethodElectionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegSettlMethodElectionDateBusinessCenters getNoLegSettlMethodElectionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoLegSettlMethodElectionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoLegSettlMethodElectionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoLegSettlMethodElectionDateBusinessCenters() {
    return isSetField(42581);
  }

public static class NoLegSettlMethodElectionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42582, 0};

  public NoLegSettlMethodElectionDateBusinessCenters() {
    super(42581, 42582, ORDER);
  }

  public void set(quickfix.field.LegSettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessCenter get(quickfix.field.LegSettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessCenter getLegSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateBusinessCenter() {
    return isSetField(42582);
  }
}

  public void set(quickfix.field.LegSettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessCenter get(quickfix.field.LegSettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSettlMethodElectionDateBusinessCenter getLegSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegSettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegSettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegSettlMethodElectionDateBusinessCenter() {
    return isSetField(42582);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingSettlMethodElectionDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {43074, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingSettlMethodElectionDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters get(quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters getNoUnderlyingSettlMethodElectionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoUnderlyingSettlMethodElectionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingSettlMethodElectionDateBusinessCenters() {
    return isSetField(43074);
  }

public static class NoUnderlyingSettlMethodElectionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {43075, 0};

  public NoUnderlyingSettlMethodElectionDateBusinessCenters() {
    super(43074, 43075, ORDER);
  }

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter get(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter getUnderlyingSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateBusinessCenter() {
    return isSetField(43075);
  }
}

  public void set(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter get(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter getUnderlyingSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingSettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSettlMethodElectionDateBusinessCenter() {
    return isSetField(43075);
  }
}

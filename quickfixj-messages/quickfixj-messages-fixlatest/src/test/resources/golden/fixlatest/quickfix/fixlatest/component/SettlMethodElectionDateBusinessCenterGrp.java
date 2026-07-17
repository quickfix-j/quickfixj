/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SettlMethodElectionDateBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42775, };
  protected int[] getGroupFields() { return componentGroups; }

  public SettlMethodElectionDateBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoSettlMethodElectionDateBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoSettlMethodElectionDateBusinessCenters get(quickfix.field.NoSettlMethodElectionDateBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlMethodElectionDateBusinessCenters getNoSettlMethodElectionDateBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoSettlMethodElectionDateBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoSettlMethodElectionDateBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlMethodElectionDateBusinessCenters() {
    return isSetField(42775);
  }

public static class NoSettlMethodElectionDateBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42776, 0};

  public NoSettlMethodElectionDateBusinessCenters() {
    super(42775, 42776, ORDER);
  }

  public void set(quickfix.field.SettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateBusinessCenter get(quickfix.field.SettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateBusinessCenter getSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateBusinessCenter() {
    return isSetField(42776);
  }
}

  public void set(quickfix.field.SettlMethodElectionDateBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.SettlMethodElectionDateBusinessCenter get(quickfix.field.SettlMethodElectionDateBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlMethodElectionDateBusinessCenter getSettlMethodElectionDateBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.SettlMethodElectionDateBusinessCenter());
  }

  public boolean isSet(quickfix.field.SettlMethodElectionDateBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetSettlMethodElectionDateBusinessCenter() {
    return isSetField(42776);
  }
}

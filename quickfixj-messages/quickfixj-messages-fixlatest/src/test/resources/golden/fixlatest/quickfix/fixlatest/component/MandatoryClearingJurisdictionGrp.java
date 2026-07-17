/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MandatoryClearingJurisdictionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41312, };
  protected int[] getGroupFields() { return componentGroups; }

  public MandatoryClearingJurisdictionGrp() {
    super();
  }

  public void set(quickfix.field.NoMandatoryClearingJurisdictions value) {
    setField(value);
  }

  public quickfix.field.NoMandatoryClearingJurisdictions get(quickfix.field.NoMandatoryClearingJurisdictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMandatoryClearingJurisdictions getNoMandatoryClearingJurisdictions() throws FieldNotFound {
    return get(new quickfix.field.NoMandatoryClearingJurisdictions());
  }

  public boolean isSet(quickfix.field.NoMandatoryClearingJurisdictions field) {
    return isSetField(field);
  }

  public boolean isSetNoMandatoryClearingJurisdictions() {
    return isSetField(41312);
  }

public static class NoMandatoryClearingJurisdictions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41313, 0};

  public NoMandatoryClearingJurisdictions() {
    super(41312, 41313, ORDER);
  }

  public void set(quickfix.field.MandatoryClearingJurisdiction value) {
    setField(value);
  }

  public quickfix.field.MandatoryClearingJurisdiction get(quickfix.field.MandatoryClearingJurisdiction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MandatoryClearingJurisdiction getMandatoryClearingJurisdiction() throws FieldNotFound {
    return get(new quickfix.field.MandatoryClearingJurisdiction());
  }

  public boolean isSet(quickfix.field.MandatoryClearingJurisdiction field) {
    return isSetField(field);
  }

  public boolean isSetMandatoryClearingJurisdiction() {
    return isSetField(41313);
  }
}

  public void set(quickfix.field.MandatoryClearingJurisdiction value) {
    setField(value);
  }

  public quickfix.field.MandatoryClearingJurisdiction get(quickfix.field.MandatoryClearingJurisdiction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MandatoryClearingJurisdiction getMandatoryClearingJurisdiction() throws FieldNotFound {
    return get(new quickfix.field.MandatoryClearingJurisdiction());
  }

  public boolean isSet(quickfix.field.MandatoryClearingJurisdiction field) {
    return isSetField(field);
  }

  public boolean isSetMandatoryClearingJurisdiction() {
    return isSetField(41313);
  }
}

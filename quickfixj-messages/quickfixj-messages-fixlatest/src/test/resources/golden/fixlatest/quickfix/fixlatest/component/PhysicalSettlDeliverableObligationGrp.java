/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PhysicalSettlDeliverableObligationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40209, };
  protected int[] getGroupFields() { return componentGroups; }

  public PhysicalSettlDeliverableObligationGrp() {
    super();
  }

  public void set(quickfix.field.NoPhysicalSettlDeliverableObligations value) {
    setField(value);
  }

  public quickfix.field.NoPhysicalSettlDeliverableObligations get(quickfix.field.NoPhysicalSettlDeliverableObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPhysicalSettlDeliverableObligations getNoPhysicalSettlDeliverableObligations() throws FieldNotFound {
    return get(new quickfix.field.NoPhysicalSettlDeliverableObligations());
  }

  public boolean isSet(quickfix.field.NoPhysicalSettlDeliverableObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoPhysicalSettlDeliverableObligations() {
    return isSetField(40209);
  }

public static class NoPhysicalSettlDeliverableObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40210, 40211, 0};

  public NoPhysicalSettlDeliverableObligations() {
    super(40209, 40210, ORDER);
  }

  public void set(quickfix.field.PhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlDeliverableObligationType get(quickfix.field.PhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlDeliverableObligationType getPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.PhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlDeliverableObligationType() {
    return isSetField(40210);
  }

  public void set(quickfix.field.PhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlDeliverableObligationValue get(quickfix.field.PhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlDeliverableObligationValue getPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.PhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlDeliverableObligationValue() {
    return isSetField(40211);
  }
}

  public void set(quickfix.field.PhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlDeliverableObligationType get(quickfix.field.PhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlDeliverableObligationType getPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.PhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlDeliverableObligationType() {
    return isSetField(40210);
  }

  public void set(quickfix.field.PhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlDeliverableObligationValue get(quickfix.field.PhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlDeliverableObligationValue getPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.PhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlDeliverableObligationValue() {
    return isSetField(40211);
  }
}

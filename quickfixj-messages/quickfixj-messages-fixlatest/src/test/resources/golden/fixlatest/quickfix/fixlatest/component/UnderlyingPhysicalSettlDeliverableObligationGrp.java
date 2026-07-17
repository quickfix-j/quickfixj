/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPhysicalSettlDeliverableObligationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42065, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPhysicalSettlDeliverableObligationGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations get(quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations getNoUnderlyingPhysicalSettlDeliverableObligations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPhysicalSettlDeliverableObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPhysicalSettlDeliverableObligations() {
    return isSetField(42065);
  }

public static class NoUnderlyingPhysicalSettlDeliverableObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42066, 42067, 0};

  public NoUnderlyingPhysicalSettlDeliverableObligations() {
    super(42065, 42066, ORDER);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType get(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType getUnderlyingPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlDeliverableObligationType() {
    return isSetField(42066);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue get(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue getUnderlyingPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlDeliverableObligationValue() {
    return isSetField(42067);
  }
}

  public void set(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType get(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType getUnderlyingPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlDeliverableObligationType() {
    return isSetField(42066);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue get(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue getUnderlyingPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlDeliverableObligationValue() {
    return isSetField(42067);
  }
}

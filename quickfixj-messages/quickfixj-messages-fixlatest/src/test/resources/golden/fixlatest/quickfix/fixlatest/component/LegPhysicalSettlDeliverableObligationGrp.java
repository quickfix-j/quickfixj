/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPhysicalSettlDeliverableObligationGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41604, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPhysicalSettlDeliverableObligationGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPhysicalSettlDeliverableObligations value) {
    setField(value);
  }

  public quickfix.field.NoLegPhysicalSettlDeliverableObligations get(quickfix.field.NoLegPhysicalSettlDeliverableObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPhysicalSettlDeliverableObligations getNoLegPhysicalSettlDeliverableObligations() throws FieldNotFound {
    return get(new quickfix.field.NoLegPhysicalSettlDeliverableObligations());
  }

  public boolean isSet(quickfix.field.NoLegPhysicalSettlDeliverableObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPhysicalSettlDeliverableObligations() {
    return isSetField(41604);
  }

public static class NoLegPhysicalSettlDeliverableObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41605, 41606, 0};

  public NoLegPhysicalSettlDeliverableObligations() {
    super(41604, 41605, ORDER);
  }

  public void set(quickfix.field.LegPhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationType get(quickfix.field.LegPhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationType getLegPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlDeliverableObligationType() {
    return isSetField(41605);
  }

  public void set(quickfix.field.LegPhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationValue get(quickfix.field.LegPhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationValue getLegPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlDeliverableObligationValue() {
    return isSetField(41606);
  }
}

  public void set(quickfix.field.LegPhysicalSettlDeliverableObligationType value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationType get(quickfix.field.LegPhysicalSettlDeliverableObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationType getLegPhysicalSettlDeliverableObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlDeliverableObligationType());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlDeliverableObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlDeliverableObligationType() {
    return isSetField(41605);
  }

  public void set(quickfix.field.LegPhysicalSettlDeliverableObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationValue get(quickfix.field.LegPhysicalSettlDeliverableObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlDeliverableObligationValue getLegPhysicalSettlDeliverableObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlDeliverableObligationValue());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlDeliverableObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlDeliverableObligationValue() {
    return isSetField(41606);
  }
}

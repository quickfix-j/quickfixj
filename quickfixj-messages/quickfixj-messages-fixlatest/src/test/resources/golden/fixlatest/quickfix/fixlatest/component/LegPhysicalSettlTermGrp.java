/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegPhysicalSettlTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41599, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegPhysicalSettlTermGrp() {
    super();
  }

  public void set(quickfix.field.NoLegPhysicalSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegPhysicalSettlTerms get(quickfix.field.NoLegPhysicalSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegPhysicalSettlTerms getNoLegPhysicalSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegPhysicalSettlTerms());
  }

  public boolean isSet(quickfix.field.NoLegPhysicalSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegPhysicalSettlTerms() {
    return isSetField(41599);
  }

public static class NoLegPhysicalSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41604, 41601, 41602, 41603, 41600, 0};

  public NoLegPhysicalSettlTerms() {
    super(41599, 41604, ORDER);
  }

  public void set(quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp getLegPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp());
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

  public void set(quickfix.field.LegPhysicalSettlCurency value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlCurency get(quickfix.field.LegPhysicalSettlCurency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlCurency getLegPhysicalSettlCurency() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlCurency());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlCurency field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlCurency() {
    return isSetField(41601);
  }

  public void set(quickfix.field.LegPhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlBusinessDays get(quickfix.field.LegPhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlBusinessDays getLegPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlBusinessDays() {
    return isSetField(41602);
  }

  public void set(quickfix.field.LegPhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlMaximumBusinessDays get(quickfix.field.LegPhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlMaximumBusinessDays getLegPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlMaximumBusinessDays() {
    return isSetField(41603);
  }

  public void set(quickfix.field.LegPhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlTermXID get(quickfix.field.LegPhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlTermXID getLegPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlTermXID() {
    return isSetField(41600);
  }
}

  public void set(quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp getLegPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegPhysicalSettlDeliverableObligationGrp());
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

  public void set(quickfix.field.LegPhysicalSettlCurency value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlCurency get(quickfix.field.LegPhysicalSettlCurency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlCurency getLegPhysicalSettlCurency() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlCurency());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlCurency field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlCurency() {
    return isSetField(41601);
  }

  public void set(quickfix.field.LegPhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlBusinessDays get(quickfix.field.LegPhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlBusinessDays getLegPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlBusinessDays() {
    return isSetField(41602);
  }

  public void set(quickfix.field.LegPhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlMaximumBusinessDays get(quickfix.field.LegPhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlMaximumBusinessDays getLegPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlMaximumBusinessDays() {
    return isSetField(41603);
  }

  public void set(quickfix.field.LegPhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.LegPhysicalSettlTermXID get(quickfix.field.LegPhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegPhysicalSettlTermXID getLegPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegPhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.LegPhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegPhysicalSettlTermXID() {
    return isSetField(41600);
  }
}

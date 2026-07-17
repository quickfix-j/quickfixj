/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingPhysicalSettlTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42060, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingPhysicalSettlTermGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingPhysicalSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingPhysicalSettlTerms get(quickfix.field.NoUnderlyingPhysicalSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingPhysicalSettlTerms getNoUnderlyingPhysicalSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingPhysicalSettlTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingPhysicalSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingPhysicalSettlTerms() {
    return isSetField(42060);
  }

public static class NoUnderlyingPhysicalSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42065, 42061, 42062, 42063, 42064, 0};

  public NoUnderlyingPhysicalSettlTerms() {
    super(42060, 42065, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp getUnderlyingPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp());
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

  public void set(quickfix.field.UnderlyingPhysicalSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlCurrency get(quickfix.field.UnderlyingPhysicalSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlCurrency getUnderlyingPhysicalSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlCurrency() {
    return isSetField(42061);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlBusinessDays get(quickfix.field.UnderlyingPhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlBusinessDays getUnderlyingPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlBusinessDays() {
    return isSetField(42062);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays get(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays getUnderlyingPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlMaximumBusinessDays() {
    return isSetField(42063);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlTermXID get(quickfix.field.UnderlyingPhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlTermXID getUnderlyingPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlTermXID() {
    return isSetField(42064);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp getUnderlyingPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingPhysicalSettlDeliverableObligationGrp());
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

  public void set(quickfix.field.UnderlyingPhysicalSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlCurrency get(quickfix.field.UnderlyingPhysicalSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlCurrency getUnderlyingPhysicalSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlCurrency() {
    return isSetField(42061);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlBusinessDays get(quickfix.field.UnderlyingPhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlBusinessDays getUnderlyingPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlBusinessDays() {
    return isSetField(42062);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays get(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays getUnderlyingPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlMaximumBusinessDays() {
    return isSetField(42063);
  }

  public void set(quickfix.field.UnderlyingPhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingPhysicalSettlTermXID get(quickfix.field.UnderlyingPhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingPhysicalSettlTermXID getUnderlyingPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingPhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingPhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingPhysicalSettlTermXID() {
    return isSetField(42064);
  }
}

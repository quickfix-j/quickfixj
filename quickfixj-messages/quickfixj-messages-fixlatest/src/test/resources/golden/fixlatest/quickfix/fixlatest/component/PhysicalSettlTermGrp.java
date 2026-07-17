/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PhysicalSettlTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40204, };
  protected int[] getGroupFields() { return componentGroups; }

  public PhysicalSettlTermGrp() {
    super();
  }

  public void set(quickfix.field.NoPhysicalSettlTerms value) {
    setField(value);
  }

  public quickfix.field.NoPhysicalSettlTerms get(quickfix.field.NoPhysicalSettlTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPhysicalSettlTerms getNoPhysicalSettlTerms() throws FieldNotFound {
    return get(new quickfix.field.NoPhysicalSettlTerms());
  }

  public boolean isSet(quickfix.field.NoPhysicalSettlTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoPhysicalSettlTerms() {
    return isSetField(40204);
  }

public static class NoPhysicalSettlTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40209, 40205, 40206, 40207, 40208, 0};

  public NoPhysicalSettlTerms() {
    super(40204, 40209, ORDER);
  }

  public void set(quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp getPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp());
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

  public void set(quickfix.field.PhysicalSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlCurrency get(quickfix.field.PhysicalSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlCurrency getPhysicalSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlCurrency());
  }

  public boolean isSet(quickfix.field.PhysicalSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlCurrency() {
    return isSetField(40205);
  }

  public void set(quickfix.field.PhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlBusinessDays get(quickfix.field.PhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlBusinessDays getPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.PhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlBusinessDays() {
    return isSetField(40206);
  }

  public void set(quickfix.field.PhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlMaximumBusinessDays get(quickfix.field.PhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlMaximumBusinessDays getPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.PhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlMaximumBusinessDays() {
    return isSetField(40207);
  }

  public void set(quickfix.field.PhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlTermXID get(quickfix.field.PhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlTermXID getPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.PhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlTermXID() {
    return isSetField(40208);
  }
}

  public void set(quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp get(quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp getPhysicalSettlDeliverableObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PhysicalSettlDeliverableObligationGrp());
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

  public void set(quickfix.field.PhysicalSettlCurrency value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlCurrency get(quickfix.field.PhysicalSettlCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlCurrency getPhysicalSettlCurrency() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlCurrency());
  }

  public boolean isSet(quickfix.field.PhysicalSettlCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlCurrency() {
    return isSetField(40205);
  }

  public void set(quickfix.field.PhysicalSettlBusinessDays value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlBusinessDays get(quickfix.field.PhysicalSettlBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlBusinessDays getPhysicalSettlBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlBusinessDays());
  }

  public boolean isSet(quickfix.field.PhysicalSettlBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlBusinessDays() {
    return isSetField(40206);
  }

  public void set(quickfix.field.PhysicalSettlMaximumBusinessDays value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlMaximumBusinessDays get(quickfix.field.PhysicalSettlMaximumBusinessDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlMaximumBusinessDays getPhysicalSettlMaximumBusinessDays() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlMaximumBusinessDays());
  }

  public boolean isSet(quickfix.field.PhysicalSettlMaximumBusinessDays field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlMaximumBusinessDays() {
    return isSetField(40207);
  }

  public void set(quickfix.field.PhysicalSettlTermXID value) {
    setField(value);
  }

  public quickfix.field.PhysicalSettlTermXID get(quickfix.field.PhysicalSettlTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PhysicalSettlTermXID getPhysicalSettlTermXID() throws FieldNotFound {
    return get(new quickfix.field.PhysicalSettlTermXID());
  }

  public boolean isSet(quickfix.field.PhysicalSettlTermXID field) {
    return isSetField(field);
  }

  public boolean isSetPhysicalSettlTermXID() {
    return isSetField(40208);
  }
}

/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProtectionTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40181, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProtectionTermGrp() {
    super();
  }

  public void set(quickfix.field.NoProtectionTerms value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTerms get(quickfix.field.NoProtectionTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTerms getNoProtectionTerms() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTerms());
  }

  public boolean isSet(quickfix.field.NoProtectionTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTerms() {
    return isSetField(40181);
  }

public static class NoProtectionTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40182, 40183, 40184, 40185, 40186, 40187, 40188, 40951, 40191, 40201, 40190, 0};

  public NoProtectionTerms() {
    super(40181, 40182, ORDER);
  }

  public void set(quickfix.field.ProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermNotional get(quickfix.field.ProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermNotional getProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.ProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermNotional() {
    return isSetField(40182);
  }

  public void set(quickfix.field.ProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermCurrency get(quickfix.field.ProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermCurrency getProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermCurrency() {
    return isSetField(40183);
  }

  public void set(quickfix.field.ProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermSellerNotifies get(quickfix.field.ProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermSellerNotifies getProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.ProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermSellerNotifies() {
    return isSetField(40184);
  }

  public void set(quickfix.field.ProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermBuyerNotifies get(quickfix.field.ProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermBuyerNotifies getProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.ProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermBuyerNotifies() {
    return isSetField(40185);
  }

  public void set(quickfix.field.ProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventBusinessCenter get(quickfix.field.ProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventBusinessCenter getProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventBusinessCenter() {
    return isSetField(40186);
  }

  public void set(quickfix.field.ProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermStandardSources get(quickfix.field.ProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermStandardSources getProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.ProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermStandardSources() {
    return isSetField(40187);
  }

  public void set(quickfix.field.ProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventMinimumSources get(quickfix.field.ProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventMinimumSources getProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventMinimumSources() {
    return isSetField(40188);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp getProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventNewsSources get(quickfix.field.NoProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventNewsSources getNoProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventNewsSources() {
    return isSetField(40951);
  }

public static class NoProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40189, 0};

  public NoProtectionTermEventNewsSources() {
    super(40951, 40189, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventNewsSource get(quickfix.field.ProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventNewsSource getProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventNewsSource() {
    return isSetField(40189);
  }
}

  public void set(quickfix.fixlatest.component.ProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventGrp get(quickfix.fixlatest.component.ProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventGrp getProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEvents get(quickfix.field.NoProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEvents getNoProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEvents() {
    return isSetField(40191);
  }

public static class NoProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40192, 40193, 40194, 40195, 40196, 40197, 40198, 40199, 0};

  public NoProtectionTermEvents() {
    super(40191, 40192, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventType get(quickfix.field.ProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventType getProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventType() {
    return isSetField(40192);
  }

  public void set(quickfix.field.ProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventValue get(quickfix.field.ProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventValue getProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventValue() {
    return isSetField(40193);
  }

  public void set(quickfix.field.ProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventCurrency get(quickfix.field.ProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventCurrency getProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventCurrency() {
    return isSetField(40194);
  }

  public void set(quickfix.field.ProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventPeriod get(quickfix.field.ProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventPeriod getProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventPeriod() {
    return isSetField(40195);
  }

  public void set(quickfix.field.ProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventUnit get(quickfix.field.ProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventUnit getProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventUnit() {
    return isSetField(40196);
  }

  public void set(quickfix.field.ProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventDayType get(quickfix.field.ProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventDayType getProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventDayType() {
    return isSetField(40197);
  }

  public void set(quickfix.field.ProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventRateSource get(quickfix.field.ProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventRateSource getProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventRateSource() {
    return isSetField(40198);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp getProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventQualifiers get(quickfix.field.NoProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventQualifiers getNoProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventQualifiers() {
    return isSetField(40199);
  }

public static class NoProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40200, 0};

  public NoProtectionTermEventQualifiers() {
    super(40199, 40200, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}
}

  public void set(quickfix.fixlatest.component.ProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermObligationGrp get(quickfix.fixlatest.component.ProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermObligationGrp getProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermObligations get(quickfix.field.NoProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermObligations getNoProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermObligations() {
    return isSetField(40201);
  }

public static class NoProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40202, 40203, 0};

  public NoProtectionTermObligations() {
    super(40201, 40202, ORDER);
  }

  public void set(quickfix.field.ProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationType get(quickfix.field.ProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationType getProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationType() {
    return isSetField(40202);
  }

  public void set(quickfix.field.ProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationValue get(quickfix.field.ProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationValue getProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationValue() {
    return isSetField(40203);
  }
}

  public void set(quickfix.field.ProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermXID get(quickfix.field.ProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermXID getProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermXID());
  }

  public boolean isSet(quickfix.field.ProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermXID() {
    return isSetField(40190);
  }
}

  public void set(quickfix.field.ProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermNotional get(quickfix.field.ProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermNotional getProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.ProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermNotional() {
    return isSetField(40182);
  }

  public void set(quickfix.field.ProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermCurrency get(quickfix.field.ProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermCurrency getProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermCurrency() {
    return isSetField(40183);
  }

  public void set(quickfix.field.ProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermSellerNotifies get(quickfix.field.ProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermSellerNotifies getProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.ProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermSellerNotifies() {
    return isSetField(40184);
  }

  public void set(quickfix.field.ProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermBuyerNotifies get(quickfix.field.ProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermBuyerNotifies getProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.ProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermBuyerNotifies() {
    return isSetField(40185);
  }

  public void set(quickfix.field.ProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventBusinessCenter get(quickfix.field.ProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventBusinessCenter getProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventBusinessCenter() {
    return isSetField(40186);
  }

  public void set(quickfix.field.ProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermStandardSources get(quickfix.field.ProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermStandardSources getProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.ProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermStandardSources() {
    return isSetField(40187);
  }

  public void set(quickfix.field.ProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventMinimumSources get(quickfix.field.ProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventMinimumSources getProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventMinimumSources() {
    return isSetField(40188);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp getProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventNewsSources get(quickfix.field.NoProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventNewsSources getNoProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventNewsSources() {
    return isSetField(40951);
  }

public static class NoProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40189, 0};

  public NoProtectionTermEventNewsSources() {
    super(40951, 40189, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventNewsSource get(quickfix.field.ProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventNewsSource getProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventNewsSource() {
    return isSetField(40189);
  }
}

  public void set(quickfix.fixlatest.component.ProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventGrp get(quickfix.fixlatest.component.ProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventGrp getProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEvents get(quickfix.field.NoProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEvents getNoProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEvents() {
    return isSetField(40191);
  }

public static class NoProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40192, 40193, 40194, 40195, 40196, 40197, 40198, 40199, 0};

  public NoProtectionTermEvents() {
    super(40191, 40192, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventType get(quickfix.field.ProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventType getProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventType() {
    return isSetField(40192);
  }

  public void set(quickfix.field.ProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventValue get(quickfix.field.ProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventValue getProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventValue() {
    return isSetField(40193);
  }

  public void set(quickfix.field.ProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventCurrency get(quickfix.field.ProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventCurrency getProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventCurrency() {
    return isSetField(40194);
  }

  public void set(quickfix.field.ProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventPeriod get(quickfix.field.ProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventPeriod getProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventPeriod() {
    return isSetField(40195);
  }

  public void set(quickfix.field.ProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventUnit get(quickfix.field.ProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventUnit getProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventUnit() {
    return isSetField(40196);
  }

  public void set(quickfix.field.ProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventDayType get(quickfix.field.ProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventDayType getProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventDayType() {
    return isSetField(40197);
  }

  public void set(quickfix.field.ProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventRateSource get(quickfix.field.ProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventRateSource getProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventRateSource() {
    return isSetField(40198);
  }

  public void set(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.ProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermEventQualifierGrp getProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventQualifiers get(quickfix.field.NoProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventQualifiers getNoProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventQualifiers() {
    return isSetField(40199);
  }

public static class NoProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40200, 0};

  public NoProtectionTermEventQualifiers() {
    super(40199, 40200, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventQualifier get(quickfix.field.ProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventQualifier getProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventQualifier() {
    return isSetField(40200);
  }
}
}

  public void set(quickfix.fixlatest.component.ProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ProtectionTermObligationGrp get(quickfix.fixlatest.component.ProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ProtectionTermObligationGrp getProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermObligations get(quickfix.field.NoProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermObligations getNoProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermObligations() {
    return isSetField(40201);
  }

public static class NoProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40202, 40203, 0};

  public NoProtectionTermObligations() {
    super(40201, 40202, ORDER);
  }

  public void set(quickfix.field.ProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationType get(quickfix.field.ProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationType getProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationType() {
    return isSetField(40202);
  }

  public void set(quickfix.field.ProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermObligationValue get(quickfix.field.ProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermObligationValue getProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.ProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermObligationValue() {
    return isSetField(40203);
  }
}

  public void set(quickfix.field.ProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermXID get(quickfix.field.ProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermXID getProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermXID());
  }

  public boolean isSet(quickfix.field.ProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermXID() {
    return isSetField(40190);
  }
}

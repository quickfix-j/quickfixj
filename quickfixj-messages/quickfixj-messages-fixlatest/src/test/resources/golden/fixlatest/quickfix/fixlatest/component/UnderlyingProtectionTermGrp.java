/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProtectionTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42068, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProtectionTermGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProtectionTerms value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTerms get(quickfix.field.NoUnderlyingProtectionTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTerms getNoUnderlyingProtectionTerms() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTerms());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTerms() {
    return isSetField(42068);
  }

public static class NoUnderlyingProtectionTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42069, 42070, 42071, 42072, 42073, 42074, 42075, 42090, 42077, 42087, 42076, 0};

  public NoUnderlyingProtectionTerms() {
    super(42068, 42069, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermNotional get(quickfix.field.UnderlyingProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermNotional getUnderlyingProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermNotional() {
    return isSetField(42069);
  }

  public void set(quickfix.field.UnderlyingProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermCurrency get(quickfix.field.UnderlyingProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermCurrency getUnderlyingProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermCurrency() {
    return isSetField(42070);
  }

  public void set(quickfix.field.UnderlyingProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermSellerNotifies get(quickfix.field.UnderlyingProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermSellerNotifies getUnderlyingProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermSellerNotifies() {
    return isSetField(42071);
  }

  public void set(quickfix.field.UnderlyingProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermBuyerNotifies get(quickfix.field.UnderlyingProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermBuyerNotifies getUnderlyingProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermBuyerNotifies() {
    return isSetField(42072);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventBusinessCenter get(quickfix.field.UnderlyingProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventBusinessCenter getUnderlyingProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventBusinessCenter() {
    return isSetField(42073);
  }

  public void set(quickfix.field.UnderlyingProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermStandardSources get(quickfix.field.UnderlyingProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermStandardSources getUnderlyingProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermStandardSources() {
    return isSetField(42074);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventMinimumSources get(quickfix.field.UnderlyingProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventMinimumSources getUnderlyingProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventMinimumSources() {
    return isSetField(42075);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp getUnderlyingProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources get(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources getNoUnderlyingProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventNewsSources() {
    return isSetField(42090);
  }

public static class NoUnderlyingProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42091, 0};

  public NoUnderlyingProtectionTermEventNewsSources() {
    super(42090, 42091, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource get(quickfix.field.UnderlyingProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource getUnderlyingProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventNewsSource() {
    return isSetField(42091);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp getUnderlyingProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents get(quickfix.field.NoUnderlyingProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents getNoUnderlyingProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEvents() {
    return isSetField(42077);
  }

public static class NoUnderlyingProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42078, 42079, 42080, 42081, 42082, 42083, 42084, 42085, 0};

  public NoUnderlyingProtectionTermEvents() {
    super(42077, 42078, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventType get(quickfix.field.UnderlyingProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventType getUnderlyingProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventType() {
    return isSetField(42078);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventValue get(quickfix.field.UnderlyingProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventValue getUnderlyingProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventValue() {
    return isSetField(42079);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency get(quickfix.field.UnderlyingProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency getUnderlyingProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventCurrency() {
    return isSetField(42080);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod get(quickfix.field.UnderlyingProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod getUnderlyingProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventPeriod() {
    return isSetField(42081);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit get(quickfix.field.UnderlyingProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit getUnderlyingProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventUnit() {
    return isSetField(42082);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType get(quickfix.field.UnderlyingProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType getUnderlyingProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventDayType() {
    return isSetField(42083);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource get(quickfix.field.UnderlyingProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource getUnderlyingProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventRateSource() {
    return isSetField(42084);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp getUnderlyingProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers get(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers getNoUnderlyingProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventQualifiers() {
    return isSetField(42085);
  }

public static class NoUnderlyingProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42086, 0};

  public NoUnderlyingProtectionTermEventQualifiers() {
    super(42085, 42086, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp getUnderlyingProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations get(quickfix.field.NoUnderlyingProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations getNoUnderlyingProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermObligations() {
    return isSetField(42087);
  }

public static class NoUnderlyingProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42088, 42089, 0};

  public NoUnderlyingProtectionTermObligations() {
    super(42087, 42088, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationType get(quickfix.field.UnderlyingProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationType getUnderlyingProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationType() {
    return isSetField(42088);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue get(quickfix.field.UnderlyingProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue getUnderlyingProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationValue() {
    return isSetField(42089);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermXID get(quickfix.field.UnderlyingProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermXID getUnderlyingProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermXID() {
    return isSetField(42076);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermNotional get(quickfix.field.UnderlyingProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermNotional getUnderlyingProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermNotional() {
    return isSetField(42069);
  }

  public void set(quickfix.field.UnderlyingProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermCurrency get(quickfix.field.UnderlyingProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermCurrency getUnderlyingProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermCurrency() {
    return isSetField(42070);
  }

  public void set(quickfix.field.UnderlyingProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermSellerNotifies get(quickfix.field.UnderlyingProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermSellerNotifies getUnderlyingProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermSellerNotifies() {
    return isSetField(42071);
  }

  public void set(quickfix.field.UnderlyingProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermBuyerNotifies get(quickfix.field.UnderlyingProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermBuyerNotifies getUnderlyingProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermBuyerNotifies() {
    return isSetField(42072);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventBusinessCenter get(quickfix.field.UnderlyingProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventBusinessCenter getUnderlyingProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventBusinessCenter() {
    return isSetField(42073);
  }

  public void set(quickfix.field.UnderlyingProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermStandardSources get(quickfix.field.UnderlyingProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermStandardSources getUnderlyingProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermStandardSources() {
    return isSetField(42074);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventMinimumSources get(quickfix.field.UnderlyingProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventMinimumSources getUnderlyingProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventMinimumSources() {
    return isSetField(42075);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp getUnderlyingProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources get(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources getNoUnderlyingProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventNewsSources() {
    return isSetField(42090);
  }

public static class NoUnderlyingProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42091, 0};

  public NoUnderlyingProtectionTermEventNewsSources() {
    super(42090, 42091, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource get(quickfix.field.UnderlyingProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource getUnderlyingProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventNewsSource() {
    return isSetField(42091);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp getUnderlyingProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents get(quickfix.field.NoUnderlyingProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEvents getNoUnderlyingProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEvents() {
    return isSetField(42077);
  }

public static class NoUnderlyingProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42078, 42079, 42080, 42081, 42082, 42083, 42084, 42085, 0};

  public NoUnderlyingProtectionTermEvents() {
    super(42077, 42078, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventType get(quickfix.field.UnderlyingProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventType getUnderlyingProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventType() {
    return isSetField(42078);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventValue get(quickfix.field.UnderlyingProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventValue getUnderlyingProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventValue() {
    return isSetField(42079);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency get(quickfix.field.UnderlyingProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventCurrency getUnderlyingProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventCurrency() {
    return isSetField(42080);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod get(quickfix.field.UnderlyingProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventPeriod getUnderlyingProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventPeriod() {
    return isSetField(42081);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit get(quickfix.field.UnderlyingProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventUnit getUnderlyingProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventUnit() {
    return isSetField(42082);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType get(quickfix.field.UnderlyingProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventDayType getUnderlyingProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventDayType() {
    return isSetField(42083);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource get(quickfix.field.UnderlyingProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventRateSource getUnderlyingProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventRateSource() {
    return isSetField(42084);
  }

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp getUnderlyingProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers get(quickfix.field.NoUnderlyingProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventQualifiers getNoUnderlyingProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventQualifiers() {
    return isSetField(42085);
  }

public static class NoUnderlyingProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42086, 0};

  public NoUnderlyingProtectionTermEventQualifiers() {
    super(42085, 42086, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier get(quickfix.field.UnderlyingProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventQualifier getUnderlyingProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventQualifier() {
    return isSetField(42086);
  }
}
}

  public void set(quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp get(quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp getUnderlyingProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations get(quickfix.field.NoUnderlyingProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermObligations getNoUnderlyingProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermObligations() {
    return isSetField(42087);
  }

public static class NoUnderlyingProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42088, 42089, 0};

  public NoUnderlyingProtectionTermObligations() {
    super(42087, 42088, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationType get(quickfix.field.UnderlyingProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationType getUnderlyingProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationType() {
    return isSetField(42088);
  }

  public void set(quickfix.field.UnderlyingProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue get(quickfix.field.UnderlyingProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermObligationValue getUnderlyingProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermObligationValue() {
    return isSetField(42089);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermXID get(quickfix.field.UnderlyingProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermXID getUnderlyingProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermXID());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermXID() {
    return isSetField(42076);
  }
}

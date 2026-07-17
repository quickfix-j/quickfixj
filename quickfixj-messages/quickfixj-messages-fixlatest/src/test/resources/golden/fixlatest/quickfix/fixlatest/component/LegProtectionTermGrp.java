/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProtectionTermGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41616, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProtectionTermGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProtectionTerms value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTerms get(quickfix.field.NoLegProtectionTerms value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTerms getNoLegProtectionTerms() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTerms());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTerms field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTerms() {
    return isSetField(41616);
  }

public static class NoLegProtectionTerms extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41618, 41619, 41620, 41621, 41622, 41623, 41624, 41614, 41625, 41635, 41617, 0};

  public NoLegProtectionTerms() {
    super(41616, 41618, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermNotional get(quickfix.field.LegProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermNotional getLegProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.LegProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermNotional() {
    return isSetField(41618);
  }

  public void set(quickfix.field.LegProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermCurrency get(quickfix.field.LegProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermCurrency getLegProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermCurrency() {
    return isSetField(41619);
  }

  public void set(quickfix.field.LegProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermSellerNotifies get(quickfix.field.LegProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermSellerNotifies getLegProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.LegProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermSellerNotifies() {
    return isSetField(41620);
  }

  public void set(quickfix.field.LegProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermBuyerNotifies get(quickfix.field.LegProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermBuyerNotifies getLegProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.LegProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermBuyerNotifies() {
    return isSetField(41621);
  }

  public void set(quickfix.field.LegProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventBusinessCenter get(quickfix.field.LegProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventBusinessCenter getLegProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventBusinessCenter() {
    return isSetField(41622);
  }

  public void set(quickfix.field.LegProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermStandardSources get(quickfix.field.LegProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermStandardSources getLegProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.LegProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermStandardSources() {
    return isSetField(41623);
  }

  public void set(quickfix.field.LegProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventMinimumSources get(quickfix.field.LegProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventMinimumSources getLegProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventMinimumSources() {
    return isSetField(41624);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp getLegProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources get(quickfix.field.NoLegProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources getNoLegProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventNewsSources() {
    return isSetField(41614);
  }

public static class NoLegProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41615, 0};

  public NoLegProtectionTermEventNewsSources() {
    super(41614, 41615, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventNewsSource get(quickfix.field.LegProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventNewsSource getLegProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventNewsSource() {
    return isSetField(41615);
  }
}

  public void set(quickfix.fixlatest.component.LegProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventGrp get(quickfix.fixlatest.component.LegProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventGrp getLegProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEvents get(quickfix.field.NoLegProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEvents getNoLegProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEvents() {
    return isSetField(41625);
  }

public static class NoLegProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41626, 41627, 41628, 41629, 41630, 41631, 41632, 41633, 0};

  public NoLegProtectionTermEvents() {
    super(41625, 41626, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventType get(quickfix.field.LegProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventType getLegProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventType() {
    return isSetField(41626);
  }

  public void set(quickfix.field.LegProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventValue get(quickfix.field.LegProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventValue getLegProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventValue() {
    return isSetField(41627);
  }

  public void set(quickfix.field.LegProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventCurrency get(quickfix.field.LegProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventCurrency getLegProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventCurrency() {
    return isSetField(41628);
  }

  public void set(quickfix.field.LegProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventPeriod get(quickfix.field.LegProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventPeriod getLegProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventPeriod() {
    return isSetField(41629);
  }

  public void set(quickfix.field.LegProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventUnit get(quickfix.field.LegProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventUnit getLegProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventUnit() {
    return isSetField(41630);
  }

  public void set(quickfix.field.LegProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventDayType get(quickfix.field.LegProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventDayType getLegProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventDayType() {
    return isSetField(41631);
  }

  public void set(quickfix.field.LegProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventRateSource get(quickfix.field.LegProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventRateSource getLegProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventRateSource() {
    return isSetField(41632);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp getLegProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers get(quickfix.field.NoLegProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers getNoLegProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventQualifiers() {
    return isSetField(41633);
  }

public static class NoLegProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41634, 0};

  public NoLegProtectionTermEventQualifiers() {
    super(41633, 41634, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}
}

  public void set(quickfix.fixlatest.component.LegProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermObligationGrp get(quickfix.fixlatest.component.LegProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermObligationGrp getLegProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermObligations get(quickfix.field.NoLegProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermObligations getNoLegProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermObligations() {
    return isSetField(41635);
  }

public static class NoLegProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41636, 41637, 0};

  public NoLegProtectionTermObligations() {
    super(41635, 41636, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationType get(quickfix.field.LegProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationType getLegProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationType() {
    return isSetField(41636);
  }

  public void set(quickfix.field.LegProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationValue get(quickfix.field.LegProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationValue getLegProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationValue() {
    return isSetField(41637);
  }
}

  public void set(quickfix.field.LegProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermXID get(quickfix.field.LegProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermXID getLegProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermXID());
  }

  public boolean isSet(quickfix.field.LegProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermXID() {
    return isSetField(41617);
  }
}

  public void set(quickfix.field.LegProtectionTermNotional value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermNotional get(quickfix.field.LegProtectionTermNotional value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermNotional getLegProtectionTermNotional() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermNotional());
  }

  public boolean isSet(quickfix.field.LegProtectionTermNotional field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermNotional() {
    return isSetField(41618);
  }

  public void set(quickfix.field.LegProtectionTermCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermCurrency get(quickfix.field.LegProtectionTermCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermCurrency getLegProtectionTermCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermCurrency() {
    return isSetField(41619);
  }

  public void set(quickfix.field.LegProtectionTermSellerNotifies value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermSellerNotifies get(quickfix.field.LegProtectionTermSellerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermSellerNotifies getLegProtectionTermSellerNotifies() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermSellerNotifies());
  }

  public boolean isSet(quickfix.field.LegProtectionTermSellerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermSellerNotifies() {
    return isSetField(41620);
  }

  public void set(quickfix.field.LegProtectionTermBuyerNotifies value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermBuyerNotifies get(quickfix.field.LegProtectionTermBuyerNotifies value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermBuyerNotifies getLegProtectionTermBuyerNotifies() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermBuyerNotifies());
  }

  public boolean isSet(quickfix.field.LegProtectionTermBuyerNotifies field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermBuyerNotifies() {
    return isSetField(41621);
  }

  public void set(quickfix.field.LegProtectionTermEventBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventBusinessCenter get(quickfix.field.LegProtectionTermEventBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventBusinessCenter getLegProtectionTermEventBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventBusinessCenter());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventBusinessCenter() {
    return isSetField(41622);
  }

  public void set(quickfix.field.LegProtectionTermStandardSources value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermStandardSources get(quickfix.field.LegProtectionTermStandardSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermStandardSources getLegProtectionTermStandardSources() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermStandardSources());
  }

  public boolean isSet(quickfix.field.LegProtectionTermStandardSources field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermStandardSources() {
    return isSetField(41623);
  }

  public void set(quickfix.field.LegProtectionTermEventMinimumSources value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventMinimumSources get(quickfix.field.LegProtectionTermEventMinimumSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventMinimumSources getLegProtectionTermEventMinimumSources() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventMinimumSources());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventMinimumSources field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventMinimumSources() {
    return isSetField(41624);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp get(quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp getLegProtectionTermEventNewsSourceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventNewsSourceGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources get(quickfix.field.NoLegProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources getNoLegProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventNewsSources() {
    return isSetField(41614);
  }

public static class NoLegProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41615, 0};

  public NoLegProtectionTermEventNewsSources() {
    super(41614, 41615, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventNewsSource get(quickfix.field.LegProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventNewsSource getLegProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventNewsSource() {
    return isSetField(41615);
  }
}

  public void set(quickfix.fixlatest.component.LegProtectionTermEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventGrp get(quickfix.fixlatest.component.LegProtectionTermEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventGrp getLegProtectionTermEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEvents get(quickfix.field.NoLegProtectionTermEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEvents getNoLegProtectionTermEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEvents());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEvents() {
    return isSetField(41625);
  }

public static class NoLegProtectionTermEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41626, 41627, 41628, 41629, 41630, 41631, 41632, 41633, 0};

  public NoLegProtectionTermEvents() {
    super(41625, 41626, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventType get(quickfix.field.LegProtectionTermEventType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventType getLegProtectionTermEventType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventType() {
    return isSetField(41626);
  }

  public void set(quickfix.field.LegProtectionTermEventValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventValue get(quickfix.field.LegProtectionTermEventValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventValue getLegProtectionTermEventValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventValue() {
    return isSetField(41627);
  }

  public void set(quickfix.field.LegProtectionTermEventCurrency value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventCurrency get(quickfix.field.LegProtectionTermEventCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventCurrency getLegProtectionTermEventCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventCurrency());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventCurrency() {
    return isSetField(41628);
  }

  public void set(quickfix.field.LegProtectionTermEventPeriod value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventPeriod get(quickfix.field.LegProtectionTermEventPeriod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventPeriod getLegProtectionTermEventPeriod() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventPeriod());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventPeriod field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventPeriod() {
    return isSetField(41629);
  }

  public void set(quickfix.field.LegProtectionTermEventUnit value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventUnit get(quickfix.field.LegProtectionTermEventUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventUnit getLegProtectionTermEventUnit() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventUnit());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventUnit field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventUnit() {
    return isSetField(41630);
  }

  public void set(quickfix.field.LegProtectionTermEventDayType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventDayType get(quickfix.field.LegProtectionTermEventDayType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventDayType getLegProtectionTermEventDayType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventDayType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventDayType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventDayType() {
    return isSetField(41631);
  }

  public void set(quickfix.field.LegProtectionTermEventRateSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventRateSource get(quickfix.field.LegProtectionTermEventRateSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventRateSource getLegProtectionTermEventRateSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventRateSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventRateSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventRateSource() {
    return isSetField(41632);
  }

  public void set(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp get(quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp getLegProtectionTermEventQualifierGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermEventQualifierGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers get(quickfix.field.NoLegProtectionTermEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventQualifiers getNoLegProtectionTermEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventQualifiers() {
    return isSetField(41633);
  }

public static class NoLegProtectionTermEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41634, 0};

  public NoLegProtectionTermEventQualifiers() {
    super(41633, 41634, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventQualifier get(quickfix.field.LegProtectionTermEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventQualifier getLegProtectionTermEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventQualifier());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventQualifier() {
    return isSetField(41634);
  }
}
}

  public void set(quickfix.fixlatest.component.LegProtectionTermObligationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegProtectionTermObligationGrp get(quickfix.fixlatest.component.LegProtectionTermObligationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegProtectionTermObligationGrp getLegProtectionTermObligationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegProtectionTermObligationGrp());
  }

  public void set(quickfix.field.NoLegProtectionTermObligations value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermObligations get(quickfix.field.NoLegProtectionTermObligations value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermObligations getNoLegProtectionTermObligations() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermObligations());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermObligations field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermObligations() {
    return isSetField(41635);
  }

public static class NoLegProtectionTermObligations extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41636, 41637, 0};

  public NoLegProtectionTermObligations() {
    super(41635, 41636, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermObligationType value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationType get(quickfix.field.LegProtectionTermObligationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationType getLegProtectionTermObligationType() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationType());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationType field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationType() {
    return isSetField(41636);
  }

  public void set(quickfix.field.LegProtectionTermObligationValue value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermObligationValue get(quickfix.field.LegProtectionTermObligationValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermObligationValue getLegProtectionTermObligationValue() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermObligationValue());
  }

  public boolean isSet(quickfix.field.LegProtectionTermObligationValue field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermObligationValue() {
    return isSetField(41637);
  }
}

  public void set(quickfix.field.LegProtectionTermXID value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermXID get(quickfix.field.LegProtectionTermXID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermXID getLegProtectionTermXID() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermXID());
  }

  public boolean isSet(quickfix.field.LegProtectionTermXID field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermXID() {
    return isSetField(41617);
  }
}

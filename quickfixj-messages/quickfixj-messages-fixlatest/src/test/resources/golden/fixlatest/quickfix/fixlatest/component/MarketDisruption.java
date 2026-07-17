/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarketDisruption extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41087, 41088, 41089, 41090, 41091, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public MarketDisruption() {
    super();
  }

  public void set(quickfix.field.MarketDisruptionProvision value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionProvision get(quickfix.field.MarketDisruptionProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionProvision getMarketDisruptionProvision() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionProvision());
  }

  public boolean isSet(quickfix.field.MarketDisruptionProvision field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionProvision() {
    return isSetField(41087);
  }

  public void set(quickfix.fixlatest.component.MarketDisruptionEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketDisruptionEventGrp get(quickfix.fixlatest.component.MarketDisruptionEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketDisruptionEventGrp getMarketDisruptionEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketDisruptionEventGrp());
  }

  public void set(quickfix.field.NoMarketDisruptionEvents value) {
    setField(value);
  }

  public quickfix.field.NoMarketDisruptionEvents get(quickfix.field.NoMarketDisruptionEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketDisruptionEvents getNoMarketDisruptionEvents() throws FieldNotFound {
    return get(new quickfix.field.NoMarketDisruptionEvents());
  }

  public boolean isSet(quickfix.field.NoMarketDisruptionEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketDisruptionEvents() {
    return isSetField(41092);
  }

public static class NoMarketDisruptionEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41093, 40991, 0};

  public NoMarketDisruptionEvents() {
    super(41092, 41093, ORDER);
  }

  public void set(quickfix.field.MarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionEvent get(quickfix.field.MarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionEvent getMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.MarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionEvent() {
    return isSetField(41093);
  }

  public void set(quickfix.field.MarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionValue get(quickfix.field.MarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionValue getMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.MarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionValue() {
    return isSetField(40991);
  }
}

  public void set(quickfix.field.MarketDisruptionFallbackProvision value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackProvision get(quickfix.field.MarketDisruptionFallbackProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackProvision getMarketDisruptionFallbackProvision() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackProvision());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackProvision field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackProvision() {
    return isSetField(41088);
  }

  public void set(quickfix.fixlatest.component.MarketDisruptionFallbackGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketDisruptionFallbackGrp get(quickfix.fixlatest.component.MarketDisruptionFallbackGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketDisruptionFallbackGrp getMarketDisruptionFallbackGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketDisruptionFallbackGrp());
  }

  public void set(quickfix.field.NoMarketDisruptionFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoMarketDisruptionFallbacks get(quickfix.field.NoMarketDisruptionFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketDisruptionFallbacks getNoMarketDisruptionFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoMarketDisruptionFallbacks());
  }

  public boolean isSet(quickfix.field.NoMarketDisruptionFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketDisruptionFallbacks() {
    return isSetField(41094);
  }

public static class NoMarketDisruptionFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41095, 40992, 0};

  public NoMarketDisruptionFallbacks() {
    super(41094, 41095, ORDER);
  }

  public void set(quickfix.field.MarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackType get(quickfix.field.MarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackType getMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackType() {
    return isSetField(41095);
  }

  public void set(quickfix.field.MarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackValue get(quickfix.field.MarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackValue getMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackValue() {
    return isSetField(40992);
  }
}

  public void set(quickfix.fixlatest.component.MarketDisruptionFallbackReferencePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketDisruptionFallbackReferencePriceGrp get(quickfix.fixlatest.component.MarketDisruptionFallbackReferencePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketDisruptionFallbackReferencePriceGrp getMarketDisruptionFallbackReferencePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketDisruptionFallbackReferencePriceGrp());
  }

  public void set(quickfix.field.NoMarketDisruptionFallbackReferencePrices value) {
    setField(value);
  }

  public quickfix.field.NoMarketDisruptionFallbackReferencePrices get(quickfix.field.NoMarketDisruptionFallbackReferencePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarketDisruptionFallbackReferencePrices getNoMarketDisruptionFallbackReferencePrices() throws FieldNotFound {
    return get(new quickfix.field.NoMarketDisruptionFallbackReferencePrices());
  }

  public boolean isSet(quickfix.field.NoMarketDisruptionFallbackReferencePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoMarketDisruptionFallbackReferencePrices() {
    return isSetField(41096);
  }

public static class NoMarketDisruptionFallbackReferencePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41097, 41098, 41099, 41100, 41101, 41102, 41103, 41104, 41105, 0};

  public NoMarketDisruptionFallbackReferencePrices() {
    super(41096, 41097, ORDER);
  }

  public void set(quickfix.field.MarketDisruptionFallbackUnderlierType value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierType get(quickfix.field.MarketDisruptionFallbackUnderlierType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierType getMarketDisruptionFallbackUnderlierType() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackUnderlierType());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackUnderlierType field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackUnderlierType() {
    return isSetField(41097);
  }

  public void set(quickfix.field.MarketDisruptionFallbackUnderlierSecurityID value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierSecurityID get(quickfix.field.MarketDisruptionFallbackUnderlierSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierSecurityID getMarketDisruptionFallbackUnderlierSecurityID() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackUnderlierSecurityID());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackUnderlierSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackUnderlierSecurityID() {
    return isSetField(41098);
  }

  public void set(quickfix.field.MarketDisruptionFallbackUnderlierSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierSecurityIDSource get(quickfix.field.MarketDisruptionFallbackUnderlierSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierSecurityIDSource getMarketDisruptionFallbackUnderlierSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackUnderlierSecurityIDSource());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackUnderlierSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackUnderlierSecurityIDSource() {
    return isSetField(41099);
  }

  public void set(quickfix.field.MarketDisruptionFallbackUnderlierSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierSecurityDesc get(quickfix.field.MarketDisruptionFallbackUnderlierSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackUnderlierSecurityDesc getMarketDisruptionFallbackUnderlierSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackUnderlierSecurityDesc());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackUnderlierSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackUnderlierSecurityDesc() {
    return isSetField(41100);
  }

  public void set(quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDescLen get(quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDescLen getEncodedMarketDisruptionFallbackUnderlierSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMarketDisruptionFallbackUnderlierSecurityDescLen() {
    return isSetField(41101);
  }

  public void set(quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDesc get(quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDesc getEncodedMarketDisruptionFallbackUnderlierSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDesc());
  }

  public boolean isSet(quickfix.field.EncodedMarketDisruptionFallbackUnderlierSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMarketDisruptionFallbackUnderlierSecurityDesc() {
    return isSetField(41102);
  }

  public void set(quickfix.field.MarketDisruptionFallbackOpenUnits value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackOpenUnits get(quickfix.field.MarketDisruptionFallbackOpenUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackOpenUnits getMarketDisruptionFallbackOpenUnits() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackOpenUnits());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackOpenUnits field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackOpenUnits() {
    return isSetField(41103);
  }

  public void set(quickfix.field.MarketDisruptionFallbackBasketCurrency value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackBasketCurrency get(quickfix.field.MarketDisruptionFallbackBasketCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackBasketCurrency getMarketDisruptionFallbackBasketCurrency() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackBasketCurrency());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackBasketCurrency field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackBasketCurrency() {
    return isSetField(41104);
  }

  public void set(quickfix.field.MarketDisruptionFallbackBasketDivisor value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionFallbackBasketDivisor get(quickfix.field.MarketDisruptionFallbackBasketDivisor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionFallbackBasketDivisor getMarketDisruptionFallbackBasketDivisor() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionFallbackBasketDivisor());
  }

  public boolean isSet(quickfix.field.MarketDisruptionFallbackBasketDivisor field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionFallbackBasketDivisor() {
    return isSetField(41105);
  }
}

  public void set(quickfix.field.MarketDisruptionMaximumDays value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionMaximumDays get(quickfix.field.MarketDisruptionMaximumDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionMaximumDays getMarketDisruptionMaximumDays() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionMaximumDays());
  }

  public boolean isSet(quickfix.field.MarketDisruptionMaximumDays field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionMaximumDays() {
    return isSetField(41089);
  }

  public void set(quickfix.field.MarketDisruptionMaterialityPercentage value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionMaterialityPercentage get(quickfix.field.MarketDisruptionMaterialityPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionMaterialityPercentage getMarketDisruptionMaterialityPercentage() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionMaterialityPercentage());
  }

  public boolean isSet(quickfix.field.MarketDisruptionMaterialityPercentage field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionMaterialityPercentage() {
    return isSetField(41090);
  }

  public void set(quickfix.field.MarketDisruptionMinimumFuturesContracts value) {
    setField(value);
  }

  public quickfix.field.MarketDisruptionMinimumFuturesContracts get(quickfix.field.MarketDisruptionMinimumFuturesContracts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDisruptionMinimumFuturesContracts getMarketDisruptionMinimumFuturesContracts() throws FieldNotFound {
    return get(new quickfix.field.MarketDisruptionMinimumFuturesContracts());
  }

  public boolean isSet(quickfix.field.MarketDisruptionMinimumFuturesContracts field) {
    return isSetField(field);
  }

  public boolean isSetMarketDisruptionMinimumFuturesContracts() {
    return isSetField(41091);
  }
}

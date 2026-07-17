/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingMarketDisruption extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41859, 41860, 41861, 41862, 41863, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingMarketDisruption() {
    super();
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionProvision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionProvision get(quickfix.field.UnderlyingMarketDisruptionProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionProvision getUnderlyingMarketDisruptionProvision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionProvision());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionProvision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionProvision() {
    return isSetField(41859);
  }

  public void set(quickfix.fixlatest.component.UnderlyingMarketDisruptionEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruptionEventGrp get(quickfix.fixlatest.component.UnderlyingMarketDisruptionEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruptionEventGrp getUnderlyingMarketDisruptionEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingMarketDisruptionEventGrp());
  }

  public void set(quickfix.field.NoUnderlyingMarketDisruptionEvents value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingMarketDisruptionEvents get(quickfix.field.NoUnderlyingMarketDisruptionEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingMarketDisruptionEvents getNoUnderlyingMarketDisruptionEvents() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingMarketDisruptionEvents());
  }

  public boolean isSet(quickfix.field.NoUnderlyingMarketDisruptionEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingMarketDisruptionEvents() {
    return isSetField(41864);
  }

public static class NoUnderlyingMarketDisruptionEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41865, 41338, 0};

  public NoUnderlyingMarketDisruptionEvents() {
    super(41864, 41865, ORDER);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionEvent get(quickfix.field.UnderlyingMarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionEvent getUnderlyingMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionEvent() {
    return isSetField(41865);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionValue get(quickfix.field.UnderlyingMarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionValue getUnderlyingMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionValue() {
    return isSetField(41338);
  }
}

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackProvision value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackProvision get(quickfix.field.UnderlyingMarketDisruptionFallbackProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackProvision getUnderlyingMarketDisruptionFallbackProvision() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackProvision());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackProvision field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackProvision() {
    return isSetField(41860);
  }

  public void set(quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackGrp get(quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackGrp getUnderlyingMarketDisruptionFallbackGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackGrp());
  }

  public void set(quickfix.field.NoUnderlyingMarketDisruptionFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingMarketDisruptionFallbacks get(quickfix.field.NoUnderlyingMarketDisruptionFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingMarketDisruptionFallbacks getNoUnderlyingMarketDisruptionFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingMarketDisruptionFallbacks());
  }

  public boolean isSet(quickfix.field.NoUnderlyingMarketDisruptionFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingMarketDisruptionFallbacks() {
    return isSetField(41866);
  }

public static class NoUnderlyingMarketDisruptionFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41867, 41339, 0};

  public NoUnderlyingMarketDisruptionFallbacks() {
    super(41866, 41867, ORDER);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackType get(quickfix.field.UnderlyingMarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackType getUnderlyingMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackType() {
    return isSetField(41867);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackValue get(quickfix.field.UnderlyingMarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackValue getUnderlyingMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackValue() {
    return isSetField(41339);
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackReferencePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackReferencePriceGrp get(quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackReferencePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackReferencePriceGrp getUnderlyingMarketDisruptionFallbackReferencePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingMarketDisruptionFallbackReferencePriceGrp());
  }

  public void set(quickfix.field.NoUnderlyingMarketDisruptionFallbackReferencePrices value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingMarketDisruptionFallbackReferencePrices get(quickfix.field.NoUnderlyingMarketDisruptionFallbackReferencePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingMarketDisruptionFallbackReferencePrices getNoUnderlyingMarketDisruptionFallbackReferencePrices() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingMarketDisruptionFallbackReferencePrices());
  }

  public boolean isSet(quickfix.field.NoUnderlyingMarketDisruptionFallbackReferencePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingMarketDisruptionFallbackReferencePrices() {
    return isSetField(41868);
  }

public static class NoUnderlyingMarketDisruptionFallbackReferencePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41869, 41870, 41871, 41872, 41873, 41874, 41875, 41876, 41877, 0};

  public NoUnderlyingMarketDisruptionFallbackReferencePrices() {
    super(41868, 41869, ORDER);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierType value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierType get(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierType getUnderlyingMarketDisruptionFallbackUnderlierType() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierType());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierType field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackUnderlierType() {
    return isSetField(41869);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityID get(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityID getUnderlyingMarketDisruptionFallbackUnderlierSecurityID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityID());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackUnderlierSecurityID() {
    return isSetField(41870);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource get(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource getUnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackUnderlierSecurityIDSource() {
    return isSetField(41871);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityDesc get(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityDesc getUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityDesc());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackUnderlierSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc() {
    return isSetField(41872);
  }

  public void set(quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen get(quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen getEncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDescLen() {
    return isSetField(41873);
  }

  public void set(quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc get(quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc getEncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc());
  }

  public boolean isSet(quickfix.field.EncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedUnderlyingMarketDisruptionFallbackUnderlierSecurityDesc() {
    return isSetField(41874);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackOpenUnits value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackOpenUnits get(quickfix.field.UnderlyingMarketDisruptionFallbackOpenUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackOpenUnits getUnderlyingMarketDisruptionFallbackOpenUnits() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackOpenUnits());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackOpenUnits field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackOpenUnits() {
    return isSetField(41875);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackBasketCurrency value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackBasketCurrency get(quickfix.field.UnderlyingMarketDisruptionFallbackBasketCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackBasketCurrency getUnderlyingMarketDisruptionFallbackBasketCurrency() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackBasketCurrency());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackBasketCurrency field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackBasketCurrency() {
    return isSetField(41876);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionFallbackBasketDivisor value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackBasketDivisor get(quickfix.field.UnderlyingMarketDisruptionFallbackBasketDivisor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionFallbackBasketDivisor getUnderlyingMarketDisruptionFallbackBasketDivisor() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionFallbackBasketDivisor());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionFallbackBasketDivisor field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionFallbackBasketDivisor() {
    return isSetField(41877);
  }
}

  public void set(quickfix.field.UnderlyingMarketDisruptionMaximumDays value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionMaximumDays get(quickfix.field.UnderlyingMarketDisruptionMaximumDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionMaximumDays getUnderlyingMarketDisruptionMaximumDays() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionMaximumDays());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionMaximumDays field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionMaximumDays() {
    return isSetField(41861);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionMaterialityPercentage value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionMaterialityPercentage get(quickfix.field.UnderlyingMarketDisruptionMaterialityPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionMaterialityPercentage getUnderlyingMarketDisruptionMaterialityPercentage() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionMaterialityPercentage());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionMaterialityPercentage field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionMaterialityPercentage() {
    return isSetField(41862);
  }

  public void set(quickfix.field.UnderlyingMarketDisruptionMinimumFuturesContracts value) {
    setField(value);
  }

  public quickfix.field.UnderlyingMarketDisruptionMinimumFuturesContracts get(quickfix.field.UnderlyingMarketDisruptionMinimumFuturesContracts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingMarketDisruptionMinimumFuturesContracts getUnderlyingMarketDisruptionMinimumFuturesContracts() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingMarketDisruptionMinimumFuturesContracts());
  }

  public boolean isSet(quickfix.field.UnderlyingMarketDisruptionMinimumFuturesContracts field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingMarketDisruptionMinimumFuturesContracts() {
    return isSetField(41863);
  }
}

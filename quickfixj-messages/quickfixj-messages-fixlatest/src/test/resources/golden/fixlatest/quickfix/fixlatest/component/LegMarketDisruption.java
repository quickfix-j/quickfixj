/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegMarketDisruption extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {41462, 41463, 41464, 41465, 41466, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegMarketDisruption() {
    super();
  }

  public void set(quickfix.field.LegMarketDisruptionProvision value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionProvision get(quickfix.field.LegMarketDisruptionProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionProvision getLegMarketDisruptionProvision() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionProvision());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionProvision field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionProvision() {
    return isSetField(41462);
  }

  public void set(quickfix.fixlatest.component.LegMarketDisruptionEventGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegMarketDisruptionEventGrp get(quickfix.fixlatest.component.LegMarketDisruptionEventGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegMarketDisruptionEventGrp getLegMarketDisruptionEventGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegMarketDisruptionEventGrp());
  }

  public void set(quickfix.field.NoLegMarketDisruptionEvents value) {
    setField(value);
  }

  public quickfix.field.NoLegMarketDisruptionEvents get(quickfix.field.NoLegMarketDisruptionEvents value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegMarketDisruptionEvents getNoLegMarketDisruptionEvents() throws FieldNotFound {
    return get(new quickfix.field.NoLegMarketDisruptionEvents());
  }

  public boolean isSet(quickfix.field.NoLegMarketDisruptionEvents field) {
    return isSetField(field);
  }

  public boolean isSetNoLegMarketDisruptionEvents() {
    return isSetField(41467);
  }

public static class NoLegMarketDisruptionEvents extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41468, 40223, 0};

  public NoLegMarketDisruptionEvents() {
    super(41467, 41468, ORDER);
  }

  public void set(quickfix.field.LegMarketDisruptionEvent value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionEvent get(quickfix.field.LegMarketDisruptionEvent value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionEvent getLegMarketDisruptionEvent() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionEvent());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionEvent field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionEvent() {
    return isSetField(41468);
  }

  public void set(quickfix.field.LegMarketDisruptionValue value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionValue get(quickfix.field.LegMarketDisruptionValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionValue getLegMarketDisruptionValue() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionValue());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionValue field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionValue() {
    return isSetField(40223);
  }
}

  public void set(quickfix.field.LegMarketDisruptionFallbackProvision value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackProvision get(quickfix.field.LegMarketDisruptionFallbackProvision value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackProvision getLegMarketDisruptionFallbackProvision() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackProvision());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackProvision field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackProvision() {
    return isSetField(41463);
  }

  public void set(quickfix.fixlatest.component.LegMarketDisruptionFallbackGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegMarketDisruptionFallbackGrp get(quickfix.fixlatest.component.LegMarketDisruptionFallbackGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegMarketDisruptionFallbackGrp getLegMarketDisruptionFallbackGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegMarketDisruptionFallbackGrp());
  }

  public void set(quickfix.field.NoLegMarketDisruptionFallbacks value) {
    setField(value);
  }

  public quickfix.field.NoLegMarketDisruptionFallbacks get(quickfix.field.NoLegMarketDisruptionFallbacks value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegMarketDisruptionFallbacks getNoLegMarketDisruptionFallbacks() throws FieldNotFound {
    return get(new quickfix.field.NoLegMarketDisruptionFallbacks());
  }

  public boolean isSet(quickfix.field.NoLegMarketDisruptionFallbacks field) {
    return isSetField(field);
  }

  public boolean isSetNoLegMarketDisruptionFallbacks() {
    return isSetField(41469);
  }

public static class NoLegMarketDisruptionFallbacks extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41470, 40990, 0};

  public NoLegMarketDisruptionFallbacks() {
    super(41469, 41470, ORDER);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackType value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackType get(quickfix.field.LegMarketDisruptionFallbackType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackType getLegMarketDisruptionFallbackType() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackType());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackType field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackType() {
    return isSetField(41470);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackValue value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackValue get(quickfix.field.LegMarketDisruptionFallbackValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackValue getLegMarketDisruptionFallbackValue() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackValue());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackValue field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackValue() {
    return isSetField(40990);
  }
}

  public void set(quickfix.fixlatest.component.LegMarketDisruptionFallbackReferencePriceGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegMarketDisruptionFallbackReferencePriceGrp get(quickfix.fixlatest.component.LegMarketDisruptionFallbackReferencePriceGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegMarketDisruptionFallbackReferencePriceGrp getLegMarketDisruptionFallbackReferencePriceGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegMarketDisruptionFallbackReferencePriceGrp());
  }

  public void set(quickfix.field.NoLegMarketDisruptionFallbackReferencePrices value) {
    setField(value);
  }

  public quickfix.field.NoLegMarketDisruptionFallbackReferencePrices get(quickfix.field.NoLegMarketDisruptionFallbackReferencePrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegMarketDisruptionFallbackReferencePrices getNoLegMarketDisruptionFallbackReferencePrices() throws FieldNotFound {
    return get(new quickfix.field.NoLegMarketDisruptionFallbackReferencePrices());
  }

  public boolean isSet(quickfix.field.NoLegMarketDisruptionFallbackReferencePrices field) {
    return isSetField(field);
  }

  public boolean isSetNoLegMarketDisruptionFallbackReferencePrices() {
    return isSetField(41471);
  }

public static class NoLegMarketDisruptionFallbackReferencePrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41472, 41473, 41474, 41475, 41476, 41477, 41478, 41479, 41480, 0};

  public NoLegMarketDisruptionFallbackReferencePrices() {
    super(41471, 41472, ORDER);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackUnderlierType value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierType get(quickfix.field.LegMarketDisruptionFallbackUnderlierType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierType getLegMarketDisruptionFallbackUnderlierType() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackUnderlierType());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackUnderlierType field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackUnderlierType() {
    return isSetField(41472);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityID value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityID get(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityID getLegMarketDisruptionFallbackUnderlierSecurityID() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityID());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityID field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackUnderlierSecurityID() {
    return isSetField(41473);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityIDSource value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityIDSource get(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityIDSource getLegMarketDisruptionFallbackUnderlierSecurityIDSource() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityIDSource());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityIDSource field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackUnderlierSecurityIDSource() {
    return isSetField(41474);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityDesc get(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityDesc getLegMarketDisruptionFallbackUnderlierSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityDesc());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackUnderlierSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackUnderlierSecurityDesc() {
    return isSetField(41475);
  }

  public void set(quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen get(quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen getEncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen());
  }

  public boolean isSet(quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegMarketDisruptionFallbackUnderlierSecurityDescLen() {
    return isSetField(41476);
  }

  public void set(quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDesc get(quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDesc getEncodedLegMarketDisruptionFallbackUnderlierSecurityDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDesc());
  }

  public boolean isSet(quickfix.field.EncodedLegMarketDisruptionFallbackUnderlierSecurityDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegMarketDisruptionFallbackUnderlierSecurityDesc() {
    return isSetField(41477);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackOpenUnits value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackOpenUnits get(quickfix.field.LegMarketDisruptionFallbackOpenUnits value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackOpenUnits getLegMarketDisruptionFallbackOpenUnits() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackOpenUnits());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackOpenUnits field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackOpenUnits() {
    return isSetField(41478);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackBasketCurrency value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackBasketCurrency get(quickfix.field.LegMarketDisruptionFallbackBasketCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackBasketCurrency getLegMarketDisruptionFallbackBasketCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackBasketCurrency());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackBasketCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackBasketCurrency() {
    return isSetField(41479);
  }

  public void set(quickfix.field.LegMarketDisruptionFallbackBasketDivisor value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionFallbackBasketDivisor get(quickfix.field.LegMarketDisruptionFallbackBasketDivisor value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionFallbackBasketDivisor getLegMarketDisruptionFallbackBasketDivisor() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionFallbackBasketDivisor());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionFallbackBasketDivisor field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionFallbackBasketDivisor() {
    return isSetField(41480);
  }
}

  public void set(quickfix.field.LegMarketDisruptionMaximumDays value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionMaximumDays get(quickfix.field.LegMarketDisruptionMaximumDays value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionMaximumDays getLegMarketDisruptionMaximumDays() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionMaximumDays());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionMaximumDays field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionMaximumDays() {
    return isSetField(41464);
  }

  public void set(quickfix.field.LegMarketDisruptionMaterialityPercentage value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionMaterialityPercentage get(quickfix.field.LegMarketDisruptionMaterialityPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionMaterialityPercentage getLegMarketDisruptionMaterialityPercentage() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionMaterialityPercentage());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionMaterialityPercentage field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionMaterialityPercentage() {
    return isSetField(41465);
  }

  public void set(quickfix.field.LegMarketDisruptionMinimumFuturesContracts value) {
    setField(value);
  }

  public quickfix.field.LegMarketDisruptionMinimumFuturesContracts get(quickfix.field.LegMarketDisruptionMinimumFuturesContracts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarketDisruptionMinimumFuturesContracts getLegMarketDisruptionMinimumFuturesContracts() throws FieldNotFound {
    return get(new quickfix.field.LegMarketDisruptionMinimumFuturesContracts());
  }

  public boolean isSet(quickfix.field.LegMarketDisruptionMinimumFuturesContracts field) {
    return isSetField(field);
  }

  public boolean isSetLegMarketDisruptionMinimumFuturesContracts() {
    return isSetField(41466);
  }
}

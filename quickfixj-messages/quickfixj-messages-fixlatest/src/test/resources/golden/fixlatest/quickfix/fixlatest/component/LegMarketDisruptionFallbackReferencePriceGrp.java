/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegMarketDisruptionFallbackReferencePriceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41471, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegMarketDisruptionFallbackReferencePriceGrp() {
    super();
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

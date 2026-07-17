/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingMarketDisruptionFallbackReferencePriceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41868, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingMarketDisruptionFallbackReferencePriceGrp() {
    super();
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

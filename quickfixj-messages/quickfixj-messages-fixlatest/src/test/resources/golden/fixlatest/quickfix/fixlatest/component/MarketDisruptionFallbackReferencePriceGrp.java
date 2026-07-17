/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarketDisruptionFallbackReferencePriceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41096, };
  protected int[] getGroupFields() { return componentGroups; }

  public MarketDisruptionFallbackReferencePriceGrp() {
    super();
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

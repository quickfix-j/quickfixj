/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PostTradePayment extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {2824, 2817, 2818, 2825, 2826, 2827, 2819, 2816, 2821, 2820, 2815, 2814, 2822, 2823, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public PostTradePayment() {
    super();
  }

  public void set(quickfix.field.PostTradePaymentType value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentType get(quickfix.field.PostTradePaymentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentType getPostTradePaymentType() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentType());
  }

  public boolean isSet(quickfix.field.PostTradePaymentType field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentType() {
    return isSetField(2824);
  }

  public void set(quickfix.field.PostTradePaymentAmount value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentAmount get(quickfix.field.PostTradePaymentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentAmount getPostTradePaymentAmount() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentAmount());
  }

  public boolean isSet(quickfix.field.PostTradePaymentAmount field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentAmount() {
    return isSetField(2817);
  }

  public void set(quickfix.field.PostTradePaymentCurrency value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentCurrency get(quickfix.field.PostTradePaymentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentCurrency getPostTradePaymentCurrency() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentCurrency());
  }

  public boolean isSet(quickfix.field.PostTradePaymentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentCurrency() {
    return isSetField(2818);
  }

  public void set(quickfix.field.PostTradePaymentCalculationDate value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentCalculationDate get(quickfix.field.PostTradePaymentCalculationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentCalculationDate getPostTradePaymentCalculationDate() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentCalculationDate());
  }

  public boolean isSet(quickfix.field.PostTradePaymentCalculationDate field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentCalculationDate() {
    return isSetField(2825);
  }

  public void set(quickfix.field.PostTradePaymentValueDate value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentValueDate get(quickfix.field.PostTradePaymentValueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentValueDate getPostTradePaymentValueDate() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentValueDate());
  }

  public boolean isSet(quickfix.field.PostTradePaymentValueDate field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentValueDate() {
    return isSetField(2826);
  }

  public void set(quickfix.field.PostTradePaymentFinalValueDate value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentFinalValueDate get(quickfix.field.PostTradePaymentFinalValueDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentFinalValueDate getPostTradePaymentFinalValueDate() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentFinalValueDate());
  }

  public boolean isSet(quickfix.field.PostTradePaymentFinalValueDate field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentFinalValueDate() {
    return isSetField(2827);
  }

  public void set(quickfix.field.PostTradePaymentDebitOrCredit value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentDebitOrCredit get(quickfix.field.PostTradePaymentDebitOrCredit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentDebitOrCredit getPostTradePaymentDebitOrCredit() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentDebitOrCredit());
  }

  public boolean isSet(quickfix.field.PostTradePaymentDebitOrCredit field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentDebitOrCredit() {
    return isSetField(2819);
  }

  public void set(quickfix.field.PostTradePaymentAccount value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentAccount get(quickfix.field.PostTradePaymentAccount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentAccount getPostTradePaymentAccount() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentAccount());
  }

  public boolean isSet(quickfix.field.PostTradePaymentAccount field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentAccount() {
    return isSetField(2816);
  }

  public void set(quickfix.field.PostTradePaymentID value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentID get(quickfix.field.PostTradePaymentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentID getPostTradePaymentID() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentID());
  }

  public boolean isSet(quickfix.field.PostTradePaymentID field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentID() {
    return isSetField(2821);
  }

  public void set(quickfix.field.PostTradePaymentDesc value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentDesc get(quickfix.field.PostTradePaymentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentDesc getPostTradePaymentDesc() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentDesc());
  }

  public boolean isSet(quickfix.field.PostTradePaymentDesc field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentDesc() {
    return isSetField(2820);
  }

  public void set(quickfix.field.EncodedPostTradePaymentDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedPostTradePaymentDescLen get(quickfix.field.EncodedPostTradePaymentDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPostTradePaymentDescLen getEncodedPostTradePaymentDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedPostTradePaymentDescLen());
  }

  public boolean isSet(quickfix.field.EncodedPostTradePaymentDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPostTradePaymentDescLen() {
    return isSetField(2815);
  }

  public void set(quickfix.field.EncodedPostTradePaymentDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedPostTradePaymentDesc get(quickfix.field.EncodedPostTradePaymentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedPostTradePaymentDesc getEncodedPostTradePaymentDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedPostTradePaymentDesc());
  }

  public boolean isSet(quickfix.field.EncodedPostTradePaymentDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedPostTradePaymentDesc() {
    return isSetField(2814);
  }

  public void set(quickfix.field.PostTradePaymentLinkID value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentLinkID get(quickfix.field.PostTradePaymentLinkID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentLinkID getPostTradePaymentLinkID() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentLinkID());
  }

  public boolean isSet(quickfix.field.PostTradePaymentLinkID field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentLinkID() {
    return isSetField(2822);
  }

  public void set(quickfix.field.PostTradePaymentStatus value) {
    setField(value);
  }

  public quickfix.field.PostTradePaymentStatus get(quickfix.field.PostTradePaymentStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PostTradePaymentStatus getPostTradePaymentStatus() throws FieldNotFound {
    return get(new quickfix.field.PostTradePaymentStatus());
  }

  public boolean isSet(quickfix.field.PostTradePaymentStatus field) {
    return isSetField(field);
  }

  public boolean isSetPostTradePaymentStatus() {
    return isSetField(2823);
  }
}

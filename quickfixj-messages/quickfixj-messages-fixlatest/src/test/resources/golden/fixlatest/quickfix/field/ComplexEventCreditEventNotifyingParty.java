/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventCreditEventNotifyingParty extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2134;

  public static final int SELLER_NOTIFIES = 0;

  public static final int BUYER_NOTIFIES = 1;

  public static final int SELLER_OR_BUYER_NOTIFIES = 2;

  public ComplexEventCreditEventNotifyingParty() {
    super(2134);
  }

  public ComplexEventCreditEventNotifyingParty(Integer data) {
    super(2134, data);
  }

  public ComplexEventCreditEventNotifyingParty(int data) {
    super(2134, data);
  }
}

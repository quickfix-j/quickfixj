/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegComplexEventCreditEventNotifyingParty extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2243;

  public static final int SELLER_NOTIFIES = 0;

  public static final int BUYER_NOTIFIES = 1;

  public static final int SELLER_OR_BUYER_NOTIFIES = 2;

  public LegComplexEventCreditEventNotifyingParty() {
    super(2243);
  }

  public LegComplexEventCreditEventNotifyingParty(Integer data) {
    super(2243, data);
  }

  public LegComplexEventCreditEventNotifyingParty(int data) {
    super(2243, data);
  }
}

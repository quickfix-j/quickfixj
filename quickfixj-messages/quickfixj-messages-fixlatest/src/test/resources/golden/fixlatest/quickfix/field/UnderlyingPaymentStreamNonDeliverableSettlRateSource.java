/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPaymentStreamNonDeliverableSettlRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40661;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public UnderlyingPaymentStreamNonDeliverableSettlRateSource() {
    super(40661);
  }

  public UnderlyingPaymentStreamNonDeliverableSettlRateSource(Integer data) {
    super(40661, data);
  }

  public UnderlyingPaymentStreamNonDeliverableSettlRateSource(int data) {
    super(40661, data);
  }
}

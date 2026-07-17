/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamNonDeliverableSettlRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40087;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public LegPaymentStreamNonDeliverableSettlRateSource() {
    super(40087);
  }

  public LegPaymentStreamNonDeliverableSettlRateSource(Integer data) {
    super(40087, data);
  }

  public LegPaymentStreamNonDeliverableSettlRateSource(int data) {
    super(40087, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPaymentScheduleRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40705;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public UnderlyingPaymentScheduleRateSource() {
    super(40705);
  }

  public UnderlyingPaymentScheduleRateSource(Integer data) {
    super(40705, data);
  }

  public UnderlyingPaymentScheduleRateSource(int data) {
    super(40705, data);
  }
}

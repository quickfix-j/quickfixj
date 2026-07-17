/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentScheduleRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40869;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public PaymentScheduleRateSource() {
    super(40869);
  }

  public PaymentScheduleRateSource(Integer data) {
    super(40869, data);
  }

  public PaymentScheduleRateSource(int data) {
    super(40869, data);
  }
}

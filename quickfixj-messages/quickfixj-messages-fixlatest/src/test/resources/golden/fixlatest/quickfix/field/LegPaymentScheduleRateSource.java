/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentScheduleRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40415;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public LegPaymentScheduleRateSource() {
    super(40415);
  }

  public LegPaymentScheduleRateSource(Integer data) {
    super(40415, data);
  }

  public LegPaymentScheduleRateSource(int data) {
    super(40415, data);
  }
}

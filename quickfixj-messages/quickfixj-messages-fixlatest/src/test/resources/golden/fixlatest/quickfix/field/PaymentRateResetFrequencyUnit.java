/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class PaymentRateResetFrequencyUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43105;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public PaymentRateResetFrequencyUnit() {
    super(43105);
  }

  public PaymentRateResetFrequencyUnit(String data) {
    super(43105, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class PaymentFrequencyUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43103;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public PaymentFrequencyUnit() {
    super(43103);
  }

  public PaymentFrequencyUnit(String data) {
    super(43103, data);
  }
}

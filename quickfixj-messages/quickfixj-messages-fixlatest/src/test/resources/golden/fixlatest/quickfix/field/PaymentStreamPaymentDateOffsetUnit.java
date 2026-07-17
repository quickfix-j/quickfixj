/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class PaymentStreamPaymentDateOffsetUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40760;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public PaymentStreamPaymentDateOffsetUnit() {
    super(40760);
  }

  public PaymentStreamPaymentDateOffsetUnit(String data) {
    super(40760, data);
  }
}

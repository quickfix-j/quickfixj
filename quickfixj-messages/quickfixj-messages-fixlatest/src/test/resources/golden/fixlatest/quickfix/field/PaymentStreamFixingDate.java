/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class PaymentStreamFixingDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42661;

  public PaymentStreamFixingDate() {
    super(42661);
  }

  public PaymentStreamFixingDate(String data) {
    super(42661, data);
  }
}

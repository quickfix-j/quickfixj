/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class PaymentDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 504;

  public PaymentDate() {
    super(504);
  }

  public PaymentDate(String data) {
    super(504, data);
  }
}

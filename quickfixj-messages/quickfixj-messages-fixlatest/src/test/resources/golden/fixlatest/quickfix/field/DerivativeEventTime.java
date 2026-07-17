/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class DerivativeEventTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1289;

  public DerivativeEventTime() {
    super(1289);
  }

  public DerivativeEventTime(LocalDateTime data) {
    super(1289, data);
  }
}

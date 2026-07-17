/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class StrikeTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 443;

  public StrikeTime() {
    super(443);
  }

  public StrikeTime(LocalDateTime data) {
    super(443, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class ValidUntilTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 62;

  public ValidUntilTime() {
    super(62);
  }

  public ValidUntilTime(LocalDateTime data) {
    super(62, data);
  }
}

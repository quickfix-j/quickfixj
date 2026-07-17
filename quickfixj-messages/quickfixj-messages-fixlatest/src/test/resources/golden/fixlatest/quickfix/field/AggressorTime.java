/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class AggressorTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2445;

  public AggressorTime() {
    super(2445);
  }

  public AggressorTime(LocalDateTime data) {
    super(2445, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class EventTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1145;

  public EventTime() {
    super(1145);
  }

  public EventTime(LocalDateTime data) {
    super(1145, data);
  }
}

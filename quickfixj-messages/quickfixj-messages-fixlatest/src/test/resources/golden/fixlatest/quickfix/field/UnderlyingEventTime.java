/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class UnderlyingEventTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1984;

  public UnderlyingEventTime() {
    super(1984);
  }

  public UnderlyingEventTime(LocalDateTime data) {
    super(1984, data);
  }
}

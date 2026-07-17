/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class LegEventTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2062;

  public LegEventTime() {
    super(2062);
  }

  public LegEventTime(LocalDateTime data) {
    super(2062, data);
  }
}

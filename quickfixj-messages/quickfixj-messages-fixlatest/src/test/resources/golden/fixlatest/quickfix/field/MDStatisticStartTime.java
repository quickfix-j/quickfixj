/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class MDStatisticStartTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2470;

  public MDStatisticStartTime() {
    super(2470);
  }

  public MDStatisticStartTime(LocalTime data) {
    super(2470, data);
  }
}

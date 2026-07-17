/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class MDStatisticTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2476;

  public MDStatisticTime() {
    super(2476);
  }

  public MDStatisticTime(LocalDateTime data) {
    super(2476, data);
  }
}

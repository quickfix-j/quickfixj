/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class MDStatisticEndDate extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2469;

  public MDStatisticEndDate() {
    super(2469);
  }

  public MDStatisticEndDate(LocalDateTime data) {
    super(2469, data);
  }
}

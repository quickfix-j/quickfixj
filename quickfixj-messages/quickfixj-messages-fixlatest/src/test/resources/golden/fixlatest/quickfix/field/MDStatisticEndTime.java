/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class MDStatisticEndTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2471;

  public MDStatisticEndTime() {
    super(2471);
  }

  public MDStatisticEndTime(LocalTime data) {
    super(2471, data);
  }
}

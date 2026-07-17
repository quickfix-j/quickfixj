/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class LegComplexEventStartTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2204;

  public LegComplexEventStartTime() {
    super(2204);
  }

  public LegComplexEventStartTime(LocalTime data) {
    super(2204, data);
  }
}

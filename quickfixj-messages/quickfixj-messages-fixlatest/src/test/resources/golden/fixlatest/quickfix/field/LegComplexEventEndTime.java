/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class LegComplexEventEndTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2247;

  public LegComplexEventEndTime() {
    super(2247);
  }

  public LegComplexEventEndTime(LocalTime data) {
    super(2247, data);
  }
}

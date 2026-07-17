/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class UnderlyingComplexEventStartTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2057;

  public UnderlyingComplexEventStartTime() {
    super(2057);
  }

  public UnderlyingComplexEventStartTime(LocalTime data) {
    super(2057, data);
  }
}

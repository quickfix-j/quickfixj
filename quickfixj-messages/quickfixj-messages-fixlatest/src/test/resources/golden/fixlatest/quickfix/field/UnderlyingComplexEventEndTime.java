/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class UnderlyingComplexEventEndTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2058;

  public UnderlyingComplexEventEndTime() {
    super(2058);
  }

  public UnderlyingComplexEventEndTime(LocalTime data) {
    super(2058, data);
  }
}

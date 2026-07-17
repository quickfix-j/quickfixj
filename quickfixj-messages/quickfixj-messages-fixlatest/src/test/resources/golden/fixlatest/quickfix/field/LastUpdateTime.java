/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class LastUpdateTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 779;

  public LastUpdateTime() {
    super(779);
  }

  public LastUpdateTime(LocalDateTime data) {
    super(779, data);
  }
}

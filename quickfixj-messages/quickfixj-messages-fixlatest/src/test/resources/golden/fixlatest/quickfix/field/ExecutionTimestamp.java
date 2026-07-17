/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class ExecutionTimestamp extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2749;

  public ExecutionTimestamp() {
    super(2749);
  }

  public ExecutionTimestamp(LocalDateTime data) {
    super(2749, data);
  }
}

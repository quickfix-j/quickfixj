/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TransBkdTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 483;

  public TransBkdTime() {
    super(483);
  }

  public TransBkdTime(LocalDateTime data) {
    super(483, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class ExpireTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 126;

  public ExpireTime() {
    super(126);
  }

  public ExpireTime(LocalDateTime data) {
    super(126, data);
  }
}

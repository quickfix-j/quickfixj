/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class ResponseTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1914;

  public ResponseTime() {
    super(1914);
  }

  public ResponseTime(LocalDateTime data) {
    super(1914, data);
  }
}

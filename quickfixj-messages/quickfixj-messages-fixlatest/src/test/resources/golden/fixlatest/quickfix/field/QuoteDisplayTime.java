/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class QuoteDisplayTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1915;

  public QuoteDisplayTime() {
    super(1915);
  }

  public QuoteDisplayTime(LocalDateTime data) {
    super(1915, data);
  }
}

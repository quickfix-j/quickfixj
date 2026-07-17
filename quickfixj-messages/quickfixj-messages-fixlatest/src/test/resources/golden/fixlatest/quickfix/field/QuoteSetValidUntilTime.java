/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class QuoteSetValidUntilTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 367;

  public QuoteSetValidUntilTime() {
    super(367);
  }

  public QuoteSetValidUntilTime(LocalDateTime data) {
    super(367, data);
  }
}

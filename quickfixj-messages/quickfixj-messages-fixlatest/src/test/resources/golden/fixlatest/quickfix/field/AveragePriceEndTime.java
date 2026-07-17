/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class AveragePriceEndTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2765;

  public AveragePriceEndTime() {
    super(2765);
  }

  public AveragePriceEndTime(LocalDateTime data) {
    super(2765, data);
  }
}

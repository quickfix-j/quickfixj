/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class AveragePriceStartTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2764;

  public AveragePriceStartTime() {
    super(2764);
  }

  public AveragePriceStartTime(LocalDateTime data) {
    super(2764, data);
  }
}

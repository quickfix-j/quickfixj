/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TradeMatchTimestamp extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1888;

  public TradeMatchTimestamp() {
    super(1888);
  }

  public TradeMatchTimestamp(LocalDateTime data) {
    super(1888, data);
  }
}

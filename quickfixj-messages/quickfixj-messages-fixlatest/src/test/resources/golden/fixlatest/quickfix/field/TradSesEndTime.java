/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TradSesEndTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 345;

  public TradSesEndTime() {
    super(345);
  }

  public TradSesEndTime(LocalDateTime data) {
    super(345, data);
  }
}

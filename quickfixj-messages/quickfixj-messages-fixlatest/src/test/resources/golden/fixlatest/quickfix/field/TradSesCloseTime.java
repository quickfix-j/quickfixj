/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TradSesCloseTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 344;

  public TradSesCloseTime() {
    super(344);
  }

  public TradSesCloseTime(LocalDateTime data) {
    super(344, data);
  }
}

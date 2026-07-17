/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TradSesStartTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 341;

  public TradSesStartTime() {
    super(341);
  }

  public TradSesStartTime(LocalDateTime data) {
    super(341, data);
  }
}

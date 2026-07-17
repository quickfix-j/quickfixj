/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TradSesPreCloseTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 343;

  public TradSesPreCloseTime() {
    super(343);
  }

  public TradSesPreCloseTime(LocalDateTime data) {
    super(343, data);
  }
}

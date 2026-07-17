/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TradSesOpenTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 342;

  public TradSesOpenTime() {
    super(342);
  }

  public TradSesOpenTime(LocalDateTime data) {
    super(342, data);
  }
}

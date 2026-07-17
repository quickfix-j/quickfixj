/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class ContraTradeTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 438;

  public ContraTradeTime() {
    super(438);
  }

  public ContraTradeTime(LocalDateTime data) {
    super(438, data);
  }
}

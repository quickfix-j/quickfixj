/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class RelSymTransactTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1504;

  public RelSymTransactTime() {
    super(1504);
  }

  public RelSymTransactTime(LocalDateTime data) {
    super(1504, data);
  }
}

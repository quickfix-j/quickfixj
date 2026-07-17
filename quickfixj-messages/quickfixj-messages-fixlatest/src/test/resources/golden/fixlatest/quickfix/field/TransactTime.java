/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TransactTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 60;

  public TransactTime() {
    super(60);
  }

  public TransactTime(LocalDateTime data) {
    super(60, data);
  }
}

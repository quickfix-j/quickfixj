/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class TrdRegTimestamp extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 769;

  public TrdRegTimestamp() {
    super(769);
  }

  public TrdRegTimestamp(LocalDateTime data) {
    super(769, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class SideTrdRegTimestamp extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1012;

  public SideTrdRegTimestamp() {
    super(1012);
  }

  public SideTrdRegTimestamp(LocalDateTime data) {
    super(1012, data);
  }
}

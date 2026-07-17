/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class ComplexEventStartTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1495;

  public ComplexEventStartTime() {
    super(1495);
  }

  public ComplexEventStartTime(LocalTime data) {
    super(1495, data);
  }
}

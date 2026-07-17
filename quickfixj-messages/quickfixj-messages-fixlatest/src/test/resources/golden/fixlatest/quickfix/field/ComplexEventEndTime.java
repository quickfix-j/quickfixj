/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class ComplexEventEndTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1496;

  public ComplexEventEndTime() {
    super(1496);
  }

  public ComplexEventEndTime(LocalTime data) {
    super(1496, data);
  }
}

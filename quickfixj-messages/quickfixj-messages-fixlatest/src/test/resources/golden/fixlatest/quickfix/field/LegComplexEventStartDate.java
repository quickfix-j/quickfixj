/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class LegComplexEventStartDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2251;

  public LegComplexEventStartDate() {
    super(2251);
  }

  public LegComplexEventStartDate(LocalDate data) {
    super(2251, data);
  }
}

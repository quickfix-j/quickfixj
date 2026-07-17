/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class LegComplexEventEndDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2252;

  public LegComplexEventEndDate() {
    super(2252);
  }

  public LegComplexEventEndDate(LocalDate data) {
    super(2252, data);
  }
}

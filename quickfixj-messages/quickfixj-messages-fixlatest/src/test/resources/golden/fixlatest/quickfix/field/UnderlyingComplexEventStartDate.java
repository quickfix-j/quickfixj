/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class UnderlyingComplexEventStartDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2054;

  public UnderlyingComplexEventStartDate() {
    super(2054);
  }

  public UnderlyingComplexEventStartDate(LocalDate data) {
    super(2054, data);
  }
}

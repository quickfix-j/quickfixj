/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class ComplexEventStartDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1492;

  public ComplexEventStartDate() {
    super(1492);
  }

  public ComplexEventStartDate(LocalDate data) {
    super(1492, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class UnderlyingComplexEventEndDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2055;

  public UnderlyingComplexEventEndDate() {
    super(2055);
  }

  public UnderlyingComplexEventEndDate(LocalDate data) {
    super(2055, data);
  }
}

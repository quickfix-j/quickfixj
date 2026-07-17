/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class ComplexEventEndDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1493;

  public ComplexEventEndDate() {
    super(1493);
  }

  public ComplexEventEndDate(LocalDate data) {
    super(1493, data);
  }
}

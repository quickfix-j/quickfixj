/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class ReferenceDataDate extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2747;

  public ReferenceDataDate() {
    super(2747);
  }

  public ReferenceDataDate(LocalDateTime data) {
    super(2747, data);
  }
}

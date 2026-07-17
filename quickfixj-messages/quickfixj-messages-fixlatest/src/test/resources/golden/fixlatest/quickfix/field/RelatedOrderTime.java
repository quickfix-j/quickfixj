/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class RelatedOrderTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2836;

  public RelatedOrderTime() {
    super(2836);
  }

  public RelatedOrderTime(LocalDateTime data) {
    super(2836, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class NonDeliverableFixingDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40826;

  public NonDeliverableFixingDate() {
    super(40826);
  }

  public NonDeliverableFixingDate(String data) {
    super(40826, data);
  }
}

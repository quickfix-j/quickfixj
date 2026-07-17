/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class LegStartDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2513;

  public LegStartDate() {
    super(2513);
  }

  public LegStartDate(String data) {
    super(2513, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class LegMaturityDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 611;

  public LegMaturityDate() {
    super(611);
  }

  public LegMaturityDate(String data) {
    super(611, data);
  }
}

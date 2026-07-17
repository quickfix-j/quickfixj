/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class DateOfBirth extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 486;

  public DateOfBirth() {
    super(486);
  }

  public DateOfBirth(String data) {
    super(486, data);
  }
}

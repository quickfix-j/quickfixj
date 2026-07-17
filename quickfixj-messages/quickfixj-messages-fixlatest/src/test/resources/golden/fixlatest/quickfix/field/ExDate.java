/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class ExDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 230;

  public ExDate() {
    super(230);
  }

  public ExDate(String data) {
    super(230, data);
  }
}

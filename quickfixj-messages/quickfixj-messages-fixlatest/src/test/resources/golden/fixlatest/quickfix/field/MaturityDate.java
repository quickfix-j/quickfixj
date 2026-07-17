/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class MaturityDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 541;

  public MaturityDate() {
    super(541);
  }

  public MaturityDate(String data) {
    super(541, data);
  }
}

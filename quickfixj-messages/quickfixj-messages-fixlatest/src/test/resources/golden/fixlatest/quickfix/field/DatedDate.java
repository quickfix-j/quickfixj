/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class DatedDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 873;

  public DatedDate() {
    super(873);
  }

  public DatedDate(String data) {
    super(873, data);
  }
}

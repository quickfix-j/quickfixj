/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class UnderlyingDatedDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2041;

  public UnderlyingDatedDate() {
    super(2041);
  }

  public UnderlyingDatedDate(String data) {
    super(2041, data);
  }
}

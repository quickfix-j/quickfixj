/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class IssueDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 225;

  public IssueDate() {
    super(225);
  }

  public IssueDate(String data) {
    super(225, data);
  }
}

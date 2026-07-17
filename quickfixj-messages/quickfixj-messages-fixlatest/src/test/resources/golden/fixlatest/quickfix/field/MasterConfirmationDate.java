/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class MasterConfirmationDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1963;

  public MasterConfirmationDate() {
    super(1963);
  }

  public MasterConfirmationDate(String data) {
    super(1963, data);
  }
}

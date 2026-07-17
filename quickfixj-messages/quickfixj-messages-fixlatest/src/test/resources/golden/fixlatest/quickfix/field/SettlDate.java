/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class SettlDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 64;

  public SettlDate() {
    super(64);
  }

  public SettlDate(String data) {
    super(64, data);
  }
}

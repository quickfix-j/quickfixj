/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class OrigTradeDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1125;

  public OrigTradeDate() {
    super(1125);
  }

  public OrigTradeDate(String data) {
    super(1125, data);
  }
}

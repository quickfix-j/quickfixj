/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class TradeDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 75;

  public TradeDate() {
    super(75);
  }

  public TradeDate(String data) {
    super(75, data);
  }
}

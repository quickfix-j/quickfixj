/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class LegEndDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2506;

  public LegEndDate() {
    super(2506);
  }

  public LegEndDate(String data) {
    super(2506, data);
  }
}

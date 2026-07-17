/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class EffectiveBusinessDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2400;

  public EffectiveBusinessDate() {
    super(2400);
  }

  public EffectiveBusinessDate(String data) {
    super(2400, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class EffectiveTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 168;

  public EffectiveTime() {
    super(168);
  }

  public EffectiveTime(LocalDateTime data) {
    super(168, data);
  }
}

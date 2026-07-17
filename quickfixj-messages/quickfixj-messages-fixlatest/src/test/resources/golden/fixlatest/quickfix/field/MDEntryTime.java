/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeOnlyField;

public class MDEntryTime extends UtcTimeOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 273;

  public MDEntryTime() {
    super(273);
  }

  public MDEntryTime(LocalTime data) {
    super(273, data);
  }
}

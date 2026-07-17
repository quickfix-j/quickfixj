/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcDateOnlyField;

public class MDEntryDate extends UtcDateOnlyField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 272;

  public MDEntryDate() {
    super(272);
  }

  public MDEntryDate(LocalDate data) {
    super(272, data);
  }
}

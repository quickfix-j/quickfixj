/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class LegEventDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2061;

  public LegEventDate() {
    super(2061);
  }

  public LegEventDate(String data) {
    super(2061, data);
  }
}

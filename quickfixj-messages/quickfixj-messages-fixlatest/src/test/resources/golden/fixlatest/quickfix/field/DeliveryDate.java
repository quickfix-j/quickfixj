/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.StringField;

public class DeliveryDate extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 743;

  public DeliveryDate() {
    super(743);
  }

  public DeliveryDate(String data) {
    super(743, data);
  }
}

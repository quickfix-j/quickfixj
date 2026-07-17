/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class SideTimeInForce extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 962;

  public SideTimeInForce() {
    super(962);
  }

  public SideTimeInForce(LocalDateTime data) {
    super(962, data);
  }
}

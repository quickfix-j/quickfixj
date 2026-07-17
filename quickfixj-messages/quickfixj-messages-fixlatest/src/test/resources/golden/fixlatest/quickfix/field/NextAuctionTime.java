/* Generated Java Source File */
package quickfix.field;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import quickfix.UtcTimeStampField;

public class NextAuctionTime extends UtcTimeStampField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2116;

  public NextAuctionTime() {
    super(2116);
  }

  public NextAuctionTime(LocalDateTime data) {
    super(2116, data);
  }
}

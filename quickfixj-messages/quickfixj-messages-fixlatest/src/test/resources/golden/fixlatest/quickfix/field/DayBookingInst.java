/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class DayBookingInst extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 589;

  public static final char AUTO = '0';

  public static final char SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING = '1';

  public static final char ACCUMULATE = '2';

  public DayBookingInst() {
    super(589);
  }

  public DayBookingInst(Character data) {
    super(589, data);
  }

  public DayBookingInst(char data) {
    super(589, data);
  }
}

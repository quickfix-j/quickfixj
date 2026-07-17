/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class GTBookingInst extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 427;

  public static final int BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION = 0;

  public static final int ACCUMULATE_UNTIL_FILLED_OR_EXPIRED = 1;

  public static final int ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE = 2;

  public GTBookingInst() {
    super(427);
  }

  public GTBookingInst(Integer data) {
    super(427, data);
  }

  public GTBookingInst(int data) {
    super(427, data);
  }
}

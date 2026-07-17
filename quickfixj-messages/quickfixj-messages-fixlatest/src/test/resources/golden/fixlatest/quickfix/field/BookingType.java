/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class BookingType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 775;

  public static final int REGULAR_BOOKING = 0;

  public static final int CFD = 1;

  public static final int TOTAL_RETURN_SWAP = 2;

  public BookingType() {
    super(775);
  }

  public BookingType(Integer data) {
    super(775, data);
  }

  public BookingType(int data) {
    super(775, data);
  }
}

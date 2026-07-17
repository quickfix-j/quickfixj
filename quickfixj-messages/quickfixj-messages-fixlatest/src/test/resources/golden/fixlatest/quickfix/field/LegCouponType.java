/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegCouponType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2161;

  public static final int ZERO = 0;

  public static final int FIXED_RATE = 1;

  public static final int FLOATING_RATE = 2;

  public static final int STRUCTURED = 3;

  public LegCouponType() {
    super(2161);
  }

  public LegCouponType(Integer data) {
    super(2161, data);
  }

  public LegCouponType(int data) {
    super(2161, data);
  }
}

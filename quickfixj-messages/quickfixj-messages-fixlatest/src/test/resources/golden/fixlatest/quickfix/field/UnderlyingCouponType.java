/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingCouponType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1989;

  public static final int ZERO = 0;

  public static final int FIXED_RATE = 1;

  public static final int FLOATING_RATE = 2;

  public static final int STRUCTURED = 3;

  public UnderlyingCouponType() {
    super(1989);
  }

  public UnderlyingCouponType(Integer data) {
    super(1989, data);
  }

  public UnderlyingCouponType(int data) {
    super(1989, data);
  }
}

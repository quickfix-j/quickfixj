/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CouponType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1946;

  public static final int ZERO = 0;

  public static final int FIXED_RATE = 1;

  public static final int FLOATING_RATE = 2;

  public static final int STRUCTURED = 3;

  public CouponType() {
    super(1946);
  }

  public CouponType(Integer data) {
    super(1946, data);
  }

  public CouponType(int data) {
    super(1946, data);
  }
}

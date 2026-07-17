/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AdditionalTermBondCouponType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40011;

  public static final int ZERO = 0;

  public static final int FIXED_RATE = 1;

  public static final int FLOATING_RATE = 2;

  public static final int STRUCTURED = 3;

  public AdditionalTermBondCouponType() {
    super(40011);
  }

  public AdditionalTermBondCouponType(Integer data) {
    super(40011, data);
  }

  public AdditionalTermBondCouponType(int data) {
    super(40011, data);
  }
}

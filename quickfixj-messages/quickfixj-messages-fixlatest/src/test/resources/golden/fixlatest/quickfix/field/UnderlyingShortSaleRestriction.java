/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingShortSaleRestriction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2043;

  public static final int NO_RESTRICTIONS = 0;

  public static final int SECURITY_NOT_SHORTABLE = 1;

  public static final int SECURITY_NOT_SHORTABLE_AT_OR_BELOW_BEST_BID = 2;

  public static final int SECURITY_NOT_SHORTABLE_WITHOUT_PRE_BORROW = 3;

  public UnderlyingShortSaleRestriction() {
    super(2043);
  }

  public UnderlyingShortSaleRestriction(Integer data) {
    super(2043, data);
  }

  public UnderlyingShortSaleRestriction(int data) {
    super(2043, data);
  }
}

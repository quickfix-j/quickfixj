/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegShortSaleRestriction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2209;

  public static final int NO_RESTRICTIONS = 0;

  public static final int SECURITY_NOT_SHORTABLE = 1;

  public static final int SECURITY_NOT_SHORTABLE_AT_OR_BELOW_BEST_BID = 2;

  public static final int SECURITY_NOT_SHORTABLE_WITHOUT_PRE_BORROW = 3;

  public LegShortSaleRestriction() {
    super(2209);
  }

  public LegShortSaleRestriction(Integer data) {
    super(2209, data);
  }

  public LegShortSaleRestriction(int data) {
    super(2209, data);
  }
}

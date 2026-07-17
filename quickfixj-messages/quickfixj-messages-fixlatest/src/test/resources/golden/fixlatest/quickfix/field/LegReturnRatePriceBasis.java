/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegReturnRatePriceBasis extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42565;

  public static final int GROSS = 0;

  public static final int NET = 1;

  public static final int ACCRUED = 2;

  public static final int CLEAN_NET = 3;

  public LegReturnRatePriceBasis() {
    super(42565);
  }

  public LegReturnRatePriceBasis(Integer data) {
    super(42565, data);
  }

  public LegReturnRatePriceBasis(int data) {
    super(42565, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ReturnRatePriceBasis extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42766;

  public static final int GROSS = 0;

  public static final int NET = 1;

  public static final int ACCRUED = 2;

  public static final int CLEAN_NET = 3;

  public ReturnRatePriceBasis() {
    super(42766);
  }

  public ReturnRatePriceBasis(Integer data) {
    super(42766, data);
  }

  public ReturnRatePriceBasis(int data) {
    super(42766, data);
  }
}

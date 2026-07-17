/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PriceQualifier extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2710;

  public static final int ACCRUED_INTEREST_IS_FACTORED = 0;

  public static final int TAX_IS_FACTORED = 1;

  public static final int BOND_AMORTIZATION_IS_FACTORED = 2;

  public PriceQualifier() {
    super(2710);
  }

  public PriceQualifier(Integer data) {
    super(2710, data);
  }

  public PriceQualifier(int data) {
    super(2710, data);
  }
}

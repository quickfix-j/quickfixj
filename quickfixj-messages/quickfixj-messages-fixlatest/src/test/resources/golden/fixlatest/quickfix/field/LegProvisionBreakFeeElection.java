/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegProvisionBreakFeeElection extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42506;

  public static final int FLAT_FEE = 0;

  public static final int AMORTIZED_FEE = 1;

  public static final int FUNDING_FEE = 2;

  public static final int FLAT_AND_FUNDING_FEE = 3;

  public static final int AMORTIZED_AND_FUNDING_FEE = 4;

  public LegProvisionBreakFeeElection() {
    super(42506);
  }

  public LegProvisionBreakFeeElection(Integer data) {
    super(42506, data);
  }

  public LegProvisionBreakFeeElection(int data) {
    super(42506, data);
  }
}

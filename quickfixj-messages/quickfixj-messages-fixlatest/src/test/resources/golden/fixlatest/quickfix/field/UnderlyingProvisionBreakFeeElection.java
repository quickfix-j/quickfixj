/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingProvisionBreakFeeElection extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43002;

  public static final int FLAT_FEE = 0;

  public static final int AMORTIZED_FEE = 1;

  public static final int FUNDING_FEE = 2;

  public static final int FLAT_AND_FUNDING_FEE = 3;

  public static final int AMORTIZED_AND_FUNDING_FEE = 4;

  public UnderlyingProvisionBreakFeeElection() {
    super(43002);
  }

  public UnderlyingProvisionBreakFeeElection(Integer data) {
    super(43002, data);
  }

  public UnderlyingProvisionBreakFeeElection(int data) {
    super(43002, data);
  }
}

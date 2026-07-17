/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionBreakFeeElection extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42707;

  public static final int FLAT_FEE = 0;

  public static final int AMORTIZED_FEE = 1;

  public static final int FUNDING_FEE = 2;

  public static final int FLAT_AND_FUNDING_FEE = 3;

  public static final int AMORTIZED_AND_FUNDING_FEE = 4;

  public ProvisionBreakFeeElection() {
    super(42707);
  }

  public ProvisionBreakFeeElection(Integer data) {
    super(42707, data);
  }

  public ProvisionBreakFeeElection(int data) {
    super(42707, data);
  }
}

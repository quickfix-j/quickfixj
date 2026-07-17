/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventCalculationAgent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2129;

  public static final int EXERCISING_PARTY = 0;

  public static final int NON_EXERCISING_PARTY = 1;

  public static final int MASTER_AGREEENT = 2;

  public static final int SUPPLEMENT = 3;

  public ComplexEventCalculationAgent() {
    super(2129);
  }

  public ComplexEventCalculationAgent(Integer data) {
    super(2129, data);
  }

  public ComplexEventCalculationAgent(int data) {
    super(2129, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionCalculationAgent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40098;

  public static final int EXERCISING_PARTY = 0;

  public static final int NON_EXERCISING_PARTY = 1;

  public static final int MASTER_AGREEENT = 2;

  public static final int SUPPLEMENT = 3;

  public ProvisionCalculationAgent() {
    super(40098);
  }

  public ProvisionCalculationAgent(Integer data) {
    super(40098, data);
  }

  public ProvisionCalculationAgent(int data) {
    super(40098, data);
  }
}

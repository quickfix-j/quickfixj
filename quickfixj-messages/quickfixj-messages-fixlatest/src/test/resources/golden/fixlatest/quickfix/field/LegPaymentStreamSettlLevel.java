/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamSettlLevel extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41568;

  public static final int AVERAGE = 0;

  public static final int MAXIMUM = 1;

  public static final int MINIMUM = 2;

  public static final int CUMULATIVE = 3;

  public LegPaymentStreamSettlLevel() {
    super(41568);
  }

  public LegPaymentStreamSettlLevel(Integer data) {
    super(41568, data);
  }

  public LegPaymentStreamSettlLevel(int data) {
    super(41568, data);
  }
}

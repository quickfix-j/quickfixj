/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPaymentStreamSettlLevel extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41916;

  public static final int AVERAGE = 0;

  public static final int MAXIMUM = 1;

  public static final int MINIMUM = 2;

  public static final int CUMULATIVE = 3;

  public UnderlyingPaymentStreamSettlLevel() {
    super(41916);
  }

  public UnderlyingPaymentStreamSettlLevel(Integer data) {
    super(41916, data);
  }

  public UnderlyingPaymentStreamSettlLevel(int data) {
    super(41916, data);
  }
}

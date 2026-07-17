/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentStreamSettlLevel extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41199;

  public static final int AVERAGE = 0;

  public static final int MAXIMUM = 1;

  public static final int MINIMUM = 2;

  public static final int CUMULATIVE = 3;

  public PaymentStreamSettlLevel() {
    super(41199);
  }

  public PaymentStreamSettlLevel(Integer data) {
    super(41199, data);
  }

  public PaymentStreamSettlLevel(int data) {
    super(41199, data);
  }
}

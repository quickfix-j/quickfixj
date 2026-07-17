/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderOrigination extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1724;

  public static final int ORDER_RECEIVED_FROM_CUSTOMER = 1;

  public static final int ORDER_RECEIVED_FROM_WITHIN_FIRM = 2;

  public static final int ORDER_RECEIVED_FROM_ANOTHER_BROKER_DEALER = 3;

  public static final int ORDER_RECEIVED_FROM_CUSTOMER_OR_WITH_FIRM = 4;

  public static final int ORDER_RECEIVED_FROM_DIRECT_ACCESS_CUSTOMER = 5;

  public static final int ORDER_RECEIVED_FROM_FOREIGN_DEALER_EQUIVALENT = 6;

  public static final int ORDER_RECEIVED_FROM_EXECUTION_ONLY_SERVICE = 7;

  public OrderOrigination() {
    super(1724);
  }

  public OrderOrigination(Integer data) {
    super(1724, data);
  }

  public OrderOrigination(int data) {
    super(1724, data);
  }
}

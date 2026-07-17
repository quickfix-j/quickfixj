/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ContraOrderOrigination extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2882;

  public static final int ORDER_RECEIVED_FROM_CUSTOMER = 1;

  public static final int ORDER_RECEIVED_FROM_WITHIN_FIRM = 2;

  public static final int ORDER_RECEIVED_FROM_ANOTHER_BROKER_DEALER = 3;

  public static final int ORDER_RECEIVED_FROM_CUSTOMER_OR_WITH_FIRM = 4;

  public static final int ORDER_RECEIVED_FROM_DIRECT_ACCESS_CUSTOMER = 5;

  public static final int ORDER_RECEIVED_FROM_FOREIGN_DEALER_EQUIVALENT = 6;

  public static final int ORDER_RECEIVED_FROM_EXECUTION_ONLY_SERVICE = 7;

  public ContraOrderOrigination() {
    super(2882);
  }

  public ContraOrderOrigination(Integer data) {
    super(2882, data);
  }

  public ContraOrderOrigination(int data) {
    super(2882, data);
  }
}

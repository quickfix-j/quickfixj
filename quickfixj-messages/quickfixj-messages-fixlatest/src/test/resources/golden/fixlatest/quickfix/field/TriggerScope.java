/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TriggerScope extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1628;

  public static final int THIS_ORDER = 0;

  public static final int OTHER_ORDER = 1;

  public static final int ALL_OTHER_ORDERS_FOR_GIVEN_SECURITY = 2;

  public static final int ALL_OTHER_ORDERS_FOR_GIVEN_SECURITY_AND_PRICE = 3;

  public static final int ALL_OTHER_ORDERS_FOR_GIVEN_SECURITY_AND_SIDE = 4;

  public static final int ALL_OTHER_ORDERS_FOR_GIVEN_SECURITY_PRICE_AND_SIDE = 5;

  public TriggerScope() {
    super(1628);
  }

  public TriggerScope(Integer data) {
    super(1628, data);
  }

  public TriggerScope(int data) {
    super(1628, data);
  }
}

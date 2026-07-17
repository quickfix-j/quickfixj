/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DeliveryType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 919;

  public static final int VERSUS_PAYMENT = 0;

  public static final int FREE = 1;

  public static final int TRI_PARTY = 2;

  public static final int HOLD_IN_CUSTODY = 3;

  public static final int DELIVER_BY_VALUE = 4;

  public DeliveryType() {
    super(919);
  }

  public DeliveryType(Integer data) {
    super(919, data);
  }

  public DeliveryType(int data) {
    super(919, data);
  }
}

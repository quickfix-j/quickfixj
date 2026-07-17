/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40541;

  public static final int PAYMENT_CASH_SETTLEMENT = 0;

  public static final int PHYSICAL_DELIVERY = 1;

  public UnderlyingStreamType() {
    super(40541);
  }

  public UnderlyingStreamType(Integer data) {
    super(40541, data);
  }

  public UnderlyingStreamType(int data) {
    super(40541, data);
  }
}

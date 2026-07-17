/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40050;

  public static final int PAYMENT_CASH_SETTLEMENT = 0;

  public static final int PHYSICAL_DELIVERY = 1;

  public StreamType() {
    super(40050);
  }

  public StreamType(Integer data) {
    super(40050, data);
  }

  public StreamType(int data) {
    super(40050, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingDeliveryStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41777;

  public static final int PERIODIC = 0;

  public static final int INITIAL = 1;

  public static final int SINGLE = 2;

  public UnderlyingDeliveryStreamType() {
    super(41777);
  }

  public UnderlyingDeliveryStreamType(Integer data) {
    super(41777, data);
  }

  public UnderlyingDeliveryStreamType(int data) {
    super(41777, data);
  }
}

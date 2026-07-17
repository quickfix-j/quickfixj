/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegDeliveryStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41429;

  public static final int PERIODIC = 0;

  public static final int INITIAL = 1;

  public static final int SINGLE = 2;

  public LegDeliveryStreamType() {
    super(41429);
  }

  public LegDeliveryStreamType(Integer data) {
    super(41429, data);
  }

  public LegDeliveryStreamType(int data) {
    super(41429, data);
  }
}

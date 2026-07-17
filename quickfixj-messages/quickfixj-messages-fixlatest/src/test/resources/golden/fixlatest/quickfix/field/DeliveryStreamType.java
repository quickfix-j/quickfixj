/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DeliveryStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41058;

  public static final int PERIODIC = 0;

  public static final int INITIAL = 1;

  public static final int SINGLE = 2;

  public DeliveryStreamType() {
    super(41058);
  }

  public DeliveryStreamType(Integer data) {
    super(41058, data);
  }

  public DeliveryStreamType(int data) {
    super(41058, data);
  }
}

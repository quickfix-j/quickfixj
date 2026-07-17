/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ThrottleType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1612;

  public static final int INBOUND_RATE = 0;

  public static final int OUTSTANDING_REQUESTS = 1;

  public ThrottleType() {
    super(1612);
  }

  public ThrottleType(Integer data) {
    super(1612, data);
  }

  public ThrottleType(int data) {
    super(1612, data);
  }
}

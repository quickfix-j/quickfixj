/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NegotiationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2115;

  public static final int AUTO_SPOT = 0;

  public static final int NEGOTIATED_SPOT = 1;

  public static final int PHONE_SPOT = 2;

  public NegotiationMethod() {
    super(2115);
  }

  public NegotiationMethod(Integer data) {
    super(2115, data);
  }

  public NegotiationMethod(int data) {
    super(2115, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingPutOrCall extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 315;

  public static final int PUT = 0;

  public static final int CALL = 1;

  public static final int OTHER = 2;

  public static final int CHOOSER = 3;

  public UnderlyingPutOrCall() {
    super(315);
  }

  public UnderlyingPutOrCall(Integer data) {
    super(315, data);
  }

  public UnderlyingPutOrCall(int data) {
    super(315, data);
  }
}

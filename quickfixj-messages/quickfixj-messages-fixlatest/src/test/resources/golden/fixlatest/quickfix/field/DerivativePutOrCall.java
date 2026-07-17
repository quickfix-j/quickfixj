/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DerivativePutOrCall extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1323;

  public static final int PUT = 0;

  public static final int CALL = 1;

  public static final int OTHER = 2;

  public static final int CHOOSER = 3;

  public DerivativePutOrCall() {
    super(1323);
  }

  public DerivativePutOrCall(Integer data) {
    super(1323, data);
  }

  public DerivativePutOrCall(int data) {
    super(1323, data);
  }
}

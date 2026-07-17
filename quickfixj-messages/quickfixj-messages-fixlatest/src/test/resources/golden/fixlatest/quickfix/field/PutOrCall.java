/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PutOrCall extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 201;

  public static final int PUT = 0;

  public static final int CALL = 1;

  public static final int OTHER = 2;

  public static final int CHOOSER = 3;

  public PutOrCall() {
    super(201);
  }

  public PutOrCall(Integer data) {
    super(201, data);
  }

  public PutOrCall(int data) {
    super(201, data);
  }
}

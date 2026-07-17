/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPutOrCall extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1358;

  public static final int PUT = 0;

  public static final int CALL = 1;

  public static final int OTHER = 2;

  public static final int CHOOSER = 3;

  public LegPutOrCall() {
    super(1358);
  }

  public LegPutOrCall(Integer data) {
    super(1358, data);
  }

  public LegPutOrCall(int data) {
    super(1358, data);
  }
}

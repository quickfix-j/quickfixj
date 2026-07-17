/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class Adjustment extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 334;

  public static final int CANCEL = 1;

  public static final int ERROR = 2;

  public static final int CORRECTION = 3;

  public Adjustment() {
    super(334);
  }

  public Adjustment(Integer data) {
    super(334, data);
  }

  public Adjustment(int data) {
    super(334, data);
  }
}

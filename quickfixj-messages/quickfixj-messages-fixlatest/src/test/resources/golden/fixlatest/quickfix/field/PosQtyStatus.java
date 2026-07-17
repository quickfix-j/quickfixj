/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosQtyStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 706;

  public static final int SUBMITTED = 0;

  public static final int ACCEPTED = 1;

  public static final int REJECTED = 2;

  public PosQtyStatus() {
    super(706);
  }

  public PosQtyStatus(Integer data) {
    super(706, data);
  }

  public PosQtyStatus(int data) {
    super(706, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocReversalStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1738;

  public static final int COMPLETED = 0;

  public static final int REFUSED = 1;

  public static final int CANCELLED = 2;

  public AllocReversalStatus() {
    super(1738);
  }

  public AllocReversalStatus(Integer data) {
    super(1738, data);
  }

  public AllocReversalStatus(int data) {
    super(1738, data);
  }
}

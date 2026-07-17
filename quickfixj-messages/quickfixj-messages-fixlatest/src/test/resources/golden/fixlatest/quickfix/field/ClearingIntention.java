/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ClearingIntention extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1924;

  public static final int DO_NOT_INTEND_TO_CLEAR = 0;

  public static final int INTEND_TO_CLEAR = 1;

  public ClearingIntention() {
    super(1924);
  }

  public ClearingIntention(Integer data) {
    super(1924, data);
  }

  public ClearingIntention(int data) {
    super(1924, data);
  }
}

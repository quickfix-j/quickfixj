/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosReqStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 729;

  public static final int COMPLETED = 0;

  public static final int COMPLETED_WITH_WARNINGS = 1;

  public static final int REJECTED = 2;

  public PosReqStatus() {
    super(729);
  }

  public PosReqStatus(Integer data) {
    super(729, data);
  }

  public PosReqStatus(int data) {
    super(729, data);
  }
}

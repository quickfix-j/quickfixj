/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosMaintStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 722;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_WARNINGS = 1;

  public static final int REJECTED = 2;

  public static final int COMPLETED = 3;

  public static final int COMPLETED_WITH_WARNINGS = 4;

  public PosMaintStatus() {
    super(722);
  }

  public PosMaintStatus(Integer data) {
    super(722, data);
  }

  public PosMaintStatus(int data) {
    super(722, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 910;

  public static final int UNASSIGNED = 0;

  public static final int PARTIALLY_ASSIGNED = 1;

  public static final int ASSIGNMENT_PROPOSED = 2;

  public static final int ASSIGNED = 3;

  public static final int CHALLENGED = 4;

  public static final int REUSED = 5;

  public CollStatus() {
    super(910);
  }

  public CollStatus(Integer data) {
    super(910, data);
  }

  public CollStatus(int data) {
    super(910, data);
  }
}

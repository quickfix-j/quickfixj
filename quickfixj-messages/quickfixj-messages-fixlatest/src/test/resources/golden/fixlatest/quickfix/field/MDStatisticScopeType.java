/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDStatisticScopeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2459;

  public static final int ENTRY_RATE = 1;

  public static final int MODIFICATION_RATE = 2;

  public static final int CANCEL_RATE = 3;

  public static final int DOWNWARD_MOVE = 4;

  public static final int UPWARD_MOVE = 5;

  public MDStatisticScopeType() {
    super(2459);
  }

  public MDStatisticScopeType(Integer data) {
    super(2459, data);
  }

  public MDStatisticScopeType(int data) {
    super(2459, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocationRollupInstruction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1735;

  public static final int ROLLUP = 0;

  public static final int DO_NOT_ROLL_UP = 1;

  public AllocationRollupInstruction() {
    super(1735);
  }

  public AllocationRollupInstruction(Integer data) {
    super(1735, data);
  }

  public AllocationRollupInstruction(int data) {
    super(1735, data);
  }
}

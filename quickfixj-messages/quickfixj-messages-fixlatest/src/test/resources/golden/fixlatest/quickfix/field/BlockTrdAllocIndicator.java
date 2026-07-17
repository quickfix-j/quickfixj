/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class BlockTrdAllocIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1980;

  public static final int BLOCK_TO_BE_ALLOCATED = 0;

  public static final int BLOCK_NOT_TO_BE_ALLOCATED = 1;

  public static final int ALLOCATED_TRADE = 2;

  public BlockTrdAllocIndicator() {
    super(1980);
  }

  public BlockTrdAllocIndicator(Integer data) {
    super(1980, data);
  }

  public BlockTrdAllocIndicator(int data) {
    super(1980, data);
  }
}

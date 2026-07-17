/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LockType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1807;

  public static final int NOT_LOCKED = 0;

  public static final int AWAY_MARKET_NETTER = 1;

  public static final int THREE_TICK_LOCKED = 2;

  public static final int LOCKED_BY_MARKET_MAKER = 3;

  public static final int DIRECTED_ORDER_LOCK = 4;

  public static final int MULTILEG_LOCK = 5;

  public static final int MARKET_ORDER_LOCK = 6;

  public static final int PRE_ASSIGNMENT_LOCK = 7;

  public LockType() {
    super(1807);
  }

  public LockType(Integer data) {
    super(1807, data);
  }

  public LockType(int data) {
    super(1807, data);
  }
}

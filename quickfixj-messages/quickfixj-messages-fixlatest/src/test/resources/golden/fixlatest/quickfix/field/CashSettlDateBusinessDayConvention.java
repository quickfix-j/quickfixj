/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CashSettlDateBusinessDayConvention extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42208;

  public static final int NOT_APPLICABLE = 0;

  public static final int NONE = 1;

  public static final int FOLLOWING_DAY = 2;

  public static final int FLOATING_RATE_NOTE = 3;

  public static final int MODIFIED_FOLLOWING_DAY = 4;

  public static final int PRECEDING_DAY = 5;

  public static final int MODIFIED_PRECEDING_DAY = 6;

  public static final int NEAREST_DAY = 7;

  public CashSettlDateBusinessDayConvention() {
    super(42208);
  }

  public CashSettlDateBusinessDayConvention(Integer data) {
    super(42208, data);
  }

  public CashSettlDateBusinessDayConvention(int data) {
    super(42208, data);
  }
}

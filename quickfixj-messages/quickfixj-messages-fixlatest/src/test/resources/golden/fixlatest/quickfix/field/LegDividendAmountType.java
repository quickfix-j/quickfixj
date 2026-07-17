/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegDividendAmountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42339;

  public static final int RECORD_AMOUNT = 0;

  public static final int EX_AMOUNT = 1;

  public static final int PAID_AMOUNT = 2;

  public static final int PER_MASTER_CONFIRM = 3;

  public LegDividendAmountType() {
    super(42339);
  }

  public LegDividendAmountType(Integer data) {
    super(42339, data);
  }

  public LegDividendAmountType(int data) {
    super(42339, data);
  }
}

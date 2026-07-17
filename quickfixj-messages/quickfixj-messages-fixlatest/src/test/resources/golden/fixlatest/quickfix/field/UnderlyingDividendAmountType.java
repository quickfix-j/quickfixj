/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingDividendAmountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42828;

  public static final int RECORD_AMOUNT = 0;

  public static final int EX_AMOUNT = 1;

  public static final int PAID_AMOUNT = 2;

  public static final int PER_MASTER_CONFIRM = 3;

  public UnderlyingDividendAmountType() {
    super(42828);
  }

  public UnderlyingDividendAmountType(Integer data) {
    super(42828, data);
  }

  public UnderlyingDividendAmountType(int data) {
    super(42828, data);
  }
}

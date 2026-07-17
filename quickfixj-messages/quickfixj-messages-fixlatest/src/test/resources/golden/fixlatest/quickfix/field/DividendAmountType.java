/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DividendAmountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42247;

  public static final int RECORD_AMOUNT = 0;

  public static final int EX_AMOUNT = 1;

  public static final int PAID_AMOUNT = 2;

  public static final int PER_MASTER_CONFIRM = 3;

  public DividendAmountType() {
    super(42247);
  }

  public DividendAmountType(Integer data) {
    super(42247, data);
  }

  public DividendAmountType(int data) {
    super(42247, data);
  }
}

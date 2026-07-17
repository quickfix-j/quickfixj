/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegStreamType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40242;

  public static final int PAYMENT_CASH_SETTLEMENT = 0;

  public static final int PHYSICAL_DELIVERY = 1;

  public LegStreamType() {
    super(40242);
  }

  public LegStreamType(Integer data) {
    super(40242, data);
  }

  public LegStreamType(int data) {
    super(40242, data);
  }
}

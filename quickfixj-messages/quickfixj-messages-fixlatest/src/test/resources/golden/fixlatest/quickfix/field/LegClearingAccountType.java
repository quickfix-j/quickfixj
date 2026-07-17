/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegClearingAccountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1817;

  public static final int CUSTOMER = 1;

  public static final int FIRM = 2;

  public static final int MARKET_MAKER = 3;

  public LegClearingAccountType() {
    super(1817);
  }

  public LegClearingAccountType(Integer data) {
    super(1817, data);
  }

  public LegClearingAccountType(int data) {
    super(1817, data);
  }
}

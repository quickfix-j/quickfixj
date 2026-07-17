/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ClearingAccountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1816;

  public static final int CUSTOMER = 1;

  public static final int FIRM = 2;

  public static final int MARKET_MAKER = 3;

  public ClearingAccountType() {
    super(1816);
  }

  public ClearingAccountType(Integer data) {
    super(1816, data);
  }

  public ClearingAccountType(int data) {
    super(1816, data);
  }
}

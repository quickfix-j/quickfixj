/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityListType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1470;

  public static final int INDUSTRY_CLASSIFICATION = 1;

  public static final int TRADING_LIST = 2;

  public static final int MARKET = 3;

  public static final int NEWSPAPER_LIST = 4;

  public SecurityListType() {
    super(1470);
  }

  public SecurityListType(Integer data) {
    super(1470, data);
  }

  public SecurityListType(int data) {
    super(1470, data);
  }
}

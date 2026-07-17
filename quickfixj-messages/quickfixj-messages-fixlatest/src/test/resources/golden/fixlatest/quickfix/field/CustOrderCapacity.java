/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CustOrderCapacity extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 582;

  public static final int MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT = 1;

  public static final int CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT = 2;

  public static final int MEMBER_TRADING_FOR_ANOTHER_MEMBER = 3;

  public static final int ALL_OTHER = 4;

  public static final int RETAIL_CUSTOMER = 5;

  public CustOrderCapacity() {
    super(582);
  }

  public CustOrderCapacity(Integer data) {
    super(582, data);
  }

  public CustOrderCapacity(int data) {
    super(582, data);
  }
}

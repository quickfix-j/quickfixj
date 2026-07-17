/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrigCustOrderCapacity extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1432;

  public static final int MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT = 1;

  public static final int CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT = 2;

  public static final int MEMBER_TRADING_FOR_ANOTHER_MEMBER = 3;

  public static final int ALL_OTHER = 4;

  public OrigCustOrderCapacity() {
    super(1432);
  }

  public OrigCustOrderCapacity(Integer data) {
    super(1432, data);
  }

  public OrigCustOrderCapacity(int data) {
    super(1432, data);
  }
}

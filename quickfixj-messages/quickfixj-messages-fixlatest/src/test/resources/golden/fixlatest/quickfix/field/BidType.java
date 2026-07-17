/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class BidType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 394;

  public static final int NON_DISCLOSED = 1;

  public static final int DISCLOSED = 2;

  public static final int NO_BIDDING_PROCESS = 3;

  public BidType() {
    super(394);
  }

  public BidType(Integer data) {
    super(394, data);
  }

  public BidType(int data) {
    super(394, data);
  }
}

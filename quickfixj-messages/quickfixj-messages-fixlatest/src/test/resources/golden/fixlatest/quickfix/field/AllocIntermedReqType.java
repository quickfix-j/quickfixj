/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocIntermedReqType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 808;

  public static final int PENDING_ACCEPT = 1;

  public static final int PENDING_RELEASE = 2;

  public static final int PENDING_REVERSAL = 3;

  public static final int ACCEPT = 4;

  public static final int BLOCK_LEVEL_REJECT = 5;

  public static final int ACCOUNT_LEVEL_REJECT = 6;

  public AllocIntermedReqType() {
    super(808);
  }

  public AllocIntermedReqType(Integer data) {
    super(808, data);
  }

  public AllocIntermedReqType(int data) {
    super(808, data);
  }
}

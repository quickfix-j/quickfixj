/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ApplReqType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1347;

  public static final int RETRANSMISSION = 0;

  public static final int SUBSCRIPTION = 1;

  public static final int REQUEST_LAST_SEQ_NUM = 2;

  public static final int REQUEST_APPLICATIONS = 3;

  public static final int UNSUBSCRIBE = 4;

  public static final int CANCEL_RETRANSMISSION = 5;

  public static final int CANCEL_RETRANSMISSION_UNSUBSCRIBE = 6;

  public ApplReqType() {
    super(1347);
  }

  public ApplReqType(Integer data) {
    super(1347, data);
  }

  public ApplReqType(int data) {
    super(1347, data);
  }
}

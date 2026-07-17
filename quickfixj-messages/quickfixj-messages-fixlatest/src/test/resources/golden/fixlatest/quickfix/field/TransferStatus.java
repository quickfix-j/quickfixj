/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TransferStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2442;

  public static final int RECEIVED = 0;

  public static final int REJECTED_BY_INTERMEDIARY = 1;

  public static final int ACCEPT_PENDING = 2;

  public static final int ACCEPTED = 3;

  public static final int DECLINED = 4;

  public static final int CANCELLED = 5;

  public TransferStatus() {
    super(2442);
  }

  public TransferStatus(Integer data) {
    super(2442, data);
  }

  public TransferStatus(int data) {
    super(2442, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TransferRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2443;

  public static final int SUCCESS = 0;

  public static final int INVALID_PARTY = 1;

  public static final int UNKNOWN_INSTRUMENT = 2;

  public static final int UNAUTHORIZED_TO_SUBMIT_XFER = 3;

  public static final int UNKNOWN_POSITION = 4;

  public static final int OTHER = 99;

  public TransferRejectReason() {
    super(2443);
  }

  public TransferRejectReason(Integer data) {
    super(2443, data);
  }

  public TransferRejectReason(int data) {
    super(2443, data);
  }
}

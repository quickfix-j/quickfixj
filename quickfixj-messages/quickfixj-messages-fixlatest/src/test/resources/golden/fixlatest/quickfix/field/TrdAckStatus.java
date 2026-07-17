/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TrdAckStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1523;

  public static final int ACCEPTED = 0;

  public static final int REJECTED = 1;

  public static final int RECEIVED = 2;

  public TrdAckStatus() {
    super(1523);
  }

  public TrdAckStatus(Integer data) {
    super(1523, data);
  }

  public TrdAckStatus(int data) {
    super(1523, data);
  }
}

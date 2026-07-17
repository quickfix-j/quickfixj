/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TransferType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2440;

  public static final int REQUEST_TRANSFER = 0;

  public static final int ACCEPT_TRANSFER = 1;

  public static final int DECLINE_TRANSFER = 2;

  public TransferType() {
    super(2440);
  }

  public TransferType(Integer data) {
    super(2440, data);
  }

  public TransferType(int data) {
    super(2440, data);
  }
}

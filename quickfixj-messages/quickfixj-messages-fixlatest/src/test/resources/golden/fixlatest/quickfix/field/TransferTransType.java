/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TransferTransType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2439;

  public static final int NEW = 0;

  public static final int REPLACE = 1;

  public static final int CANCEL = 2;

  public TransferTransType() {
    super(2439);
  }

  public TransferTransType(Integer data) {
    super(2439, data);
  }

  public TransferTransType(int data) {
    super(2439, data);
  }
}

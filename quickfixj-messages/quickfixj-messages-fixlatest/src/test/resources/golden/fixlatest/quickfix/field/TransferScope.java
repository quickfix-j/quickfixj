/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TransferScope extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2441;

  public static final int INTER_FIRM_TRANSFER = 0;

  public static final int INTRA_FIRM_TRANSFER = 1;

  public static final int CMTA = 2;

  public TransferScope() {
    super(2441);
  }

  public TransferScope(Integer data) {
    super(2441, data);
  }

  public TransferScope(int data) {
    super(2441, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TransactionAttributeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2872;

  public static final int EXCLUSIVE_ARRANGEMENT = 0;

  public static final int COLLATERAL_REUSE = 1;

  public static final int COLLATERAL_ARRANGMENT_TYPE = 2;

  public TransactionAttributeType() {
    super(2872);
  }

  public TransactionAttributeType(Integer data) {
    super(2872, data);
  }

  public TransactionAttributeType(int data) {
    super(2872, data);
  }
}

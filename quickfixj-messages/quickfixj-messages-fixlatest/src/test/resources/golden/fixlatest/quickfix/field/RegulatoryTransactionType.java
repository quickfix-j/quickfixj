/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RegulatoryTransactionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2347;

  public static final int NONE = 0;

  public static final int SEFREQUIRED_TRANSACTION = 1;

  public static final int SEFPERMITTED_TRANSACTION = 2;

  public RegulatoryTransactionType() {
    super(2347);
  }

  public RegulatoryTransactionType(Integer data) {
    super(2347, data);
  }

  public RegulatoryTransactionType(int data) {
    super(2347, data);
  }
}

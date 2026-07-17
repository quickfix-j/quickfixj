/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollAsgnRespType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 905;

  public static final int RECEIVED = 0;

  public static final int ACCEPTED = 1;

  public static final int DECLINED = 2;

  public static final int REJECTED = 3;

  public static final int TRANSACTION_PENDING = 4;

  public static final int TRANSACTION_COMPLETED_WITH_WARNING = 5;

  public CollAsgnRespType() {
    super(905);
  }

  public CollAsgnRespType(Integer data) {
    super(905, data);
  }

  public CollAsgnRespType(int data) {
    super(905, data);
  }
}

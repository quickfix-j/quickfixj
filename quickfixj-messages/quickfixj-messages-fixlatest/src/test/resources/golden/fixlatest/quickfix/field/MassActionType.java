/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassActionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1373;

  public static final int SUSPEND_ORDERS = 1;

  public static final int RELEASE_ORDERS_FROM_SUSPENSION = 2;

  public static final int CANCEL_ORDERS = 3;

  public MassActionType() {
    super(1373);
  }

  public MassActionType(Integer data) {
    super(1373, data);
  }

  public MassActionType(int data) {
    super(1373, data);
  }
}

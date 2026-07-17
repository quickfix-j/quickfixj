/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ListOrderStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 431;

  public static final int IN_BIDDING_PROCESS = 1;

  public static final int RECEIVED_FOR_EXECUTION = 2;

  public static final int EXECUTING = 3;

  public static final int CANCELLING = 4;

  public static final int ALERT = 5;

  public static final int ALL_DONE = 6;

  public static final int REJECT = 7;

  public ListOrderStatus() {
    super(431);
  }

  public ListOrderStatus(Integer data) {
    super(431, data);
  }

  public ListOrderStatus(int data) {
    super(431, data);
  }
}

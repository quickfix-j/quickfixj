/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollRptStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2488;

  public static final int ACCEPTED = 0;

  public static final int RECEIVED = 1;

  public static final int REJECTED = 2;

  public CollRptStatus() {
    super(2488);
  }

  public CollRptStatus(Integer data) {
    super(2488, data);
  }

  public CollRptStatus(int data) {
    super(2488, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ListStatusType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 429;

  public static final int ACK = 1;

  public static final int RESPONSE = 2;

  public static final int TIMED = 3;

  public static final int EXEC_STARTED = 4;

  public static final int ALL_DONE = 5;

  public static final int ALERT = 6;

  public ListStatusType() {
    super(429);
  }

  public ListStatusType(Integer data) {
    super(429, data);
  }

  public ListStatusType(int data) {
    super(429, data);
  }
}

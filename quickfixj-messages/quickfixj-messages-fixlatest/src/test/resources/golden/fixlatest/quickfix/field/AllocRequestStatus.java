/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocRequestStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2768;

  public static final int ACCEPTED = 0;

  public static final int REJECTED = 1;

  public AllocRequestStatus() {
    super(2768);
  }

  public AllocRequestStatus(Integer data) {
    super(2768, data);
  }

  public AllocRequestStatus(int data) {
    super(2768, data);
  }
}

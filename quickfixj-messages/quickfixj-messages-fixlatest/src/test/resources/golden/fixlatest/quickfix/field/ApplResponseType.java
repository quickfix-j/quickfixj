/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ApplResponseType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1348;

  public static final int REQUEST_SUCCESSFULLY_PROCESSED = 0;

  public static final int APPLICATION_DOES_NOT_EXIST = 1;

  public static final int MESSAGES_NOT_AVAILABLE = 2;

  public ApplResponseType() {
    super(1348);
  }

  public ApplResponseType(Integer data) {
    super(1348, data);
  }

  public ApplResponseType(int data) {
    super(1348, data);
  }
}

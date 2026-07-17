/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ConfirmType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 773;

  public static final int STATUS = 1;

  public static final int CONFIRMATION = 2;

  public static final int CONFIRMATION_REQUEST_REJECTED = 3;

  public ConfirmType() {
    super(773);
  }

  public ConfirmType(Integer data) {
    super(773, data);
  }

  public ConfirmType(int data) {
    super(773, data);
  }
}

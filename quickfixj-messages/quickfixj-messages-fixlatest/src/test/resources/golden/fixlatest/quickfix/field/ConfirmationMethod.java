/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ConfirmationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1927;

  public static final int NON_ELECTRONIC = 0;

  public static final int ELECTRONIC = 1;

  public static final int UNCONFIRMED = 2;

  public ConfirmationMethod() {
    super(1927);
  }

  public ConfirmationMethod(Integer data) {
    super(1927, data);
  }

  public ConfirmationMethod(int data) {
    super(1927, data);
  }
}

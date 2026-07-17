/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExpirationQtyType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 982;

  public static final int AUTO_EXERCISE = 1;

  public static final int NON_AUTO_EXERCISE = 2;

  public static final int FINAL_WILL_BE_EXERCISED = 3;

  public static final int CONTRARY_INTENTION = 4;

  public static final int DIFFERENCE = 5;

  public ExpirationQtyType() {
    super(982);
  }

  public ExpirationQtyType(Integer data) {
    super(982, data);
  }

  public ExpirationQtyType(int data) {
    super(982, data);
  }
}

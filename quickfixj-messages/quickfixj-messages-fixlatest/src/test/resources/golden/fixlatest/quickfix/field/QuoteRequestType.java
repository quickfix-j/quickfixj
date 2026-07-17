/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class QuoteRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 303;

  public static final int MANUAL = 1;

  public static final int AUTOMATIC = 2;

  public static final int CONFIRM_QUOTE = 3;

  public QuoteRequestType() {
    super(303);
  }

  public QuoteRequestType(Integer data) {
    super(303, data);
  }

  public QuoteRequestType(int data) {
    super(303, data);
  }
}

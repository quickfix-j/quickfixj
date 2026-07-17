/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class PrivateQuote extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1171;

  public static final boolean PRIVATE_QUOTE = true;

  public static final boolean PUBLIC_QUOTE = false;

  public PrivateQuote() {
    super(1171);
  }

  public PrivateQuote(Boolean data) {
    super(1171, data);
  }

  public PrivateQuote(boolean data) {
    super(1171, data);
  }
}

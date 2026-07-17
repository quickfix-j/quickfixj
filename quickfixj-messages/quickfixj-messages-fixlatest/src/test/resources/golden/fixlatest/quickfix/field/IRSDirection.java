/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class IRSDirection extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1933;

  public static final String PAY = "PAY";

  public static final String RCV = "RCV";

  public static final String NA = "NA";

  public IRSDirection() {
    super(1933);
  }

  public IRSDirection(String data) {
    super(1933, data);
  }
}

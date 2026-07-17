/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class IOIQty extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 27;

  public static final String SMALL = "S";

  public static final String MEDIUM = "M";

  public static final String LARGE = "L";

  public static final String UNDISCLOSED_QUANTITY = "U";

  public IOIQty() {
    super(27);
  }

  public IOIQty(String data) {
    super(27, data);
  }
}

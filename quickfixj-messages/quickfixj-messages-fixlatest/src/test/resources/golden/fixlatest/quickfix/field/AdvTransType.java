/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class AdvTransType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 5;

  public static final String NEW = "N";

  public static final String CANCEL = "C";

  public static final String REPLACE = "R";

  public AdvTransType() {
    super(5);
  }

  public AdvTransType(String data) {
    super(5, data);
  }
}

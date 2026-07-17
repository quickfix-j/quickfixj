/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class ObligationType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1739;

  public static final String BOND = "0";

  public static final String CONVERT_BOND = "1";

  public static final String MORTGAGE = "2";

  public static final String LOAN = "3";

  public ObligationType() {
    super(1739);
  }

  public ObligationType(String data) {
    super(1739, data);
  }
}

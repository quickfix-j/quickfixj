/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegObligationType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2155;

  public static final String BOND = "0";

  public static final String CONVERT_BOND = "1";

  public static final String MORTGAGE = "2";

  public static final String LOAN = "3";

  public LegObligationType() {
    super(2155);
  }

  public LegObligationType(String data) {
    super(2155, data);
  }
}

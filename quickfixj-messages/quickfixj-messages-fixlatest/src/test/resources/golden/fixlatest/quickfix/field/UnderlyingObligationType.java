/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingObligationType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2012;

  public static final String BOND = "0";

  public static final String CONVERTIBLE_BOND = "1";

  public static final String MORTGAGE = "2";

  public static final String LOAN = "3";

  public UnderlyingObligationType() {
    super(2012);
  }

  public UnderlyingObligationType(String data) {
    super(2012, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingSettlMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1039;

  public static final String CASH_SETTLEMENT_REQUIRED = "C";

  public static final String PHYSICAL_SETTLEMENT_REQUIRED = "P";

  public static final String ELECTION = "E";

  public UnderlyingSettlMethod() {
    super(1039);
  }

  public UnderlyingSettlMethod(String data) {
    super(1039, data);
  }
}

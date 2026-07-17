/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class DerivativeSettlMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1317;

  public static final String CASH_SETTLEMENT_REQUIRED = "C";

  public static final String PHYSICAL_SETTLEMENT_REQUIRED = "P";

  public static final String ELECTION = "E";

  public DerivativeSettlMethod() {
    super(1317);
  }

  public DerivativeSettlMethod(String data) {
    super(1317, data);
  }
}

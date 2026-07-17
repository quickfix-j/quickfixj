/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegSettlMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2192;

  public static final String CASH_SETTLEMENT_REQUIRED = "C";

  public static final String PHYSICAL_SETTLEMENT_REQUIRED = "P";

  public static final String ELECTION = "E";

  public LegSettlMethod() {
    super(2192);
  }

  public LegSettlMethod(String data) {
    super(2192, data);
  }
}

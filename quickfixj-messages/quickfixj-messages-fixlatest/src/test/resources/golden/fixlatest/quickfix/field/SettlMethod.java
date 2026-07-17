/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class SettlMethod extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1193;

  public static final String CASH_SETTLEMENT_REQUIRED = "C";

  public static final String PHYSICAL_SETTLEMENT_REQUIRED = "P";

  public static final String ELECTION = "E";

  public SettlMethod() {
    super(1193);
  }

  public SettlMethod(String data) {
    super(1193, data);
  }
}

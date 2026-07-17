/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class FinancialStatus extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 291;

  public static final String BANKRUPT = "1";

  public static final String PENDING_DELISTING = "2";

  public static final String RESTRICTED = "3";

  public FinancialStatus() {
    super(291);
  }

  public FinancialStatus(String data) {
    super(291, data);
  }
}

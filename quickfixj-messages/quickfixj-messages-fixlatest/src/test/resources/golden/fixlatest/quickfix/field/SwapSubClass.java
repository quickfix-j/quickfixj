/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class SwapSubClass extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1575;

  public static final String AMORTIZING = "AMTZ";

  public static final String COMPOUNDING = "COMP";

  public static final String CONSTANT_NOTIONAL_SCHEDULE = "CNST";

  public static final String ACCRETING_NOTIONAL_SCHEDULE = "ACRT";

  public static final String CUSTOM_NOTIONAL_SCHEDULE = "CUST";

  public SwapSubClass() {
    super(1575);
  }

  public SwapSubClass(String data) {
    super(1575, data);
  }
}

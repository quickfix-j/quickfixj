/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingSwapSubClass extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2289;

  public static final String AMORTIZING = "AMTZ";

  public static final String COMPOUNDING = "COMP";

  public static final String CONSTANT_NOTIONAL_SCHEDULE = "CNST";

  public static final String ACCRETING_NOTIONAL_SCHEDULE = "ACRT";

  public static final String CUSTOM_NOTIONAL_SCHEDULE = "CUST";

  public UnderlyingSwapSubClass() {
    super(2289);
  }

  public UnderlyingSwapSubClass(String data) {
    super(2289, data);
  }
}

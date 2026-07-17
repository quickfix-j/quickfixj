/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegSwapSubClass extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2156;

  public static final String AMORTIZING = "AMTZ";

  public static final String COMPOUNDING = "COMP";

  public static final String CONSTANT_NOTIONAL_SCHEDULE = "CNST";

  public static final String ACCRETING_NOTIONAL_SCHEDULE = "ACRT";

  public static final String CUSTOM_NOTIONAL_SCHEDULE = "CUST";

  public LegSwapSubClass() {
    super(2156);
  }

  public LegSwapSubClass(String data) {
    super(2156, data);
  }
}

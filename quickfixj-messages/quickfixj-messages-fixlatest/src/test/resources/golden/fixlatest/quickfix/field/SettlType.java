/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class SettlType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 63;

  public static final String REGULAR = "0";

  public static final String CASH = "1";

  public static final String NEXT_DAY = "2";

  public static final String TPLUS2 = "3";

  public static final String TPLUS3 = "4";

  public static final String TPLUS4 = "5";

  public static final String FUTURE = "6";

  public static final String WHEN_AND_IF_ISSUED = "7";

  public static final String SELLERS_OPTION = "8";

  public static final String TPLUS5 = "9";

  public static final String BROKEN_DATE = "B";

  public static final String FXSPOT_NEXT_SETTLEMENT = "C";

  public SettlType() {
    super(63);
  }

  public SettlType(String data) {
    super(63, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class DerivativeTimeUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1271;

  public static final String HOUR = "H";

  public static final String MINUTE = "Min";

  public static final String SECOND = "S";

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public static final String QUARTER = "Q";

  public DerivativeTimeUnit() {
    super(1271);
  }

  public DerivativeTimeUnit(String data) {
    super(1271, data);
  }
}

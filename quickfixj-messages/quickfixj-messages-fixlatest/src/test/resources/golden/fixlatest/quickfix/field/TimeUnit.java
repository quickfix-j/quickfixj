/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class TimeUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 997;

  public static final String HOUR = "H";

  public static final String MINUTE = "Min";

  public static final String SECOND = "S";

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public static final String QUARTER = "Q";

  public TimeUnit() {
    super(997);
  }

  public TimeUnit(String data) {
    super(997, data);
  }
}

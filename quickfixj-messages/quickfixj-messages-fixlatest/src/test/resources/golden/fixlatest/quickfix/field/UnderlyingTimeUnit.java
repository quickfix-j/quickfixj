/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingTimeUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1000;

  public static final String HOUR = "H";

  public static final String MINUTE = "Min";

  public static final String SECOND = "S";

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public static final String QUARTER = "Q";

  public UnderlyingTimeUnit() {
    super(1000);
  }

  public UnderlyingTimeUnit(String data) {
    super(1000, data);
  }
}

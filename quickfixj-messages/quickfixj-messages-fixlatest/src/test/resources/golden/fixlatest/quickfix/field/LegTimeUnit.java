/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegTimeUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1001;

  public static final String HOUR = "H";

  public static final String MINUTE = "Min";

  public static final String SECOND = "S";

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public static final String QUARTER = "Q";

  public LegTimeUnit() {
    super(1001);
  }

  public LegTimeUnit(String data) {
    super(1001, data);
  }
}

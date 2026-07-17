/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class EventTimeUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1827;

  public static final String HOUR = "H";

  public static final String MINUTE = "Min";

  public static final String SECOND = "S";

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public EventTimeUnit() {
    super(1827);
  }

  public EventTimeUnit(String data) {
    super(1827, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ThrottleTimeUnit extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1615;

  public static final int SECONDS = 0;

  public static final int TENTHS_OF_ASECOND = 1;

  public static final int HUNDREDTHS_OF_ASECOND = 2;

  public static final int MILLISECONDS = 3;

  public static final int MICROSECONDS = 4;

  public static final int NANOSECONDS = 5;

  public static final int MINUTES = 10;

  public static final int HOURS = 11;

  public static final int DAYS = 12;

  public static final int WEEKS = 13;

  public static final int MONTHS = 14;

  public static final int YEARS = 15;

  public ThrottleTimeUnit() {
    super(1615);
  }

  public ThrottleTimeUnit(Integer data) {
    super(1615, data);
  }

  public ThrottleTimeUnit(int data) {
    super(1615, data);
  }
}

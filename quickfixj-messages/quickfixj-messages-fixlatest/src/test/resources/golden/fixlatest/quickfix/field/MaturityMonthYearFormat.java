/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MaturityMonthYearFormat extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1303;

  public static final int YEAR_MONTH_ONLY = 0;

  public static final int YEAR_MONTH_DAY = 1;

  public static final int YEAR_MONTH_WEEK = 2;

  public MaturityMonthYearFormat() {
    super(1303);
  }

  public MaturityMonthYearFormat(Integer data) {
    super(1303, data);
  }

  public MaturityMonthYearFormat(int data) {
    super(1303, data);
  }
}

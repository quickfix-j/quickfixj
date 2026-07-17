/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class ComplexEventScheduleFrequencyUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41035;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public ComplexEventScheduleFrequencyUnit() {
    super(41035);
  }

  public ComplexEventScheduleFrequencyUnit(String data) {
    super(41035, data);
  }
}

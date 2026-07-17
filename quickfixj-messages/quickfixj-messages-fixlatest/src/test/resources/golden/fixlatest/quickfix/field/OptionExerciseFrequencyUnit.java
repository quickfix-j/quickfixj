/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class OptionExerciseFrequencyUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41123;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public OptionExerciseFrequencyUnit() {
    super(41123);
  }

  public OptionExerciseFrequencyUnit(String data) {
    super(41123, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StrikeExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1304;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public StrikeExerciseStyle() {
    super(1304);
  }

  public StrikeExerciseStyle(Integer data) {
    super(1304, data);
  }

  public StrikeExerciseStyle(int data) {
    super(1304, data);
  }
}

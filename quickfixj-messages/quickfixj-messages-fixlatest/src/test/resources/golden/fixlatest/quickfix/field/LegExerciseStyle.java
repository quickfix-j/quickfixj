/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1420;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public LegExerciseStyle() {
    super(1420);
  }

  public LegExerciseStyle(Integer data) {
    super(1420, data);
  }

  public LegExerciseStyle(int data) {
    super(1420, data);
  }
}

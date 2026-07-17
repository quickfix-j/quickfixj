/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1194;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public ExerciseStyle() {
    super(1194);
  }

  public ExerciseStyle(Integer data) {
    super(1194, data);
  }

  public ExerciseStyle(int data) {
    super(1194, data);
  }
}

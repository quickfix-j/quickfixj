/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1419;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public UnderlyingExerciseStyle() {
    super(1419);
  }

  public UnderlyingExerciseStyle(Integer data) {
    super(1419, data);
  }

  public UnderlyingExerciseStyle(int data) {
    super(1419, data);
  }
}

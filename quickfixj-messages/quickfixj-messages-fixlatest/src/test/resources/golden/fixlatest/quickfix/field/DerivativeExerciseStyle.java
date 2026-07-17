/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DerivativeExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1299;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public DerivativeExerciseStyle() {
    super(1299);
  }

  public DerivativeExerciseStyle(Integer data) {
    super(1299, data);
  }

  public DerivativeExerciseStyle(int data) {
    super(1299, data);
  }
}

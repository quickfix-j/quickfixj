/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegProvisionOptionExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40459;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public LegProvisionOptionExerciseStyle() {
    super(40459);
  }

  public LegProvisionOptionExerciseStyle(Integer data) {
    super(40459, data);
  }

  public LegProvisionOptionExerciseStyle(int data) {
    super(40459, data);
  }
}

/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingProvisionOptionExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42159;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public UnderlyingProvisionOptionExerciseStyle() {
    super(42159);
  }

  public UnderlyingProvisionOptionExerciseStyle(Integer data) {
    super(42159, data);
  }

  public UnderlyingProvisionOptionExerciseStyle(int data) {
    super(42159, data);
  }
}

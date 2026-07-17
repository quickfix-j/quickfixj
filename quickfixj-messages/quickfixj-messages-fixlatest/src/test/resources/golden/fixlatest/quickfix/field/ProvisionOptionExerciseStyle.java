/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionOptionExerciseStyle extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40101;

  public static final int EUROPEAN = 0;

  public static final int AMERICAN = 1;

  public static final int BERMUDA = 2;

  public static final int OTHER = 99;

  public ProvisionOptionExerciseStyle() {
    super(40101);
  }

  public ProvisionOptionExerciseStyle(Integer data) {
    super(40101, data);
  }

  public ProvisionOptionExerciseStyle(int data) {
    super(40101, data);
  }
}

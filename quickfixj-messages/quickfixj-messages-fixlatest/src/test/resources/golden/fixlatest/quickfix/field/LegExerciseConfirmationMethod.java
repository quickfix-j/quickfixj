/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegExerciseConfirmationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41486;

  public static final int NOT_REQUIRED = 0;

  public static final int NON_ELECTRONIC = 1;

  public static final int ELECTRONIC = 2;

  public static final int UNKNOWN = 3;

  public LegExerciseConfirmationMethod() {
    super(41486);
  }

  public LegExerciseConfirmationMethod(Integer data) {
    super(41486, data);
  }

  public LegExerciseConfirmationMethod(int data) {
    super(41486, data);
  }
}

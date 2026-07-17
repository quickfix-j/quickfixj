/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExerciseConfirmationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41111;

  public static final int NOT_REQUIRED = 0;

  public static final int NON_ELECTRONIC = 1;

  public static final int ELECTRONIC = 2;

  public static final int UNKNOWN = 3;

  public ExerciseConfirmationMethod() {
    super(41111);
  }

  public ExerciseConfirmationMethod(Integer data) {
    super(41111, data);
  }

  public ExerciseConfirmationMethod(int data) {
    super(41111, data);
  }
}

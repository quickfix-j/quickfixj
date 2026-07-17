/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class ExerciseMethod extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 747;

  public static final char AUTOMATIC = 'A';

  public static final char MANUAL = 'M';

  public ExerciseMethod() {
    super(747);
  }

  public ExerciseMethod(Character data) {
    super(747, data);
  }

  public ExerciseMethod(char data) {
    super(747, data);
  }
}

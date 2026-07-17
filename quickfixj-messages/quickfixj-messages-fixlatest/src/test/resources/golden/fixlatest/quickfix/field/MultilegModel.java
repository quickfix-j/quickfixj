/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MultilegModel extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1377;

  public static final int PREDEFINED_MULTILEG_SECURITY = 0;

  public static final int USER_DEFINED_MULTILEG_SECURITY = 1;

  public static final int USER_DEFINED = 2;

  public MultilegModel() {
    super(1377);
  }

  public MultilegModel(Integer data) {
    super(1377, data);
  }

  public MultilegModel(int data) {
    super(1377, data);
  }
}

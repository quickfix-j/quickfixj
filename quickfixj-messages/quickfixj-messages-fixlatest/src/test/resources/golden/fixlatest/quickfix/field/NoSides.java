/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NoSides extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 552;

  public static final String ONE_SIDE = "1";

  public static final String BOTH_SIDES = "2";

  public NoSides() {
    super(552);
  }

  public NoSides(Integer data) {
    super(552, data);
  }

  public NoSides(int data) {
    super(552, data);
  }
}

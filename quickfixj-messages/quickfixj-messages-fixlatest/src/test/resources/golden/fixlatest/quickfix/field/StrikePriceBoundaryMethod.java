/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StrikePriceBoundaryMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1479;

  public static final int LESS_THAN = 1;

  public static final int LESS_THAN_OR_EQUAL = 2;

  public static final int EQUAL = 3;

  public static final int GREATER_THAN_OR_EQUAL = 4;

  public static final int GREATER_THAN = 5;

  public StrikePriceBoundaryMethod() {
    super(1479);
  }

  public StrikePriceBoundaryMethod(Integer data) {
    super(1479, data);
  }

  public StrikePriceBoundaryMethod(int data) {
    super(1479, data);
  }
}

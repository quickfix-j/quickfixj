/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CalculationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2592;

  public static final int AUTOMATIC = 0;

  public static final int MANUAL = 1;

  public CalculationMethod() {
    super(2592);
  }

  public CalculationMethod(Integer data) {
    super(2592, data);
  }

  public CalculationMethod(int data) {
    super(2592, data);
  }
}

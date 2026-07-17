/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MaxFloor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 111;

  public MaxFloor() {
    super(111);
  }

  public MaxFloor(BigDecimal data) {
    super(111, data);
  }

  public MaxFloor(double data) {
    super(111, BigDecimal.valueOf(data));
  }
}

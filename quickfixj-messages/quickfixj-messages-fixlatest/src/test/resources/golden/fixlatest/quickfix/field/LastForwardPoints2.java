/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastForwardPoints2 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 641;

  public LastForwardPoints2() {
    super(641);
  }

  public LastForwardPoints2(BigDecimal data) {
    super(641, data);
  }

  public LastForwardPoints2(double data) {
    super(641, BigDecimal.valueOf(data));
  }
}

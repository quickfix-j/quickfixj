/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastSwapPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1071;

  public LastSwapPoints() {
    super(1071);
  }

  public LastSwapPoints(BigDecimal data) {
    super(1071, data);
  }

  public LastSwapPoints(double data) {
    super(1071, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SwapPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1069;

  public SwapPoints() {
    super(1069);
  }

  public SwapPoints(BigDecimal data) {
    super(1069, data);
  }

  public SwapPoints(double data) {
    super(1069, BigDecimal.valueOf(data));
  }
}

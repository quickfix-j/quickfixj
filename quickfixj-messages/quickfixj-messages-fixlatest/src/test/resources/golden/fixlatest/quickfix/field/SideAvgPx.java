/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideAvgPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1852;

  public SideAvgPx() {
    super(1852);
  }

  public SideAvgPx(BigDecimal data) {
    super(1852, data);
  }

  public SideAvgPx(double data) {
    super(1852, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AvgPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 6;

  public AvgPx() {
    super(6);
  }

  public AvgPx(BigDecimal data) {
    super(6, data);
  }

  public AvgPx(double data) {
    super(6, BigDecimal.valueOf(data));
  }
}

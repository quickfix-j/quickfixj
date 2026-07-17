/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DayAvgPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 426;

  public DayAvgPx() {
    super(426);
  }

  public DayAvgPx(BigDecimal data) {
    super(426, data);
  }

  public DayAvgPx(double data) {
    super(426, BigDecimal.valueOf(data));
  }
}

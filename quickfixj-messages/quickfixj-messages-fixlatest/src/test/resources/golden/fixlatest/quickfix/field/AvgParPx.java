/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AvgParPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 860;

  public AvgParPx() {
    super(860);
  }

  public AvgParPx(BigDecimal data) {
    super(860, data);
  }

  public AvgParPx(double data) {
    super(860, BigDecimal.valueOf(data));
  }
}

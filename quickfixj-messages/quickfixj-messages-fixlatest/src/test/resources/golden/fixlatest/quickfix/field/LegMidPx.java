/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMidPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2346;

  public LegMidPx() {
    super(2346);
  }

  public LegMidPx(BigDecimal data) {
    super(2346, data);
  }

  public LegMidPx(double data) {
    super(2346, BigDecimal.valueOf(data));
  }
}

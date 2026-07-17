/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegLastPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 637;

  public LegLastPx() {
    super(637);
  }

  public LegLastPx(BigDecimal data) {
    super(637, data);
  }

  public LegLastPx(double data) {
    super(637, BigDecimal.valueOf(data));
  }
}

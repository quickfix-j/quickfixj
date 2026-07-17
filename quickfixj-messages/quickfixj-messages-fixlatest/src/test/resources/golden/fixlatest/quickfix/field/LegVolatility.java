/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegVolatility extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1379;

  public LegVolatility() {
    super(1379);
  }

  public LegVolatility(BigDecimal data) {
    super(1379, data);
  }

  public LegVolatility(double data) {
    super(1379, BigDecimal.valueOf(data));
  }
}

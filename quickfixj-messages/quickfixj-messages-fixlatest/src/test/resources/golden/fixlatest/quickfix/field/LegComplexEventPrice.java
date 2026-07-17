/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegComplexEventPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2227;

  public LegComplexEventPrice() {
    super(2227);
  }

  public LegComplexEventPrice(BigDecimal data) {
    super(2227, data);
  }

  public LegComplexEventPrice(double data) {
    super(2227, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2048;

  public UnderlyingComplexEventPrice() {
    super(2048);
  }

  public UnderlyingComplexEventPrice(BigDecimal data) {
    super(2048, data);
  }

  public UnderlyingComplexEventPrice(double data) {
    super(2048, BigDecimal.valueOf(data));
  }
}

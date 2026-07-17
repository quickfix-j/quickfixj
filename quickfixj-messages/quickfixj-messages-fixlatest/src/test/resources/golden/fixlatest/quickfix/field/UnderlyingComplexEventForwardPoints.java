/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2420;

  public UnderlyingComplexEventForwardPoints() {
    super(2420);
  }

  public UnderlyingComplexEventForwardPoints(BigDecimal data) {
    super(2420, data);
  }

  public UnderlyingComplexEventForwardPoints(double data) {
    super(2420, BigDecimal.valueOf(data));
  }
}

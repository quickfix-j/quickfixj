/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingRateSpreadInitialValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43004;

  public UnderlyingRateSpreadInitialValue() {
    super(43004);
  }

  public UnderlyingRateSpreadInitialValue(BigDecimal data) {
    super(43004, data);
  }

  public UnderlyingRateSpreadInitialValue(double data) {
    super(43004, BigDecimal.valueOf(data));
  }
}

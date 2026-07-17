/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingAdditionalTermBondParValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42031;

  public UnderlyingAdditionalTermBondParValue() {
    super(42031);
  }

  public UnderlyingAdditionalTermBondParValue(BigDecimal data) {
    super(42031, data);
  }

  public UnderlyingAdditionalTermBondParValue(double data) {
    super(42031, BigDecimal.valueOf(data));
  }
}

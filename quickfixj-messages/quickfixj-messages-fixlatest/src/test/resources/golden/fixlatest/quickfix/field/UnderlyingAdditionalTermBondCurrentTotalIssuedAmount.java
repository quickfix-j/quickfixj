/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingAdditionalTermBondCurrentTotalIssuedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42032;

  public UnderlyingAdditionalTermBondCurrentTotalIssuedAmount() {
    super(42032);
  }

  public UnderlyingAdditionalTermBondCurrentTotalIssuedAmount(BigDecimal data) {
    super(42032, data);
  }

  public UnderlyingAdditionalTermBondCurrentTotalIssuedAmount(double data) {
    super(42032, BigDecimal.valueOf(data));
  }
}

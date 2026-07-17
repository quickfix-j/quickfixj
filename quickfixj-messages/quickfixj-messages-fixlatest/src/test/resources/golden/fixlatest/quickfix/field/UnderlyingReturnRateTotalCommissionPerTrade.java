/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingReturnRateTotalCommissionPerTrade extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43039;

  public UnderlyingReturnRateTotalCommissionPerTrade() {
    super(43039);
  }

  public UnderlyingReturnRateTotalCommissionPerTrade(BigDecimal data) {
    super(43039, data);
  }

  public UnderlyingReturnRateTotalCommissionPerTrade(double data) {
    super(43039, BigDecimal.valueOf(data));
  }
}

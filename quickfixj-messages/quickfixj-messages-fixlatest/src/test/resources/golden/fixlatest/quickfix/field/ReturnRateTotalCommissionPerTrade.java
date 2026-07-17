/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReturnRateTotalCommissionPerTrade extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42740;

  public ReturnRateTotalCommissionPerTrade() {
    super(42740);
  }

  public ReturnRateTotalCommissionPerTrade(BigDecimal data) {
    super(42740, data);
  }

  public ReturnRateTotalCommissionPerTrade(double data) {
    super(42740, BigDecimal.valueOf(data));
  }
}

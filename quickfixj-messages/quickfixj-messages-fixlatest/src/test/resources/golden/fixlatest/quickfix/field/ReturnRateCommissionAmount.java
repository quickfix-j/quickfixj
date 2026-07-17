/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReturnRateCommissionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42738;

  public ReturnRateCommissionAmount() {
    super(42738);
  }

  public ReturnRateCommissionAmount(BigDecimal data) {
    super(42738, data);
  }

  public ReturnRateCommissionAmount(double data) {
    super(42738, BigDecimal.valueOf(data));
  }
}

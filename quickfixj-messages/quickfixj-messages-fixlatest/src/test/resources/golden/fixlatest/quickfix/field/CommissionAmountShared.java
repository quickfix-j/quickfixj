/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CommissionAmountShared extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2648;

  public CommissionAmountShared() {
    super(2648);
  }

  public CommissionAmountShared(BigDecimal data) {
    super(2648, data);
  }

  public CommissionAmountShared(double data) {
    super(2648, BigDecimal.valueOf(data));
  }
}

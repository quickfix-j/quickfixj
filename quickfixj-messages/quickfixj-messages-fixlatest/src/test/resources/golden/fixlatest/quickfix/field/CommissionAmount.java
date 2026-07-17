/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CommissionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2640;

  public CommissionAmount() {
    super(2640);
  }

  public CommissionAmount(BigDecimal data) {
    super(2640, data);
  }

  public CommissionAmount(double data) {
    super(2640, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CommissionRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2646;

  public CommissionRate() {
    super(2646);
  }

  public CommissionRate(BigDecimal data) {
    super(2646, data);
  }

  public CommissionRate(double data) {
    super(2646, BigDecimal.valueOf(data));
  }
}

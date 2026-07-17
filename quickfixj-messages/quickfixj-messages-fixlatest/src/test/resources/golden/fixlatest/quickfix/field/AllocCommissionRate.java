/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocCommissionRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2660;

  public AllocCommissionRate() {
    super(2660);
  }

  public AllocCommissionRate(BigDecimal data) {
    super(2660, data);
  }

  public AllocCommissionRate(double data) {
    super(2660, BigDecimal.valueOf(data));
  }
}

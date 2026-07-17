/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DiscountFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1592;

  public DiscountFactor() {
    super(1592);
  }

  public DiscountFactor(BigDecimal data) {
    super(1592, data);
  }

  public DiscountFactor(double data) {
    super(1592, BigDecimal.valueOf(data));
  }
}

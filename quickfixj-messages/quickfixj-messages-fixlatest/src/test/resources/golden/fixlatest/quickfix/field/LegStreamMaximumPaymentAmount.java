/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStreamMaximumPaymentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41552;

  public LegStreamMaximumPaymentAmount() {
    super(41552);
  }

  public LegStreamMaximumPaymentAmount(BigDecimal data) {
    super(41552, data);
  }

  public LegStreamMaximumPaymentAmount(double data) {
    super(41552, BigDecimal.valueOf(data));
  }
}

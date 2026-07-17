/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PayAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1710;

  public PayAmount() {
    super(1710);
  }

  public PayAmount(BigDecimal data) {
    super(1710, data);
  }

  public PayAmount(double data) {
    super(1710, BigDecimal.valueOf(data));
  }
}

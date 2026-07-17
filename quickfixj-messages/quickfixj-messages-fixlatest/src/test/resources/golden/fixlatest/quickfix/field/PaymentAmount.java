/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40217;

  public PaymentAmount() {
    super(40217);
  }

  public PaymentAmount(BigDecimal data) {
    super(40217, data);
  }

  public PaymentAmount(double data) {
    super(40217, BigDecimal.valueOf(data));
  }
}

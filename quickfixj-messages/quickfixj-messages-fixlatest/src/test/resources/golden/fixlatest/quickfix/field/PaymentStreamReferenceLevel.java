/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamReferenceLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41200;

  public PaymentStreamReferenceLevel() {
    super(41200);
  }

  public PaymentStreamReferenceLevel(BigDecimal data) {
    super(41200, data);
  }

  public PaymentStreamReferenceLevel(double data) {
    super(41200, BigDecimal.valueOf(data));
  }
}

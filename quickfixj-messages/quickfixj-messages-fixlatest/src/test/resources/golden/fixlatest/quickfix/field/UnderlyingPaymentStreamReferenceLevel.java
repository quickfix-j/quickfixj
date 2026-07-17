/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamReferenceLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41917;

  public UnderlyingPaymentStreamReferenceLevel() {
    super(41917);
  }

  public UnderlyingPaymentStreamReferenceLevel(BigDecimal data) {
    super(41917, data);
  }

  public UnderlyingPaymentStreamReferenceLevel(double data) {
    super(41917, BigDecimal.valueOf(data));
  }
}

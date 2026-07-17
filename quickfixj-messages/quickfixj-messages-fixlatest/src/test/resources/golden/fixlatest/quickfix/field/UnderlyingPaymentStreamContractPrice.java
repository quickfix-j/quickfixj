/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamContractPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41907;

  public UnderlyingPaymentStreamContractPrice() {
    super(41907);
  }

  public UnderlyingPaymentStreamContractPrice(BigDecimal data) {
    super(41907, data);
  }

  public UnderlyingPaymentStreamContractPrice(double data) {
    super(41907, BigDecimal.valueOf(data));
  }
}

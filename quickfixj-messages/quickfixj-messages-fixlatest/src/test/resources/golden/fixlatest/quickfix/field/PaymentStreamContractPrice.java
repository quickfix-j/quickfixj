/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamContractPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41190;

  public PaymentStreamContractPrice() {
    super(41190);
  }

  public PaymentStreamContractPrice(BigDecimal data) {
    super(41190, data);
  }

  public PaymentStreamContractPrice(double data) {
    super(41190, BigDecimal.valueOf(data));
  }
}

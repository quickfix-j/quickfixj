/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStubIndex2RateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40897;

  public PaymentStubIndex2RateSpread() {
    super(40897);
  }

  public PaymentStubIndex2RateSpread(BigDecimal data) {
    super(40897, data);
  }

  public PaymentStubIndex2RateSpread(double data) {
    super(40897, BigDecimal.valueOf(data));
  }
}

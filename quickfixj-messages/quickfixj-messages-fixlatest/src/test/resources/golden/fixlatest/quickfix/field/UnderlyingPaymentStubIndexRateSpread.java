/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStubIndexRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40719;

  public UnderlyingPaymentStubIndexRateSpread() {
    super(40719);
  }

  public UnderlyingPaymentStubIndexRateSpread(BigDecimal data) {
    super(40719, data);
  }

  public UnderlyingPaymentStubIndexRateSpread(double data) {
    super(40719, BigDecimal.valueOf(data));
  }
}

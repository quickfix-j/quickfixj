/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStubIndex2RateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40733;

  public UnderlyingPaymentStubIndex2RateSpread() {
    super(40733);
  }

  public UnderlyingPaymentStubIndex2RateSpread(BigDecimal data) {
    super(40733, data);
  }

  public UnderlyingPaymentStubIndex2RateSpread(double data) {
    super(40733, BigDecimal.valueOf(data));
  }
}

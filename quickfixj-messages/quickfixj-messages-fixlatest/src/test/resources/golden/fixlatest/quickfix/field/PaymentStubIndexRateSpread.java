/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStubIndexRateSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40883;

  public PaymentStubIndexRateSpread() {
    super(40883);
  }

  public PaymentStubIndexRateSpread(BigDecimal data) {
    super(40883, data);
  }

  public PaymentStubIndexRateSpread(double data) {
    super(40883, BigDecimal.valueOf(data));
  }
}

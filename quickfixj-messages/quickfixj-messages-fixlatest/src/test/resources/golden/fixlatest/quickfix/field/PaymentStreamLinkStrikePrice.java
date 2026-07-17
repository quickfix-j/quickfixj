/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PaymentStreamLinkStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42673;

  public PaymentStreamLinkStrikePrice() {
    super(42673);
  }

  public PaymentStreamLinkStrikePrice(BigDecimal data) {
    super(42673, data);
  }

  public PaymentStreamLinkStrikePrice(double data) {
    super(42673, BigDecimal.valueOf(data));
  }
}

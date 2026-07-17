/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPaymentStreamLinkStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42968;

  public UnderlyingPaymentStreamLinkStrikePrice() {
    super(42968);
  }

  public UnderlyingPaymentStreamLinkStrikePrice(BigDecimal data) {
    super(42968, data);
  }

  public UnderlyingPaymentStreamLinkStrikePrice(double data) {
    super(42968, BigDecimal.valueOf(data));
  }
}

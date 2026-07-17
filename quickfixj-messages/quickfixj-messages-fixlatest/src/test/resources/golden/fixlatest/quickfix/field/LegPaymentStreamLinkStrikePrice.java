/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamLinkStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42472;

  public LegPaymentStreamLinkStrikePrice() {
    super(42472);
  }

  public LegPaymentStreamLinkStrikePrice(BigDecimal data) {
    super(42472, data);
  }

  public LegPaymentStreamLinkStrikePrice(double data) {
    super(42472, BigDecimal.valueOf(data));
  }
}

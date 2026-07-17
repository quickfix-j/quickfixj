/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TradingReferencePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1150;

  public TradingReferencePrice() {
    super(1150);
  }

  public TradingReferencePrice(BigDecimal data) {
    super(1150, data);
  }

  public TradingReferencePrice(double data) {
    super(1150, BigDecimal.valueOf(data));
  }
}

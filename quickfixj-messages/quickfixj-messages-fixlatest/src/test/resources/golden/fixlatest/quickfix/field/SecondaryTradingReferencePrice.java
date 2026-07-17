/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SecondaryTradingReferencePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1240;

  public SecondaryTradingReferencePrice() {
    super(1240);
  }

  public SecondaryTradingReferencePrice(BigDecimal data) {
    super(1240, data);
  }

  public SecondaryTradingReferencePrice(double data) {
    super(1240, BigDecimal.valueOf(data));
  }
}

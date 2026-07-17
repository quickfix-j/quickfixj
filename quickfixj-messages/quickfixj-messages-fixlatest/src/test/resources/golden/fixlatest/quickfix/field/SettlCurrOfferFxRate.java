/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlCurrOfferFxRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 657;

  public SettlCurrOfferFxRate() {
    super(657);
  }

  public SettlCurrOfferFxRate(BigDecimal data) {
    super(657, data);
  }

  public SettlCurrOfferFxRate(double data) {
    super(657, BigDecimal.valueOf(data));
  }
}

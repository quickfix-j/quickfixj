/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlCurrBidFxRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 656;

  public SettlCurrBidFxRate() {
    super(656);
  }

  public SettlCurrBidFxRate(BigDecimal data) {
    super(656, data);
  }

  public SettlCurrBidFxRate(double data) {
    super(656, BigDecimal.valueOf(data));
  }
}

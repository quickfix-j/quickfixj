/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStreamCommoditySettlPeriodNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41690;

  public LegStreamCommoditySettlPeriodNotional() {
    super(41690);
  }

  public LegStreamCommoditySettlPeriodNotional(BigDecimal data) {
    super(41690, data);
  }

  public LegStreamCommoditySettlPeriodNotional(double data) {
    super(41690, BigDecimal.valueOf(data));
  }
}

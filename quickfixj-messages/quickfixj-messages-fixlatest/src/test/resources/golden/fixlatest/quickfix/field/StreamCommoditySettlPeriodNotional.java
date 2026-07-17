/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StreamCommoditySettlPeriodNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41293;

  public StreamCommoditySettlPeriodNotional() {
    super(41293);
  }

  public StreamCommoditySettlPeriodNotional(BigDecimal data) {
    super(41293, data);
  }

  public StreamCommoditySettlPeriodNotional(double data) {
    super(41293, BigDecimal.valueOf(data));
  }
}

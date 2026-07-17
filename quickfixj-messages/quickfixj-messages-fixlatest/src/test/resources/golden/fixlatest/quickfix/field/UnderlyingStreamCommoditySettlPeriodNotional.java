/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStreamCommoditySettlPeriodNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42006;

  public UnderlyingStreamCommoditySettlPeriodNotional() {
    super(42006);
  }

  public UnderlyingStreamCommoditySettlPeriodNotional(BigDecimal data) {
    super(42006, data);
  }

  public UnderlyingStreamCommoditySettlPeriodNotional(double data) {
    super(42006, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StreamCommoditySettlPeriodPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41297;

  public StreamCommoditySettlPeriodPrice() {
    super(41297);
  }

  public StreamCommoditySettlPeriodPrice(BigDecimal data) {
    super(41297, data);
  }

  public StreamCommoditySettlPeriodPrice(double data) {
    super(41297, BigDecimal.valueOf(data));
  }
}

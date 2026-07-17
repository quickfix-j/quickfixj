/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStreamCommoditySettlPeriodPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41694;

  public LegStreamCommoditySettlPeriodPrice() {
    super(41694);
  }

  public LegStreamCommoditySettlPeriodPrice(BigDecimal data) {
    super(41694, data);
  }

  public LegStreamCommoditySettlPeriodPrice(double data) {
    super(41694, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStreamCommoditySettlPeriodPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42010;

  public UnderlyingStreamCommoditySettlPeriodPrice() {
    super(42010);
  }

  public UnderlyingStreamCommoditySettlPeriodPrice(BigDecimal data) {
    super(42010, data);
  }

  public UnderlyingStreamCommoditySettlPeriodPrice(double data) {
    super(42010, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TradeAllocAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1846;

  public TradeAllocAmt() {
    super(1846);
  }

  public TradeAllocAmt(BigDecimal data) {
    super(1846, data);
  }

  public TradeAllocAmt(double data) {
    super(1846, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegTotalTradeQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2357;

  public LegTotalTradeQty() {
    super(2357);
  }

  public LegTotalTradeQty(BigDecimal data) {
    super(2357, data);
  }

  public LegTotalTradeQty(double data) {
    super(2357, BigDecimal.valueOf(data));
  }
}

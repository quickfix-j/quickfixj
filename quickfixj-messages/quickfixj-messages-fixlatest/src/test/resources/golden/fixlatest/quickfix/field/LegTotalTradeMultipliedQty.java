/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegTotalTradeMultipliedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2360;

  public LegTotalTradeMultipliedQty() {
    super(2360);
  }

  public LegTotalTradeMultipliedQty(BigDecimal data) {
    super(2360, data);
  }

  public LegTotalTradeMultipliedQty(double data) {
    super(2360, BigDecimal.valueOf(data));
  }
}

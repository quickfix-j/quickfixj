/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegTotalGrossTradeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2359;

  public LegTotalGrossTradeAmt() {
    super(2359);
  }

  public LegTotalGrossTradeAmt(BigDecimal data) {
    super(2359, data);
  }

  public LegTotalGrossTradeAmt(double data) {
    super(2359, BigDecimal.valueOf(data));
  }
}

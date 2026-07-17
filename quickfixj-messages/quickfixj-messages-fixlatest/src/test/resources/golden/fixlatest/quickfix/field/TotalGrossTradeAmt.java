/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalGrossTradeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2369;

  public TotalGrossTradeAmt() {
    super(2369);
  }

  public TotalGrossTradeAmt(BigDecimal data) {
    super(2369, data);
  }

  public TotalGrossTradeAmt(double data) {
    super(2369, BigDecimal.valueOf(data));
  }
}

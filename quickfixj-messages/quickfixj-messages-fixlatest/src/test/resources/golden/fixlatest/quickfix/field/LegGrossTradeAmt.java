/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegGrossTradeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1075;

  public LegGrossTradeAmt() {
    super(1075);
  }

  public LegGrossTradeAmt(BigDecimal data) {
    super(1075, data);
  }

  public LegGrossTradeAmt(double data) {
    super(1075, BigDecimal.valueOf(data));
  }
}

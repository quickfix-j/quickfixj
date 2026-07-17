/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocGrossTradeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2300;

  public AllocGrossTradeAmt() {
    super(2300);
  }

  public AllocGrossTradeAmt(BigDecimal data) {
    super(2300, data);
  }

  public AllocGrossTradeAmt(double data) {
    super(2300, BigDecimal.valueOf(data));
  }
}

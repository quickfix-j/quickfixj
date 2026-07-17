/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class GrossTradeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 381;

  public GrossTradeAmt() {
    super(381);
  }

  public GrossTradeAmt(BigDecimal data) {
    super(381, data);
  }

  public GrossTradeAmt(double data) {
    super(381, BigDecimal.valueOf(data));
  }
}

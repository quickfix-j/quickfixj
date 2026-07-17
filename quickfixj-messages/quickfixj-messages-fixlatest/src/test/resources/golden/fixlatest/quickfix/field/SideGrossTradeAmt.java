/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideGrossTradeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1072;

  public SideGrossTradeAmt() {
    super(1072);
  }

  public SideGrossTradeAmt(BigDecimal data) {
    super(1072, data);
  }

  public SideGrossTradeAmt(double data) {
    super(1072, BigDecimal.valueOf(data));
  }
}

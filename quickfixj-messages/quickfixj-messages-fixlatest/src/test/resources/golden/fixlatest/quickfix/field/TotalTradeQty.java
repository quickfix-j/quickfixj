/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalTradeQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2367;

  public TotalTradeQty() {
    super(2367);
  }

  public TotalTradeQty(BigDecimal data) {
    super(2367, data);
  }

  public TotalTradeQty(double data) {
    super(2367, BigDecimal.valueOf(data));
  }
}

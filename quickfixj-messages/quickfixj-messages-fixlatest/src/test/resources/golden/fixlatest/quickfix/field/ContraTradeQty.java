/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ContraTradeQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 437;

  public ContraTradeQty() {
    super(437);
  }

  public ContraTradeQty(BigDecimal data) {
    super(437, data);
  }

  public ContraTradeQty(double data) {
    super(437, BigDecimal.valueOf(data));
  }
}

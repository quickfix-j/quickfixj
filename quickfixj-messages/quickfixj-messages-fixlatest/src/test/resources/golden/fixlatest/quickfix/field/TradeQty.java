/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TradeQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1843;

  public TradeQty() {
    super(1843);
  }

  public TradeQty(BigDecimal data) {
    super(1843, data);
  }

  public TradeQty(double data) {
    super(1843, BigDecimal.valueOf(data));
  }
}

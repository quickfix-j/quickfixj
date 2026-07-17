/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ClearingTradePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1596;

  public ClearingTradePrice() {
    super(1596);
  }

  public ClearingTradePrice(BigDecimal data) {
    super(1596, data);
  }

  public ClearingTradePrice(double data) {
    super(1596, BigDecimal.valueOf(data));
  }
}

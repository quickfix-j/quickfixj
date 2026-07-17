/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalTradeMultipliedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2370;

  public TotalTradeMultipliedQty() {
    super(2370);
  }

  public TotalTradeMultipliedQty(BigDecimal data) {
    super(2370, data);
  }

  public TotalTradeMultipliedQty(double data) {
    super(2370, BigDecimal.valueOf(data));
  }
}

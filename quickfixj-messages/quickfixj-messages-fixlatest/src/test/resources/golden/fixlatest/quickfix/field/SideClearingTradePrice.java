/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideClearingTradePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1597;

  public SideClearingTradePrice() {
    super(1597);
  }

  public SideClearingTradePrice(BigDecimal data) {
    super(1597, data);
  }

  public SideClearingTradePrice(double data) {
    super(1597, BigDecimal.valueOf(data));
  }
}

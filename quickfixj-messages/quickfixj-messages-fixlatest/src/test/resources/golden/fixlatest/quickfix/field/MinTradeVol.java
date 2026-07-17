/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinTradeVol extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 562;

  public MinTradeVol() {
    super(562);
  }

  public MinTradeVol(BigDecimal data) {
    super(562, data);
  }

  public MinTradeVol(double data) {
    super(562, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MaxTradeVol extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1140;

  public MaxTradeVol() {
    super(1140);
  }

  public MaxTradeVol(BigDecimal data) {
    super(1140, data);
  }

  public MaxTradeVol(double data) {
    super(1140, BigDecimal.valueOf(data));
  }
}

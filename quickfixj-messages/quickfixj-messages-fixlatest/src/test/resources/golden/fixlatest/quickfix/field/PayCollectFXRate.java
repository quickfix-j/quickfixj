/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PayCollectFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2094;

  public PayCollectFXRate() {
    super(2094);
  }

  public PayCollectFXRate(BigDecimal data) {
    super(2094, data);
  }

  public PayCollectFXRate(double data) {
    super(2094, BigDecimal.valueOf(data));
  }
}

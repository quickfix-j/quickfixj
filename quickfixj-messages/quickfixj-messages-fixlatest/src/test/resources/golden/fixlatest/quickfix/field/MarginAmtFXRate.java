/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MarginAmtFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2088;

  public MarginAmtFXRate() {
    super(2088);
  }

  public MarginAmtFXRate(BigDecimal data) {
    super(2088, data);
  }

  public MarginAmtFXRate(double data) {
    super(2088, BigDecimal.valueOf(data));
  }
}

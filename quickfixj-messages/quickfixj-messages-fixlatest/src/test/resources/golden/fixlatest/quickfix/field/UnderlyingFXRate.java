/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1045;

  public UnderlyingFXRate() {
    super(1045);
  }

  public UnderlyingFXRate(BigDecimal data) {
    super(1045, data);
  }

  public UnderlyingFXRate(double data) {
    super(1045, BigDecimal.valueOf(data));
  }
}

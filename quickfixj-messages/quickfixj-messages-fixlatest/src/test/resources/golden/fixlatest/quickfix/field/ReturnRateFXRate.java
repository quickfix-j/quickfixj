/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReturnRateFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42733;

  public ReturnRateFXRate() {
    super(42733);
  }

  public ReturnRateFXRate(BigDecimal data) {
    super(42733, data);
  }

  public ReturnRateFXRate(double data) {
    super(42733, BigDecimal.valueOf(data));
  }
}

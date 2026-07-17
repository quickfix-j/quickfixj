/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventFixedFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2271;

  public UnderlyingComplexEventFixedFXRate() {
    super(2271);
  }

  public UnderlyingComplexEventFixedFXRate(BigDecimal data) {
    super(2271, data);
  }

  public UnderlyingComplexEventFixedFXRate(double data) {
    super(2271, BigDecimal.valueOf(data));
  }
}

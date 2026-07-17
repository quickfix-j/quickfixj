/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventFixedFXRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2127;

  public ComplexEventFixedFXRate() {
    super(2127);
  }

  public ComplexEventFixedFXRate(BigDecimal data) {
    super(2127, data);
  }

  public ComplexEventFixedFXRate(double data) {
    super(2127, BigDecimal.valueOf(data));
  }
}

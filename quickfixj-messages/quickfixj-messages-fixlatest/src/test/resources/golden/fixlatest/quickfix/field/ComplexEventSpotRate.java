/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2407;

  public ComplexEventSpotRate() {
    super(2407);
  }

  public ComplexEventSpotRate(BigDecimal data) {
    super(2407, data);
  }

  public ComplexEventSpotRate(double data) {
    super(2407, BigDecimal.valueOf(data));
  }
}

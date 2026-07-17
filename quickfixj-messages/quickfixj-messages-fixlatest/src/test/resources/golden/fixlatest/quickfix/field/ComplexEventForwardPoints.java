/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2408;

  public ComplexEventForwardPoints() {
    super(2408);
  }

  public ComplexEventForwardPoints(BigDecimal data) {
    super(2408, data);
  }

  public ComplexEventForwardPoints(double data) {
    super(2408, BigDecimal.valueOf(data));
  }
}

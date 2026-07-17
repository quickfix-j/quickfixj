/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1486;

  public ComplexEventPrice() {
    super(1486);
  }

  public ComplexEventPrice(BigDecimal data) {
    super(1486, data);
  }

  public ComplexEventPrice(double data) {
    super(1486, BigDecimal.valueOf(data));
  }
}

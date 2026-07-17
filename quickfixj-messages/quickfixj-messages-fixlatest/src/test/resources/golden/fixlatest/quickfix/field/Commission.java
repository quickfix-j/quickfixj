/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Commission extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 12;

  public Commission() {
    super(12);
  }

  public Commission(BigDecimal data) {
    super(12, data);
  }

  public Commission(double data) {
    super(12, BigDecimal.valueOf(data));
  }
}

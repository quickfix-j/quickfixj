/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Quantity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 53;

  public Quantity() {
    super(53);
  }

  public Quantity(BigDecimal data) {
    super(53, data);
  }

  public Quantity(double data) {
    super(53, BigDecimal.valueOf(data));
  }
}

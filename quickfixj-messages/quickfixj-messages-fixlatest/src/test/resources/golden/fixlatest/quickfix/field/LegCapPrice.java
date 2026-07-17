/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCapPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2200;

  public LegCapPrice() {
    super(2200);
  }

  public LegCapPrice(BigDecimal data) {
    super(2200, data);
  }

  public LegCapPrice(double data) {
    super(2200, BigDecimal.valueOf(data));
  }
}

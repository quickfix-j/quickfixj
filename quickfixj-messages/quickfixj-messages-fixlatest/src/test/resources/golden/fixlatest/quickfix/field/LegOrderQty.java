/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegOrderQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 685;

  public LegOrderQty() {
    super(685);
  }

  public LegOrderQty(BigDecimal data) {
    super(685, data);
  }

  public LegOrderQty(double data) {
    super(685, BigDecimal.valueOf(data));
  }
}

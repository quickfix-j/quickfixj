/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DayCumQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 425;

  public DayCumQty() {
    super(425);
  }

  public DayCumQty(BigDecimal data) {
    super(425, data);
  }

  public DayCumQty(double data) {
    super(425, BigDecimal.valueOf(data));
  }
}

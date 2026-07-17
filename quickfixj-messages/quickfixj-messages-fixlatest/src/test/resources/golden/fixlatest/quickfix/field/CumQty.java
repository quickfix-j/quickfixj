/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CumQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 14;

  public CumQty() {
    super(14);
  }

  public CumQty(BigDecimal data) {
    super(14, data);
  }

  public CumQty(double data) {
    super(14, BigDecimal.valueOf(data));
  }
}

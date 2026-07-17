/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 879;

  public UnderlyingQty() {
    super(879);
  }

  public UnderlyingQty(BigDecimal data) {
    super(879, data);
  }

  public UnderlyingQty(double data) {
    super(879, BigDecimal.valueOf(data));
  }
}

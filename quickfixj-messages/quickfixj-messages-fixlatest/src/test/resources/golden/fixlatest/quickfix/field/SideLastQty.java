/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideLastQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1009;

  public SideLastQty() {
    super(1009);
  }

  public SideLastQty(BigDecimal data) {
    super(1009, data);
  }

  public SideLastQty(double data) {
    super(1009, BigDecimal.valueOf(data));
  }
}

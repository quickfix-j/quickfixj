/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReleaseQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1811;

  public ReleaseQty() {
    super(1811);
  }

  public ReleaseQty(BigDecimal data) {
    super(1811, data);
  }

  public ReleaseQty(double data) {
    super(1811, BigDecimal.valueOf(data));
  }
}

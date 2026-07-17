/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CoverPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1917;

  public CoverPrice() {
    super(1917);
  }

  public CoverPrice(BigDecimal data) {
    super(1917, data);
  }

  public CoverPrice(double data) {
    super(1917, BigDecimal.valueOf(data));
  }
}

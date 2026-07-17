/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ShortQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 705;

  public ShortQty() {
    super(705);
  }

  public ShortQty(BigDecimal data) {
    super(705, data);
  }

  public ShortQty(double data) {
    super(705, BigDecimal.valueOf(data));
  }
}

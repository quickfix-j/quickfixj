/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastMultipliedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2368;

  public LastMultipliedQty() {
    super(2368);
  }

  public LastMultipliedQty(BigDecimal data) {
    super(2368, data);
  }

  public LastMultipliedQty(double data) {
    super(2368, BigDecimal.valueOf(data));
  }
}

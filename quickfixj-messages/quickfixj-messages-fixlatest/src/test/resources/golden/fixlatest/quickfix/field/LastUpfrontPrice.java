/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastUpfrontPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1743;

  public LastUpfrontPrice() {
    super(1743);
  }

  public LastUpfrontPrice(BigDecimal data) {
    super(1743, data);
  }

  public LastUpfrontPrice(double data) {
    super(1743, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UpfrontPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1742;

  public UpfrontPrice() {
    super(1742);
  }

  public UpfrontPrice(BigDecimal data) {
    super(1742, data);
  }

  public UpfrontPrice(double data) {
    super(1742, BigDecimal.valueOf(data));
  }
}

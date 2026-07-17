/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CapPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1199;

  public CapPrice() {
    super(1199);
  }

  public CapPrice(BigDecimal data) {
    super(1199, data);
  }

  public CapPrice(double data) {
    super(1199, BigDecimal.valueOf(data));
  }
}

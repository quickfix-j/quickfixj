/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class VersusPurchasePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1754;

  public VersusPurchasePrice() {
    super(1754);
  }

  public VersusPurchasePrice(BigDecimal data) {
    super(1754, data);
  }

  public VersusPurchasePrice(double data) {
    super(1754, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegVersusPurchasePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1758;

  public LegVersusPurchasePrice() {
    super(1758);
  }

  public LegVersusPurchasePrice(BigDecimal data) {
    super(1758, data);
  }

  public LegVersusPurchasePrice(double data) {
    super(1758, BigDecimal.valueOf(data));
  }
}

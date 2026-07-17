/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CoveredQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1654;

  public CoveredQty() {
    super(1654);
  }

  public CoveredQty(BigDecimal data) {
    super(1654, data);
  }

  public CoveredQty(double data) {
    super(1654, BigDecimal.valueOf(data));
  }
}

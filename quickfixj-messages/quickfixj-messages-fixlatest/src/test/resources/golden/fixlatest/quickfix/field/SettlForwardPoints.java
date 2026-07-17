/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2365;

  public SettlForwardPoints() {
    super(2365);
  }

  public SettlForwardPoints(BigDecimal data) {
    super(2365, data);
  }

  public SettlForwardPoints(double data) {
    super(2365, BigDecimal.valueOf(data));
  }
}

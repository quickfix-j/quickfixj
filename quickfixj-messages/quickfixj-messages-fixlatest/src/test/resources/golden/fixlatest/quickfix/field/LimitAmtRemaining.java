/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LimitAmtRemaining extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1633;

  public LimitAmtRemaining() {
    super(1633);
  }

  public LimitAmtRemaining(BigDecimal data) {
    super(1633, data);
  }

  public LimitAmtRemaining(double data) {
    super(1633, BigDecimal.valueOf(data));
  }
}

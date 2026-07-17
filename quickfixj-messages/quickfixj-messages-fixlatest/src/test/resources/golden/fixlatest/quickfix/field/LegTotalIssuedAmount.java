/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegTotalIssuedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2162;

  public LegTotalIssuedAmount() {
    super(2162);
  }

  public LegTotalIssuedAmount(BigDecimal data) {
    super(2162, data);
  }

  public LegTotalIssuedAmount(double data) {
    super(2162, BigDecimal.valueOf(data));
  }
}

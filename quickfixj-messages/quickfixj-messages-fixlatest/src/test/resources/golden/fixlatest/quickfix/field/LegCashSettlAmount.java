/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegCashSettlAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41357;

  public LegCashSettlAmount() {
    super(41357);
  }

  public LegCashSettlAmount(BigDecimal data) {
    super(41357, data);
  }

  public LegCashSettlAmount(double data) {
    super(41357, BigDecimal.valueOf(data));
  }
}

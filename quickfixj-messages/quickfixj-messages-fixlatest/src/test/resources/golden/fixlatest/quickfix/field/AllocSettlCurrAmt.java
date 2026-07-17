/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocSettlCurrAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 737;

  public AllocSettlCurrAmt() {
    super(737);
  }

  public AllocSettlCurrAmt(BigDecimal data) {
    super(737, data);
  }

  public AllocSettlCurrAmt(double data) {
    super(737, BigDecimal.valueOf(data));
  }
}

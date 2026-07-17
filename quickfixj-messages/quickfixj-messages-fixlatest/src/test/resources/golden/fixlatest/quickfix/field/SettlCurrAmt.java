/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlCurrAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 119;

  public SettlCurrAmt() {
    super(119);
  }

  public SettlCurrAmt(BigDecimal data) {
    super(119, data);
  }

  public SettlCurrAmt(double data) {
    super(119, BigDecimal.valueOf(data));
  }
}

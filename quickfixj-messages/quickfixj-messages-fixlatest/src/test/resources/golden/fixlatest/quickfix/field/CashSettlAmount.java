/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CashSettlAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40034;

  public CashSettlAmount() {
    super(40034);
  }

  public CashSettlAmount(BigDecimal data) {
    super(40034, data);
  }

  public CashSettlAmount(double data) {
    super(40034, BigDecimal.valueOf(data));
  }
}

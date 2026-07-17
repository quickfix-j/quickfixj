/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CashSettlMinimumQuoteAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40030;

  public CashSettlMinimumQuoteAmount() {
    super(40030);
  }

  public CashSettlMinimumQuoteAmount(BigDecimal data) {
    super(40030, data);
  }

  public CashSettlMinimumQuoteAmount(double data) {
    super(40030, BigDecimal.valueOf(data));
  }
}

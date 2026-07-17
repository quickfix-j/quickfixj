/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCashSettlQuoteAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42049;

  public UnderlyingCashSettlQuoteAmount() {
    super(42049);
  }

  public UnderlyingCashSettlQuoteAmount(BigDecimal data) {
    super(42049, data);
  }

  public UnderlyingCashSettlQuoteAmount(double data) {
    super(42049, BigDecimal.valueOf(data));
  }
}

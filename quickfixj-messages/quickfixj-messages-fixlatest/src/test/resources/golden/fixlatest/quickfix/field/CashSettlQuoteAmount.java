/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CashSettlQuoteAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40028;

  public CashSettlQuoteAmount() {
    super(40028);
  }

  public CashSettlQuoteAmount(BigDecimal data) {
    super(40028, data);
  }

  public CashSettlQuoteAmount(double data) {
    super(40028, BigDecimal.valueOf(data));
  }
}

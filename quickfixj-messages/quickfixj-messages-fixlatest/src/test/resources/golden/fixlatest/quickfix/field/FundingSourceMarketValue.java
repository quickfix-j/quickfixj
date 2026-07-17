/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FundingSourceMarketValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2848;

  public FundingSourceMarketValue() {
    super(2848);
  }

  public FundingSourceMarketValue(BigDecimal data) {
    super(2848, data);
  }

  public FundingSourceMarketValue(double data) {
    super(2848, BigDecimal.valueOf(data));
  }
}

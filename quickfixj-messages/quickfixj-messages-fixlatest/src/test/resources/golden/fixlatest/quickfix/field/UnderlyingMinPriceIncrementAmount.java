/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingMinPriceIncrementAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2027;

  public UnderlyingMinPriceIncrementAmount() {
    super(2027);
  }

  public UnderlyingMinPriceIncrementAmount(BigDecimal data) {
    super(2027, data);
  }

  public UnderlyingMinPriceIncrementAmount(double data) {
    super(2027, BigDecimal.valueOf(data));
  }
}

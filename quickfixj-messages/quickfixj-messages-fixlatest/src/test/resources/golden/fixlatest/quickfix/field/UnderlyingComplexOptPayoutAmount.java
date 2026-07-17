/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexOptPayoutAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2047;

  public UnderlyingComplexOptPayoutAmount() {
    super(2047);
  }

  public UnderlyingComplexOptPayoutAmount(BigDecimal data) {
    super(2047, data);
  }

  public UnderlyingComplexOptPayoutAmount(double data) {
    super(2047, BigDecimal.valueOf(data));
  }
}

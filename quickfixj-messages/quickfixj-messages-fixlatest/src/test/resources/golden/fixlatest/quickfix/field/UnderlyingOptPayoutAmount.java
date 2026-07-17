/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingOptPayoutAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2029;

  public UnderlyingOptPayoutAmount() {
    super(2029);
  }

  public UnderlyingOptPayoutAmount(BigDecimal data) {
    super(2029, data);
  }

  public UnderlyingOptPayoutAmount(double data) {
    super(2029, BigDecimal.valueOf(data));
  }
}

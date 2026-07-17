/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OptPayoutAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1195;

  public OptPayoutAmount() {
    super(1195);
  }

  public OptPayoutAmount(BigDecimal data) {
    super(1195, data);
  }

  public OptPayoutAmount(double data) {
    super(1195, BigDecimal.valueOf(data));
  }
}

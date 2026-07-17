/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MiscFeeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 137;

  public MiscFeeAmt() {
    super(137);
  }

  public MiscFeeAmt(BigDecimal data) {
    super(137, data);
  }

  public MiscFeeAmt(double data) {
    super(137, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MiscFeeAmountDue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2217;

  public MiscFeeAmountDue() {
    super(2217);
  }

  public MiscFeeAmountDue(BigDecimal data) {
    super(2217, data);
  }

  public MiscFeeAmountDue(double data) {
    super(2217, BigDecimal.valueOf(data));
  }
}

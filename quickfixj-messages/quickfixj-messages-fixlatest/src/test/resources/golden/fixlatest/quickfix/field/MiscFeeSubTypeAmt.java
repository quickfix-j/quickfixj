/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MiscFeeSubTypeAmt extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2635;

  public MiscFeeSubTypeAmt() {
    super(2635);
  }

  public MiscFeeSubTypeAmt(BigDecimal data) {
    super(2635, data);
  }

  public MiscFeeSubTypeAmt(double data) {
    super(2635, BigDecimal.valueOf(data));
  }
}

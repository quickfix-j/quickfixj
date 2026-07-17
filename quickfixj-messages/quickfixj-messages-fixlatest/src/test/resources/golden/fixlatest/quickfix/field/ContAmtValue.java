/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ContAmtValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 520;

  public ContAmtValue() {
    super(520);
  }

  public ContAmtValue(BigDecimal data) {
    super(520, data);
  }

  public ContAmtValue(double data) {
    super(520, BigDecimal.valueOf(data));
  }
}

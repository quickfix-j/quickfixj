/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexOptPayoutAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1485;

  public ComplexOptPayoutAmount() {
    super(1485);
  }

  public ComplexOptPayoutAmount(BigDecimal data) {
    super(1485, data);
  }

  public ComplexOptPayoutAmount(double data) {
    super(1485, BigDecimal.valueOf(data));
  }
}

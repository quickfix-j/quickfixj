/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeOptPayAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1225;

  public DerivativeOptPayAmount() {
    super(1225);
  }

  public DerivativeOptPayAmount(BigDecimal data) {
    super(1225, data);
  }

  public DerivativeOptPayAmount(double data) {
    super(1225, BigDecimal.valueOf(data));
  }
}

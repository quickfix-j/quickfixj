/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SharedCommission extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 858;

  public SharedCommission() {
    super(858);
  }

  public SharedCommission(BigDecimal data) {
    super(858, data);
  }

  public SharedCommission(double data) {
    super(858, BigDecimal.valueOf(data));
  }
}

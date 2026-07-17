/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2614;

  public UnderlyingNotional() {
    super(2614);
  }

  public UnderlyingNotional(BigDecimal data) {
    super(2614, data);
  }

  public UnderlyingNotional(double data) {
    super(2614, BigDecimal.valueOf(data));
  }
}

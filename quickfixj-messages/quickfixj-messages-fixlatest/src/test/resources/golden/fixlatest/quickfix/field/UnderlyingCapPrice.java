/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCapPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2033;

  public UnderlyingCapPrice() {
    super(2033);
  }

  public UnderlyingCapPrice(BigDecimal data) {
    super(2033, data);
  }

  public UnderlyingCapPrice(double data) {
    super(2033, BigDecimal.valueOf(data));
  }
}

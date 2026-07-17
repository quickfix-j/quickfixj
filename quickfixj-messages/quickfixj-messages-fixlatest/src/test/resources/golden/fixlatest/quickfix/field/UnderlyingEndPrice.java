/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingEndPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 883;

  public UnderlyingEndPrice() {
    super(883);
  }

  public UnderlyingEndPrice(BigDecimal data) {
    super(883, data);
  }

  public UnderlyingEndPrice(double data) {
    super(883, BigDecimal.valueOf(data));
  }
}

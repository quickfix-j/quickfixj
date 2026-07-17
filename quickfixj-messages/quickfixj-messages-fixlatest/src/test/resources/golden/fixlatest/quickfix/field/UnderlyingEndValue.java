/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingEndValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 886;

  public UnderlyingEndValue() {
    super(886);
  }

  public UnderlyingEndValue(BigDecimal data) {
    super(886, data);
  }

  public UnderlyingEndValue(double data) {
    super(886, BigDecimal.valueOf(data));
  }
}

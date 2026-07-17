/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 246;

  public UnderlyingFactor() {
    super(246);
  }

  public UnderlyingFactor(BigDecimal data) {
    super(246, data);
  }

  public UnderlyingFactor(double data) {
    super(246, BigDecimal.valueOf(data));
  }
}

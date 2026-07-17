/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingLastPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 651;

  public UnderlyingLastPx() {
    super(651);
  }

  public UnderlyingLastPx(BigDecimal data) {
    super(651, data);
  }

  public UnderlyingLastPx(double data) {
    super(651, BigDecimal.valueOf(data));
  }
}

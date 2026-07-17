/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 810;

  public UnderlyingPx() {
    super(810);
  }

  public UnderlyingPx(BigDecimal data) {
    super(810, data);
  }

  public UnderlyingPx(double data) {
    super(810, BigDecimal.valueOf(data));
  }
}

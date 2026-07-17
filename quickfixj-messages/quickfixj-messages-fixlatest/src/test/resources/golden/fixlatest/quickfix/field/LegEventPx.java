/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegEventPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2065;

  public LegEventPx() {
    super(2065);
  }

  public LegEventPx(BigDecimal data) {
    super(2065, data);
  }

  public LegEventPx(double data) {
    super(2065, BigDecimal.valueOf(data));
  }
}

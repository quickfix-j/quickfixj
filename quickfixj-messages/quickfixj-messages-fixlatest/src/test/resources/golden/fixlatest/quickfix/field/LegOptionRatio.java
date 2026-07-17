/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegOptionRatio extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1017;

  public LegOptionRatio() {
    super(1017);
  }

  public LegOptionRatio(BigDecimal data) {
    super(1017, data);
  }

  public LegOptionRatio(double data) {
    super(1017, BigDecimal.valueOf(data));
  }
}

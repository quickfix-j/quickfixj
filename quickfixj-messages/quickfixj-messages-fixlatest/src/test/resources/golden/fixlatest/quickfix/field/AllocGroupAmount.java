/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocGroupAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2761;

  public AllocGroupAmount() {
    super(2761);
  }

  public AllocGroupAmount(BigDecimal data) {
    super(2761, data);
  }

  public AllocGroupAmount(double data) {
    super(2761, BigDecimal.valueOf(data));
  }
}

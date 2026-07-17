/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MidPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 631;

  public MidPx() {
    super(631);
  }

  public MidPx(BigDecimal data) {
    super(631, data);
  }

  public MidPx(double data) {
    super(631, BigDecimal.valueOf(data));
  }
}

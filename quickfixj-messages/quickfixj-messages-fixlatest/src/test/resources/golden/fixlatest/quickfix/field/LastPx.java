/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 31;

  public LastPx() {
    super(31);
  }

  public LastPx(BigDecimal data) {
    super(31, data);
  }

  public LastPx(double data) {
    super(31, BigDecimal.valueOf(data));
  }
}

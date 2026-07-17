/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class HighPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 332;

  public HighPx() {
    super(332);
  }

  public HighPx(BigDecimal data) {
    super(332, data);
  }

  public HighPx(double data) {
    super(332, BigDecimal.valueOf(data));
  }
}

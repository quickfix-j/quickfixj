/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FillPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1364;

  public FillPx() {
    super(1364);
  }

  public FillPx(BigDecimal data) {
    super(1364, data);
  }

  public FillPx(double data) {
    super(1364, BigDecimal.valueOf(data));
  }
}

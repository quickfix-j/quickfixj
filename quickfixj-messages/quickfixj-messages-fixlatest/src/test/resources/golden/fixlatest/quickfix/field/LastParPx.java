/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastParPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 669;

  public LastParPx() {
    super(669);
  }

  public LastParPx(BigDecimal data) {
    super(669, data);
  }

  public LastParPx(double data) {
    super(669, BigDecimal.valueOf(data));
  }
}

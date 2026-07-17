/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 133;

  public OfferPx() {
    super(133);
  }

  public OfferPx(BigDecimal data) {
    super(133, data);
  }

  public OfferPx(double data) {
    super(133, BigDecimal.valueOf(data));
  }
}

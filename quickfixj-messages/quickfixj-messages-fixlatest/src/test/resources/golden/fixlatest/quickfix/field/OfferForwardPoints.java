/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 191;

  public OfferForwardPoints() {
    super(191);
  }

  public OfferForwardPoints(BigDecimal data) {
    super(191, data);
  }

  public OfferForwardPoints(double data) {
    super(191, BigDecimal.valueOf(data));
  }
}

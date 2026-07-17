/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferSwapPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1066;

  public OfferSwapPoints() {
    super(1066);
  }

  public OfferSwapPoints(BigDecimal data) {
    super(1066, data);
  }

  public OfferSwapPoints(double data) {
    super(1066, BigDecimal.valueOf(data));
  }
}

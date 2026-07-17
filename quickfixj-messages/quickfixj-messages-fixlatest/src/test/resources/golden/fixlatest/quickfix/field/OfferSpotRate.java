/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 190;

  public OfferSpotRate() {
    super(190);
  }

  public OfferSpotRate(BigDecimal data) {
    super(190, data);
  }

  public OfferSpotRate(double data) {
    super(190, BigDecimal.valueOf(data));
  }
}

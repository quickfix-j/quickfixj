/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2534;

  public OfferSpread() {
    super(2534);
  }

  public OfferSpread(BigDecimal data) {
    super(2534, data);
  }

  public OfferSpread(double data) {
    super(2534, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegOfferPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 684;

  public LegOfferPx() {
    super(684);
  }

  public LegOfferPx(BigDecimal data) {
    super(684, data);
  }

  public LegOfferPx(double data) {
    super(684, BigDecimal.valueOf(data));
  }
}

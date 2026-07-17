/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegOfferForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1068;

  public LegOfferForwardPoints() {
    super(1068);
  }

  public LegOfferForwardPoints(BigDecimal data) {
    super(1068, data);
  }

  public LegOfferForwardPoints(double data) {
    super(1068, BigDecimal.valueOf(data));
  }
}

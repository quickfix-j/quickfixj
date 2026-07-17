/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferForwardPoints2 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 643;

  public OfferForwardPoints2() {
    super(643);
  }

  public OfferForwardPoints2(BigDecimal data) {
    super(643, data);
  }

  public OfferForwardPoints2(double data) {
    super(643, BigDecimal.valueOf(data));
  }
}

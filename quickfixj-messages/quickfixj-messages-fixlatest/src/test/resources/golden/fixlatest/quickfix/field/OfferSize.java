/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OfferSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 135;

  public OfferSize() {
    super(135);
  }

  public OfferSize(BigDecimal data) {
    super(135, data);
  }

  public OfferSize(double data) {
    super(135, BigDecimal.valueOf(data));
  }
}

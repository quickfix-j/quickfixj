/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalOfferSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1750;

  public TotalOfferSize() {
    super(1750);
  }

  public TotalOfferSize(BigDecimal data) {
    super(1750, data);
  }

  public TotalOfferSize(double data) {
    super(1750, BigDecimal.valueOf(data));
  }
}

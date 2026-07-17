/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriceMarkup extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2762;

  public PriceMarkup() {
    super(2762);
  }

  public PriceMarkup(BigDecimal data) {
    super(2762, data);
  }

  public PriceMarkup(double data) {
    super(2762, BigDecimal.valueOf(data));
  }
}

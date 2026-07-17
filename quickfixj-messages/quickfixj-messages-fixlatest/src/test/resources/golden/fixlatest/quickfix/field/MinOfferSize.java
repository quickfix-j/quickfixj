/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinOfferSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 648;

  public MinOfferSize() {
    super(648);
  }

  public MinOfferSize(BigDecimal data) {
    super(648, data);
  }

  public MinOfferSize(double data) {
    super(648, BigDecimal.valueOf(data));
  }
}

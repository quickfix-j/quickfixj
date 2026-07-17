/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MktOfferPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 646;

  public MktOfferPx() {
    super(646);
  }

  public MktOfferPx(BigDecimal data) {
    super(646, data);
  }

  public MktOfferPx(double data) {
    super(646, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DefOfferSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 294;

  public DefOfferSize() {
    super(294);
  }

  public DefOfferSize(BigDecimal data) {
    super(294, data);
  }

  public DefOfferSize(double data) {
    super(294, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RelatedLowPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1820;

  public RelatedLowPrice() {
    super(1820);
  }

  public RelatedLowPrice(BigDecimal data) {
    super(1820, data);
  }

  public RelatedLowPrice(double data) {
    super(1820, BigDecimal.valueOf(data));
  }
}

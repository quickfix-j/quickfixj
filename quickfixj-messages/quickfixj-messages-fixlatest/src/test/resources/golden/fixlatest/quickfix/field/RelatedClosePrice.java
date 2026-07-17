/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RelatedClosePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2589;

  public RelatedClosePrice() {
    super(2589);
  }

  public RelatedClosePrice(BigDecimal data) {
    super(2589, data);
  }

  public RelatedClosePrice(double data) {
    super(2589, BigDecimal.valueOf(data));
  }
}

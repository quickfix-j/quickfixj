/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RelatedHighPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1819;

  public RelatedHighPrice() {
    super(1819);
  }

  public RelatedHighPrice(BigDecimal data) {
    super(1819, data);
  }

  public RelatedHighPrice(double data) {
    super(1819, BigDecimal.valueOf(data));
  }
}

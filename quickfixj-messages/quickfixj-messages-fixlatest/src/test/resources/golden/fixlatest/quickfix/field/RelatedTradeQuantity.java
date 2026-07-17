/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RelatedTradeQuantity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1860;

  public RelatedTradeQuantity() {
    super(1860);
  }

  public RelatedTradeQuantity(BigDecimal data) {
    super(1860, data);
  }

  public RelatedTradeQuantity(double data) {
    super(1860, BigDecimal.valueOf(data));
  }
}

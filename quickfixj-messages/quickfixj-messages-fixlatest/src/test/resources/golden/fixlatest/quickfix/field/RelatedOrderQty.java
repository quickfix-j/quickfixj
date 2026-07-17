/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RelatedOrderQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2889;

  public RelatedOrderQty() {
    super(2889);
  }

  public RelatedOrderQty(BigDecimal data) {
    super(2889, data);
  }

  public RelatedOrderQty(double data) {
    super(2889, BigDecimal.valueOf(data));
  }
}

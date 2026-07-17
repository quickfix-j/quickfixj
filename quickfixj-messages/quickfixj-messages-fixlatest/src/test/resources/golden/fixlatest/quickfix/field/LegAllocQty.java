/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegAllocQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 673;

  public LegAllocQty() {
    super(673);
  }

  public LegAllocQty(BigDecimal data) {
    super(673, data);
  }

  public LegAllocQty(double data) {
    super(673, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AggregatedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2789;

  public AggregatedQty() {
    super(2789);
  }

  public AggregatedQty(BigDecimal data) {
    super(2789, data);
  }

  public AggregatedQty(double data) {
    super(2789, BigDecimal.valueOf(data));
  }
}

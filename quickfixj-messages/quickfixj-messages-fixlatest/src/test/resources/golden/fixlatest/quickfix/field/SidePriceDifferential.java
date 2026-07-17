/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SidePriceDifferential extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1599;

  public SidePriceDifferential() {
    super(1599);
  }

  public SidePriceDifferential(BigDecimal data) {
    super(1599, data);
  }

  public SidePriceDifferential(double data) {
    super(1599, BigDecimal.valueOf(data));
  }
}

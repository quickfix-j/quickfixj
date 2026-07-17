/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PriceDelta extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 811;

  public PriceDelta() {
    super(811);
  }

  public PriceDelta(BigDecimal data) {
    super(811, data);
  }

  public PriceDelta(double data) {
    super(811, BigDecimal.valueOf(data));
  }
}

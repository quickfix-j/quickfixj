/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PosAmtPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2876;

  public PosAmtPrice() {
    super(2876);
  }

  public PosAmtPrice(BigDecimal data) {
    super(2876, data);
  }

  public PosAmtPrice(double data) {
    super(2876, BigDecimal.valueOf(data));
  }
}

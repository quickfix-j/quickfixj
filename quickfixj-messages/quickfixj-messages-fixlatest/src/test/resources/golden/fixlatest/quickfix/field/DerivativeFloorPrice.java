/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DerivativeFloorPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1322;

  public DerivativeFloorPrice() {
    super(1322);
  }

  public DerivativeFloorPrice(BigDecimal data) {
    super(1322, data);
  }

  public DerivativeFloorPrice(double data) {
    super(1322, BigDecimal.valueOf(data));
  }
}

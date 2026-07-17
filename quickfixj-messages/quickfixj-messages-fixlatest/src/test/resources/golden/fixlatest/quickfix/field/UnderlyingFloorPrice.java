/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingFloorPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2034;

  public UnderlyingFloorPrice() {
    super(2034);
  }

  public UnderlyingFloorPrice(BigDecimal data) {
    super(2034, data);
  }

  public UnderlyingFloorPrice(double data) {
    super(2034, BigDecimal.valueOf(data));
  }
}

/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegFloorPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2201;

  public LegFloorPrice() {
    super(2201);
  }

  public LegFloorPrice(BigDecimal data) {
    super(2201, data);
  }

  public LegFloorPrice(double data) {
    super(2201, BigDecimal.valueOf(data));
  }
}

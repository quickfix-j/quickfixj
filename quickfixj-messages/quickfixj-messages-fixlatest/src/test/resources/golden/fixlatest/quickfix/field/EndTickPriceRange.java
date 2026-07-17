/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class EndTickPriceRange extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1207;

  public EndTickPriceRange() {
    super(1207);
  }

  public EndTickPriceRange(BigDecimal data) {
    super(1207, data);
  }

  public EndTickPriceRange(double data) {
    super(1207, BigDecimal.valueOf(data));
  }
}

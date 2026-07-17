/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StartTickPriceRange extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1206;

  public StartTickPriceRange() {
    super(1206);
  }

  public StartTickPriceRange(BigDecimal data) {
    super(1206, data);
  }

  public StartTickPriceRange(double data) {
    super(1206, BigDecimal.valueOf(data));
  }
}

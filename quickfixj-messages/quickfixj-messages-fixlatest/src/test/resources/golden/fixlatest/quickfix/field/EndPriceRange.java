/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class EndPriceRange extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2552;

  public EndPriceRange() {
    super(2552);
  }

  public EndPriceRange(BigDecimal data) {
    super(2552, data);
  }

  public EndPriceRange(double data) {
    super(2552, BigDecimal.valueOf(data));
  }
}

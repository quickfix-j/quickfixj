/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StartPriceRange extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2551;

  public StartPriceRange() {
    super(2551);
  }

  public StartPriceRange(BigDecimal data) {
    super(2551, data);
  }

  public StartPriceRange(double data) {
    super(2551, BigDecimal.valueOf(data));
  }
}

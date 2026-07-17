/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class VegaMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2583;

  public VegaMultiplier() {
    super(2583);
  }

  public VegaMultiplier(BigDecimal data) {
    super(2583, data);
  }

  public VegaMultiplier(double data) {
    super(2583, BigDecimal.valueOf(data));
  }
}

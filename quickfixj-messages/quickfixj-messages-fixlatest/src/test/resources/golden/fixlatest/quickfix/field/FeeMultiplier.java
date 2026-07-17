/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FeeMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1329;

  public FeeMultiplier() {
    super(1329);
  }

  public FeeMultiplier(BigDecimal data) {
    super(1329, data);
  }

  public FeeMultiplier(double data) {
    super(1329, BigDecimal.valueOf(data));
  }
}

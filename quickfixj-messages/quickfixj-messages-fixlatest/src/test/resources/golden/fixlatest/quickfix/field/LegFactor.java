/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 253;

  public LegFactor() {
    super(253);
  }

  public LegFactor(BigDecimal data) {
    super(253, data);
  }

  public LegFactor(double data) {
    super(253, BigDecimal.valueOf(data));
  }
}

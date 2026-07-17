/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MaxPriceVariation extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1143;

  public MaxPriceVariation() {
    super(1143);
  }

  public MaxPriceVariation(BigDecimal data) {
    super(1143, data);
  }

  public MaxPriceVariation(double data) {
    super(1143, BigDecimal.valueOf(data));
  }
}

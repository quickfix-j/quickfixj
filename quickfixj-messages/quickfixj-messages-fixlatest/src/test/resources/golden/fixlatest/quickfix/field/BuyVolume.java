/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BuyVolume extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 330;

  public BuyVolume() {
    super(330);
  }

  public BuyVolume(BigDecimal data) {
    super(330, data);
  }

  public BuyVolume(double data) {
    super(330, BigDecimal.valueOf(data));
  }
}

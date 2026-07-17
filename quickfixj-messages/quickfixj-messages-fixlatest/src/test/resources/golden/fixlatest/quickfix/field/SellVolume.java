/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SellVolume extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 331;

  public SellVolume() {
    super(331);
  }

  public SellVolume(BigDecimal data) {
    super(331, data);
  }

  public SellVolume(double data) {
    super(331, BigDecimal.valueOf(data));
  }
}

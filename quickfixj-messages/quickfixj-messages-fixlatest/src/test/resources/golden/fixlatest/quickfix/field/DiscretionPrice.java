/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DiscretionPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 845;

  public DiscretionPrice() {
    super(845);
  }

  public DiscretionPrice(BigDecimal data) {
    super(845, data);
  }

  public DiscretionPrice(double data) {
    super(845, BigDecimal.valueOf(data));
  }
}

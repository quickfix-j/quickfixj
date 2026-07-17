/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ClearingSettlPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2528;

  public ClearingSettlPrice() {
    super(2528);
  }

  public ClearingSettlPrice(BigDecimal data) {
    super(2528, data);
  }

  public ClearingSettlPrice(double data) {
    super(2528, BigDecimal.valueOf(data));
  }
}

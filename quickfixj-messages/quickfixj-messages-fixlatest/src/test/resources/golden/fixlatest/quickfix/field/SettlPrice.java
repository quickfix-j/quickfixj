/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 730;

  public SettlPrice() {
    super(730);
  }

  public SettlPrice(BigDecimal data) {
    super(730, data);
  }

  public SettlPrice(double data) {
    super(730, BigDecimal.valueOf(data));
  }
}

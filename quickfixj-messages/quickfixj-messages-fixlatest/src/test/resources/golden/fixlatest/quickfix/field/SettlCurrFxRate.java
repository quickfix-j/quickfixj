/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlCurrFxRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 155;

  public SettlCurrFxRate() {
    super(155);
  }

  public SettlCurrFxRate(BigDecimal data) {
    super(155, data);
  }

  public SettlCurrFxRate(double data) {
    super(155, BigDecimal.valueOf(data));
  }
}

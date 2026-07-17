/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamFlatRateAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41550;

  public LegPaymentStreamFlatRateAmount() {
    super(41550);
  }

  public LegPaymentStreamFlatRateAmount(BigDecimal data) {
    super(41550, data);
  }

  public LegPaymentStreamFlatRateAmount(double data) {
    super(41550, BigDecimal.valueOf(data));
  }
}

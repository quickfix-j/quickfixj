/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamContractPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41559;

  public LegPaymentStreamContractPrice() {
    super(41559);
  }

  public LegPaymentStreamContractPrice(BigDecimal data) {
    super(41559, data);
  }

  public LegPaymentStreamContractPrice(double data) {
    super(41559, BigDecimal.valueOf(data));
  }
}

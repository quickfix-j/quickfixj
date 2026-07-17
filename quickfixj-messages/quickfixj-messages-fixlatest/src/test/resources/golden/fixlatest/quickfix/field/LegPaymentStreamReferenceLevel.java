/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegPaymentStreamReferenceLevel extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41569;

  public LegPaymentStreamReferenceLevel() {
    super(41569);
  }

  public LegPaymentStreamReferenceLevel(BigDecimal data) {
    super(41569, data);
  }

  public LegPaymentStreamReferenceLevel(double data) {
    super(41569, BigDecimal.valueOf(data));
  }
}

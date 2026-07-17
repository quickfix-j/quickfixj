/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDeliveryStreamNotionalConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41797;

  public UnderlyingDeliveryStreamNotionalConversionFactor() {
    super(41797);
  }

  public UnderlyingDeliveryStreamNotionalConversionFactor(BigDecimal data) {
    super(41797, data);
  }

  public UnderlyingDeliveryStreamNotionalConversionFactor(double data) {
    super(41797, BigDecimal.valueOf(data));
  }
}

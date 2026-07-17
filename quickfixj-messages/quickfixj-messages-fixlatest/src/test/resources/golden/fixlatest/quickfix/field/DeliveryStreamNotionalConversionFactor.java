/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DeliveryStreamNotionalConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41078;

  public DeliveryStreamNotionalConversionFactor() {
    super(41078);
  }

  public DeliveryStreamNotionalConversionFactor(BigDecimal data) {
    super(41078, data);
  }

  public DeliveryStreamNotionalConversionFactor(double data) {
    super(41078, BigDecimal.valueOf(data));
  }
}

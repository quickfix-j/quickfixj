/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegDeliveryStreamNotionalConversionFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41449;

  public LegDeliveryStreamNotionalConversionFactor() {
    super(41449);
  }

  public LegDeliveryStreamNotionalConversionFactor(BigDecimal data) {
    super(41449, data);
  }

  public LegDeliveryStreamNotionalConversionFactor(double data) {
    super(41449, BigDecimal.valueOf(data));
  }
}

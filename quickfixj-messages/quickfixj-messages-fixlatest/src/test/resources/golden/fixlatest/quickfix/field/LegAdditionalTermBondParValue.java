/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegAdditionalTermBondParValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41330;

  public LegAdditionalTermBondParValue() {
    super(41330);
  }

  public LegAdditionalTermBondParValue(BigDecimal data) {
    super(41330, data);
  }

  public LegAdditionalTermBondParValue(double data) {
    super(41330, BigDecimal.valueOf(data));
  }
}

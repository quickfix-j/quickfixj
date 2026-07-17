/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AdditionalTermBondParValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40014;

  public AdditionalTermBondParValue() {
    super(40014);
  }

  public AdditionalTermBondParValue(BigDecimal data) {
    super(40014, data);
  }

  public AdditionalTermBondParValue(double data) {
    super(40014, BigDecimal.valueOf(data));
  }
}
